package exercise_1

import java.io.File


fun main(){
    var studentSectCourse:String = ""
    var studentFirstName:String = "" ;     var studentLastName:String = "" ;     var studentMiddleName:String = ""
    var studentsName:String = ("$studentFirstName $studentMiddleName $studentLastName")

    var studentStreetName:String = ""; var studentBarangayName:String = "";  var studentMunicipalityCity:String = ""
    var studentRegion:String = "" ; var studentCountry:String = ""

    var studentLocation:String = ("$studentStreetName, $studentBarangayName, $studentMunicipalityCity, $studentRegion, $studentCountry")
    var cellphoneNumber:Long = 0
    var emailAddress:String = ""
    var parentsName:String = ""
    var parentsContact:Long = 0
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
    var studentAssignmentsGrades:Float= 00.0F
    var studentActivitiesGrades:Float = 00.0F
    var studentQuizzes:Float = 00.0F
    var studentFinalGrades:Float = 00.0F

    if (studentFinalGrades >= 75) { println("The student Pass the Academic ") }
    else{ println("The student did not pass") }

}