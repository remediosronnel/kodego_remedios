package exercise_1



fun main(args: Array<String>) {
//PERSONAL INFORMATION

    var lastName:String = "Basilio      "
    var firstName:String = "Bubbles     "
    var middleName:String = "Parcon"
    var Address:String = "Purok 7, Poblacion"
    var ciTy:String = "Bayugan City"
    var stAte:String = "Caraga Region"
    var zIp:Int = 8965

    var homePhone:String?= "456-5897"
    var cellPhone:String?= "093798549645"
    var emailAddress:String= "hagorn_peranha@gmail.com"
    var ssNumber:String= "45K890A087D889"
    var citizen:String ?= "YES"
    var felony:String ?= "NO"
    var preEmployment:String ?= "YES"

    var a = "$lastName $firstName $middleName"
    val b = "\n $Address, $ciTy, $stAte, $zIp"
    val c = "\n$homePhone $cellPhone          $emailAddress  $ssNumber        $citizen             $felony           $preEmployment"

    println(a)
    println("Last Name   First Name    Middle Name")
    println(b)
    println("     Address            City            State    Zip")
    println(c)
    println("Telephone  Cellphone No.       Email Add                    SSS No.         US Citizen?     Are you?      Are you?")

    age()

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





