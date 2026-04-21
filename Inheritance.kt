fun main() {

    val list =
        mutableListOf(
            Rectangle() ,
            Square() ,
            Circle() ,
            Tringle()
        )

    for (item in list)
        item.draw()

    return
}