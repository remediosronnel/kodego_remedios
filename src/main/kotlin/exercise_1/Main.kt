package exercise_1




fun main(args: Array<String>) {
    var poSition: String = ""
    var desiredSalary:Double
    var dateAvailable:String = ""


//PERSONAL INFORMATION

    var lastName:String = ""
    var firstName:String = ""
    var middleName:String = ""
    var Address:String = ""
    var ciTy:String = ""
    var stAte:String = ""
    var zIp:Int = 8965

    var homePhone:String?= ""
    var cellPhone:String?= ""
    var emailAddress:String= ""
    var ssNumber:String= ""
    var citizen:String ?= ""
    var felony:String ?= ""
    var preEmployment:String ?= ""

    var a = "$lastName $firstName $middleName"
    val b = "\n $Address, $ciTy, $stAte, $zIp"
    val c = "\n$homePhone $cellPhone $emailAddress $ssNumber $citizen $felony $preEmployment"


    age()
    Education()
}

fun Education(){
    println("How many schools were you in: ")
    var schoolName:String = ""
    var schoolLocation:String = ""
    var yearsAttended:String = ""
    var degreeReceived:String = ""
    var maJor:String = ""
}

fun age() {

    val aGe: Int

    aGe = 19
    println("Age: $aGe ")
    when (aGe) {

        in 1..17 -> println("You are under age! You are not allowed to work ")
        in 18..60 -> println("You are allowed to work!")
        in 60..65 -> println("You are overage! Not allowed to work")
        else -> println("Incorrect Input")

    }

}





