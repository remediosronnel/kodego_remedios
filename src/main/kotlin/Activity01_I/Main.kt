package Activity01_I

import mu.KotlinLogging
import java.time.LocalDate
import java.time.Period

private val logger = KotlinLogging.logger{}

//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
//Scope :           //Data Structures

fun main() {
//    Student Information
    var scienceBook:Map<Int, String> = mutableMapOf((1 to "Physics"), (2 to "Earth Science"), (3 to "Biology"), (4 to "Chemistry"),
        (5 to "General Science"), (6 to "Astronomy"))
    var indexAuthor1 = linkedMapOf<Int, String>(1 to "Michael Bolton", 2 to "Bubbles Schnider", 3 to "Resitas Absuelto", 4 to "Abner Romero",
                        5 to "Lolita Santos", 6 to "Robredo")
    var groupNameOfBooks = arrayListOf(scienceBook.map { indexAuthor1 })

    var mathBook:Map <Int, String> = mutableMapOf((1 to "General Math"), (2 to "Business Math"), (3 to "Algebra"), (4 to "Trigonometry"),
        (5 to "Caluculus"), (6 to "Analytic Geometry"), (7 to "Discrete Math"))
    var indexAuthor2 = linkedMapOf<Int, String>(1 to "Halita Gomez", 2 to "Memorias Robertz", 3 to "Suez Ramirez", 4 to "Luzviminda Villanueva",
                        5 to "Arnel Lapidez", 6 to "Angelou Delatore", 7 to "Michelle Lamela")

    logger.info{"Enter your Account Name: "}
    var nameOfLibrarian: String ?= readLine()
    logger.info { "Enter your password: " }
    var employeePassword:String ?= readLine()
    var passwordInString = "ronnelremedios"
    var accountName = "ronnel remedios"



//Librarian Enter the Ssytem
    if ((employeePassword == passwordInString) && (nameOfLibrarian == accountName)) {
        logger.info { "Search the Book you wanted to borrow: " }
        var bookBorrowName: String = readln()
        var bookIDNumber: Int = readlnOrNull()!!.toInt()

        for (entry in scienceBook) {
            when (bookIDNumber) {
                1 -> {
                    logger.info { "Book Title: ${scienceBook.value} -> Book Number: ${scienceBook.key}" }
                }

                2 -> {
                    groupNameOfBooks[1]
                }

                3 -> {
                    groupNameOfBooks[2]
                }


                else -> {
                    logger.info { "sss" }
                }

            }

        }
    }
    else
        {
        logger.info("Invalid Entry!")
        }
    }


fun bookReturn(){
    var period = Period.of(0, 0, 3) ; var todayDate = LocalDate.of(2022, 10, 9)
    var modifiedDate = todayDate.plus(period)

    if(LocalDate.now() >= modifiedDate){
        println("Please return the book")
    }
    else{
        println("Please continue reading")
    }


}

fun bookStatus(bookTitle:String, authorName:String, bookSubject:String){

    var nameOfBook:String = bookTitle
    var subjectBook = arrayOf("Math", "Biology", "Social Science", "English 101", "Philippine Literature")
    var subjectBoolean1 = arrayOf(true, false, true, true, false)


}
