fun main() {
    //val input: Int = readln().toInt()
    //println("You entered ${input}")
    //println(input.length)
    //println(input.toUpperCase())
    //println(input - 1)
    println("Enter your age - ")
    //var age: String ? = readln()
    var age: String? = null
    //var age: String? = "50"
    if (age != null && !age.isEmpty()) {
        println("Result ${checkAdult(age.toInt())}")
    } else {
        println("Include null - " + age)
    }
    //println(age?.toInt() ?: "Can not convert to integer")
    println("Safe call " + age?.toInt())
    age?.let {
        println("Line 1")
        println("Line 2  ${age.toInt()}")
        println("Line 3 ${it}")
    }
    (age)?.toInt()?.let {
        println("Line 1")
        println("Line 2  ${age.toInt()}")
        println("Line 3 ${it}")
    }
    //elvis operator
    println(age?.toInt() ?: "NA")
}

fun checkAdult(input: Int): String {
    if (input > 18)
        return "You are adult now."
    else
        return "You are not adult yet."
}