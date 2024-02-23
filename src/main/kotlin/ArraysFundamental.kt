import java.util.Arrays

fun main(){
var words: Array<String> = arrayOf("Hello","Whats","Up?","Dude")
    for (i:Int in 0 until words.size){
        println(words[i])
    }
    println("Another way to print  array")
    var numbers= arrayOf(1,2,3,4,5)
    for (i in numbers){
        println(i)
    }
}
