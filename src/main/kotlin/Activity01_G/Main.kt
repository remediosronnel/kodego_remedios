package Activity01_G

import mu.KotlinLogging
import javax.print.attribute.IntegerSyntax


private val logger = KotlinLogging.logger{}

//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
//Scope :
//String
//Loops

fun main() {

    var strInput = readLine()!!.toString()
    var strInput2 = arrayOf(strInput).toString()
    if ((strInput == null) || (strInput == "")) {
        logger.info{"You did not enter correctly"}
    }
    else{
        for (i in strInput.length - 1 downTo 0) {
            if (strInput[i] == strInput[strInput.length - 1 - i]) {
                logger.info { "Palindrome" }
            } else {
                logger.info { "Not Palindrome" }
            }            ; break
        }    }
}