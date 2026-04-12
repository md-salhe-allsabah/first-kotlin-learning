fun main() {
//    table
//    take input from user
//    print the table of that input number

    print("Enter a Number : ")
    val num: Int = readln().toInt()

//    for(i in 1..10) {
//        println("$num  * $i = ${num * i}") ;
//    }
//

//    var i: Int = 1 ;
//
//    while(i <= 10)
//    {
//        println("$num * $i  = ${num * i}")
//        i++
//    }

//    var i:Int = 1 ;
//
//    do {
//        println("$num * $i = ${num * i}")
//        i++
//    } while(i <= 10)

    (1..10).forEach { it -> println("$num * $it = ${num * it}") }

}