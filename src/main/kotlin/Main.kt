fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val str:String="Hello World"
    println(str.substring(5))
    println(str.substring(0,5))
    println(str.substring(1,str.length-1))

}
