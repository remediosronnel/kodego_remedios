package Activity01_H
import mu.KotlinLogging


private val logger = KotlinLogging.logger{}



//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from the lower number up to the largest number.
//Scope :
//String
//Loops

fun main() {

        var inputInteger: Int = readLine()!!.toInt()
        var inputInteger2: Int = readLine()!!.toInt()
        var arrayInputs: Array<Int> = arrayOf(inputInteger, inputInteger2).sortedArray()

        if (inputInteger < inputInteger2) {
                var maxNumber = inputInteger
                var minNumber = inputInteger2
                for (index in arrayInputs) {
                        if (index % 2 == 1)  {
                                println(arrayInputs)

                        }

                        else {
                                println(arrayInputs)

                        }

                }


        }
        else{

        }

}







