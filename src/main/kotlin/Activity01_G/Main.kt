package Activity01_G


//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
//Scope :
//String
//Loops

fun main() {
    var result:Boolean = true
    var strInput = readLine()!!.toString().toLowerCase()

    var strInput2 = arrayOf(strInput)

    for(i in strInput.length - 1 downTo 0){
        if (strInput[i] == strInput[strInput.length - 1 - i]){

            println("Palindrome")

        }
        else{
            println("Not Palindrome")
        }
        break
    }

}