fun main() {

    println("result is ${add()}")

//    println("result is ${add()}")
//    println("result is ${add(b=0)}")
//    println("result is ${add(b=1, a = 6)}")


}

fun add(a:Int = 0, b:Int = 10): Int {

    return (a+b)
}

fun add(): Int {

    println("Enter a number : ")
    val a = readln().toInt()

    println("Enter a number : ")
    val b = readln().toInt()


    return (a+b)
}