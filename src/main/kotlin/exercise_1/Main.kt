package exercise_1


fun main(args: Array<String>) {
    var poSition: String ?= null
    var desiredSalary:Double ?= null
    var dateAvailable:String ?= null


//PERSONAL INFORMATION

    var lastName:String = ""
    var firstName:String = ""
    var middleName:String = ""
    var Address:String ?= null
    var ciTy:String ?= null
    var stAte:String ?= null
    var zIp:Int ?= null
    var homePhone:String?= null
    var cellPhone:String?= null
    var emailAddress:String ?= null
    var ssNumber:String ?= null
    var citizen:String ?= null
    var felony:String ?= null
    var preEmployment:String ?= null
    var aGe:Int = 0
    var a = "$lastName $firstName $middleName"
    val b = "\n $Address, $ciTy, $stAte, $zIp"
    val c = "\n$homePhone $cellPhone $emailAddress $ssNumber $citizen $felony $preEmployment"

    age(aGe)
    Education()
}

fun Education(){
    var schoolName:String = ""
    var schoolLocation:String = ""
    var yearsAttended:String = ""
    var degreeReceived:String = ""
    var maJor:String = ""
}

fun age(aGe:Int) {

    println("Age: $aGe ")
    when (aGe) {

        in 1..17 -> println("You are under age! You are not allowed to work ")
        in 18..60 -> println("You are allowed to work!")
        in 60..65 -> println("You are overage! Not allowed to work")
        else -> println("Incorrect Input")

    }

}





