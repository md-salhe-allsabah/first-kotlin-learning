open class Shapes {
    open fun draw()
    {
        println("Draw a shape")
    }
}

class Circle : Shapes() {
    override fun draw(){
        println("Drawing a Circle")
    }
}

class Square : Shapes() {
    override fun draw(){
        println("Drawing a Square")
    }
}

class Rectangle : Shapes() {
    override fun draw(){
        println("Drawing a Rectangle")
    }
}

class Tringle : Shapes() {
    override fun draw(){
        println("Drawing a Tringle")
    }
}