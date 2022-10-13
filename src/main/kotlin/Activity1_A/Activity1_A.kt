package Activity1_A

import java.io.File
import java.time.LocalDateTime



fun main(){
    var current = LocalDateTime.now()
    var studentSectCourse:String ?= ""
    var studentFirstName:String = "" ;     var studentLastName:String = "" ;     var studentMiddleName:String = ""
    var studentsName:String = ("$studentFirstName $studentMiddleName $studentLastName")

    var studentStreetName:String ?= ""; var studentBarangayName:String ?= "";  var studentMunicipalityCity:String ?= ""
    var studentRegion:String ?= "" ; var studentCountry:String = ""

    var studentLocation:String = ("$studentStreetName, $studentBarangayName, $studentMunicipalityCity, $studentRegion, $studentCountry")
    var cellphoneNumber:String ?= ""
    var emailAddress:String ?= ""
    var parentsName:String ?= ""
    var parentsContactCP:Long ?= 0
    studentAge()
    studentFiles()
    studentGrades()
}

fun studentAge(){
    var studentAge:Int ?= 60 ;   var minorAgeRange = 0..17 ;     var majorAgeRange = 17..65
    if(studentAge in minorAgeRange){
        println("This person is Minor")     }
    else if(studentAge in majorAgeRange ){
        println("The age of this person is in legal age")     }
    else if (studentAge in 66..100){
        println("Not allowed Age")     }
    else{
        println("Error! Please insert the correct age")     }
}

fun studentFiles(){
    var fileAttendance = File("https://docs.google.com/forms/d/e/1FAIpQLSeTY5JxHi0dmOkxAEbLX8xoGXuUQSMwVsfXgGynofRHWxxKQw/viewform")
    val  exerCises = File("https://kodego.instructure.com/courses/146/pages/exercises")
    var practiveActivities = File("https://kodego.instructure.com/courses/146/pages/practice-activities")
    var studentReceivetheFiles:Boolean = true
    var studentStudytheFiles:Boolean = false

    if ((studentReceivetheFiles && studentStudytheFiles) == true ){
        println("They will pass the acadamic curriculum")
    }
    else if((studentReceivetheFiles || false) == true){
        println("They will not pass the Academic Curriculum")
    }
    else{
        println("Nothing")
    }
}

fun studentGrades(){
    var studentAssignmentsGrades:Int ?= null
    var studentActivitiesGrades:Int ?= null
    var studentQuizzes:Int ?= null
    var result1:Double = (studentQuizzes!!.times(0.30)) + (studentActivitiesGrades!!.times(0.40)) + (studentAssignmentsGrades!!.times(0.30))
    var studentFinalGrades:Double = (result1)

    if ((studentFinalGrades >= 75)&&(studentFinalGrades <= 100)) { println("The student Pass the Academic ") }
    else{ println("The student did not pass") }

}