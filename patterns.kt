fun main() {

    println("033c")
    println("enter a +ve integer : ")
    val n: Int = readln().toInt()

    for(i in 1..n)
    {
        for(j in 1..i)
        {
            print("*")
        }

        println("")
    }
}