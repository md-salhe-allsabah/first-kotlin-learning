fun main()
{
    val sum = {
            a: Int  , b:Int -> a+b
    }

    val sub = {
            a: Int  , b:Int -> a-b
    }

    val mul = {
            a: Int , b: Int -> a*b
    }

    val div = {
            a:Int , b:Int -> a/b
    }

    val mod = {
            a:Int , b:Int -> a%b
    }

    val ops = arrayOf("sum" , "sub" , "mul" , "div" , "mod")
    val a = 10
    val b = 5

    fun operate(c: Int, d: Int, fn: (Int, Int) -> Int): Int {
        return fn(c, d)
    }

    for(op in ops)
    {
        when(op)
        {
            "sum" -> println("$a $op $b = ${operate(a,b,sum)}")
            "sub" -> println("$a $op $b = ${operate(a,b,sub)}")
            "mul" -> println("$a $op $b = ${operate(a,b,mul)}")
            "div" -> println("$a $op $b = ${operate(a,b,div)}")
            "mod" -> println("$a $op $b = ${operate(a,b,mod)}")

            else -> println("invalid operator")
        }
    }
}