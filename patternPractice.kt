fun main() {
//    *
//    **
//    ***
//    ****

    print("Enter a number : ")
    val num: Int = readln().toInt()
    println()

    for(i in 1..num) {

        for(j in 1..i) {
            print("*")
        }

        println()
    }

}