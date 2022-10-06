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
/*
fun Education(){
    println("How many schools were you in: ")
    var schools:Int = readlnOrNull()!!.toInt()
    var i:Int = 0

    while (i<=schools) {
        println("Enter your School Name: ");
        var schoolName: String = readln()
        println("Enter your Location: ");
        var schoolLocation: String = readln()
        println("Years Attended: ")
        var schoolYears: String = readln()
        println("Degree Attended: ")
        var degree: String = readln()
        println("Major in: ")
        var major: String = readln()
        i++
    }}*/

fun age(){

    var a:Int = 19
    var agE:String
    if(a >= 18){
        agE = "Allowed"
    }
    else{
        agE = "Not Allowed"
    }
    println("\nYour age $a is $agE to work here")
}














