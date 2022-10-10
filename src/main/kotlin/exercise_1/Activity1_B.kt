package exercise_1


import java.time.*

fun main() {


//    Student Information
    var nameOfBorrower: String = ""
    var studentIDNo: String = ""
    var studentCourse: String = ""
    var studentDepartment: String = ""
    var studentCollege: String = ""

//    Book Information
    var bookIDNumber: Int? = null
    var bookSubject: String = ""
    var bookTitle: String = ""
    var authorName: String = ""
    var nameOfPublisher: String = ""
    var copyRightfortheBook: String = ""
    var editionNumber: Int? = null
    var isbnofBook: Int? = null
    var shelfNumberBook: Int? = null

    var newBookIdNumber = bookIDNumber.toString()
    var bookIDTypeCast = newBookIdNumber as String



    if (bookIDTypeCast is String) {
        println("String ID Number: $bookIDTypeCast")
    } else {
        println("Integer ID Number: $bookIDTypeCast")
    }

    bookReturn()
}

fun bookReturn(){
    var period = Period.of(0, 0, 3)
    var todayDate = LocalDate.of(2022, 10, 9)
    var modifiedDate = todayDate.plus(period)

    if(LocalDate.now() >= modifiedDate){
        println("Please return the book")
    }
    else{
        println("Please continue reading")
    }




}

