fun main() {
    var max: Int = getMaxNumber(16, 16)
    println("Max number ${max}")

    println(checkPalindrome("levels"))
}

var max: Int = 0
fun getMaxNumber(a: Int, b: Int): Int {
    if (a != null && b != null) {
        if (a > b)
            max = a
        else
            max = b
    }
    return max
}

fun checkPalindrome(input: String): Boolean {
    var isPalindrome: Boolean = false
    if (input != null) {
        // Pointer for the beginning of the string
        var i:Int=0
        var j:Int=0
        var message:String=""
        // Convert the string to lowercase to ignore case sensitivity
        message=input.toLowerCase()
        // Pointer for the end of the string
        j=message.length-1

        while (i < j) {
            // If characters at current pointers don't match, it's not a palindrome
            if (message[i] != message[j]) {
                isPalindrome= false
                return isPalindrome
            }

            // Move the pointers towards each other
            i++
            j--
        }
        isPalindrome= true
        return isPalindrome

    }else{
        isPalindrome=false
        return isPalindrome
    }
    return isPalindrome

}





