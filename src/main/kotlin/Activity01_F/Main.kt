package Activity01_F
import mu.KotlinLogging


private val logger = KotlinLogging.logger{}
//Create an application that will accept 2 string inputs.
//Your application will print all unique characters in both Strings.
//Scope :
//String
//Loops

fun main() {

    var strInputs = readLine()!!.toCharArray()
    var strInputs1 = readLine()!!.toCharArray()
    var intersArray = strInputs.union(strInputs1.distinct())

    for (i in intersArray.indices){
        logger.info{intersArray.toCharArray()[i]}
    }
}



