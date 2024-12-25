fun main() {

    val ivan = Student("Ivan",20)
    ivan.age // getter
    ivan.lastname // getter
    ivan.lastname = "Ivanov"

    var a: Int = 100
    var b = 200

    println("${(a*100-5)*2} $b")

    println("Hello World $a")

  //  val(x,y,z,p) = readln().split(" ").map { it.toInt() }
    val res = sum(1,2)
    if(a>=b) {
        a = b
    }else if(a<=b) {
        b = a
    }
    // switch case

    when(a) {
        1 -> { println("1") }
        2,3 ->println("123")
        else -> println("error")
    }
    when {
        a>=b -> { println("2") }
        (a>=b && b==3) -> { println("31") }
        else -> { println("3") }
    }
    val result = when(a) {
        1 -> 8
        else -> 100
    }
    val numbers = 1..<10
    when(a) {
        in numbers -> { println("1") }
        !in numbers -> { println("2") }
    }


    var abc: String? = "sdlfgjadfkgadfg"
  //  abc = null
    println(abc?.length)


    if(abc!=null){
        println(abc.length)
    } else {
        //
    }
    // elvis expression
    println(abc?.length ?: "Что-то адекватное!")

    // лямбда выражение, анонимная функция
    var f1 : (Int, Int) -> Int = { x, y ->
        val r = 100*x*y-200
        r
    }
    val f2 : (Int, Int) -> Int = fun(x: Int, y: Int) : Int {
        val res = 100*x*y
        return res
    }
    println(f1(1,2))
    println(f2(100,200))
    f1 = ::sum

    val res2 = superfunc(2,3,f1)
    println(res2(4,2))
}
fun sum(a: Int,b: Int) : Int {
    return a+b
}
fun mult(a: Int, b: Int) = a*b

fun superfunc(a: Int, b: Int, c: (x: Int, y: Int) -> Int) : (Int, Int) -> Int {
    when(a) {
        4 -> return c
        5 -> return { x, y -> 600*(x+y)}
        else -> return ::mult
    }
}