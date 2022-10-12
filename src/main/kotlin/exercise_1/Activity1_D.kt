package exercise_1
import com.sun.jdi.connect.Connector.IntegerArgument
import com.sun.jdi.connect.Connector.SelectedArgument
import java.awt.HeadlessException
import java.lang.NumberFormatException
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import  kotlin.Float.Companion.POSITIVE_INFINITY as inf



fun main() {
//    Create an application that will accept 5 monetary amounts.
//    After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//    The total of the 5  input will be divided by the answer in the second question input.
//    Note: Error checking must be done.

    println("Enter 5 Monetary Amounts")
    var numbersIn = 1..100000000000000000
    var amount1:Int = readln().toInt()
    var amount2:Int = readln().toInt()
    var amount3:Int = readln().toInt()
    var amount4:Int = readln().toInt()
    var amount5:Int = readln().toInt()

        if ((amount1 in numbersIn == true) and (amount2 in numbersIn == true) and (amount3 in numbersIn == true) and (amount4 in numbersIn == true) and (amount5 in numbersIn == true))
    {
        var quotientNumber = amount1!!.div(5).toFloat()
           print("Result: " + quotientNumber)
    }
        else{
        println("Wrong Input")
    }

}

//Another Version

//fun main() {
//
//    try {
//        var amount1: Int = readln().toInt() + readln().toInt() + readln().toInt() + readln().toInt() + readln().toInt()
//        var   quotient =  (amount1.div(5))
//        println(quotient)
//    }
//   catch (e: CharacterCodingException) {
//        println("Wrong Inputs, it should be amount")
//    }
//    catch (e: NumberFormatException){
//        println("Wrong Inputs, it should be amount")
//    }
//}






