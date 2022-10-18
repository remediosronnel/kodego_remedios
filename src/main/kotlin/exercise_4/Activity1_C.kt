package exercise_4

import java.time.LocalDate
import java.time.Period
import java.util.Date



//You are tasked to automate an inventory system for a grocery.
//Identify the items that can be bought in a grocery store.
//After listing the different items, identify the characteristics of the items.
//You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.

//Global Declaration of Variables
var listOfItem:MutableList<String> = mutableListOf()
val beverageProduct = arrayOf<String>()
var priceBeverage:Array<Long> = arrayOf()

var breadBakeryProduct = arrayOf<String>()
var cannedJarredGoods = arrayOf<String>()
var dairyProduct = arrayOf<String>()
var dryBakingGoods = arrayOf<String>()
var frozenProducts = arrayOf<String>()
var meatProduct = arrayOf<String>()
var fruitsVegetables = arrayOf<String>()
var cleanerItems = arrayOf<String>()

fun main() {

           var itemNumber: Int = 0
    var itemName: String = ""
    var expirationDate:Date
    var quantityOfItem:Int = 0
    var itemSold:Int ?= null
    var itemPrice:Float ?= 000.000F

    expirationOfItem()
    priceProduct(itemName)
    itemNumberProcess(itemNumber, itemName, quantityOfItem, priceBeverage)

}
fun expirationOfItem(){

    if ( listOfItem == beverageProduct ){
        var expirationDateProduct = Period.of(3, 5, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }
    else if (listOfItem == breadBakeryProduct){
        var expirationDateProduct = Period.of(5, 0, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }

    else if (listOfItem == cannedJarredGoods){
        var expirationDateProduct = Period.of(4, 9, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }

    else if (listOfItem == dairyProduct ){
        var expirationDateProduct = Period.of(2, 6, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }

    else if (listOfItem == dryBakingGoods ){
        var expirationDateProduct = Period.of(3, 11, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }

    else if (listOfItem == frozenProducts ){
        var expirationDateProduct = Period.of(0, 11, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }

    else if (listOfItem == meatProduct){
        var expirationDateProduct = Period.of(0, 6, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }

    else if (listOfItem == fruitsVegetables ){
        var expirationDateProduct = Period.of(1, 0, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }

    else if (listOfItem == cleanerItems){
        var expirationDateProduct = Period.of(5, 3, 20)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

        if(itemManufacturing == modifiedDate){
            println("It's expired!! Time to withdraw the products")   }
        else{ println("Nothing Expires!!!")   } }

}

fun priceProduct(itemName:String){

    when (itemName){
        beverageProduct[0]-> {println(priceBeverage[0])}
        beverageProduct[1]-> {println(priceBeverage[1])}
        beverageProduct[2]-> {println(priceBeverage[2])}
        beverageProduct[3]-> {println(priceBeverage[3])}
        beverageProduct[4]-> {println(priceBeverage[4])}
        beverageProduct[5]-> {println(priceBeverage[5])}
        beverageProduct[6]-> {println(priceBeverage[6])}
        beverageProduct[7]-> {println(priceBeverage[7])}
        beverageProduct[8]-> {println(priceBeverage[8])}
    }

}
fun itemNumberProcess(itemNumber:Int, itemName: String, quantityOfItem:Int, priceBeverage:Array<Long>) {
    var listahanSaItem = arrayListOf(beverageProduct).toString()

    var priceEachBeverage = arrayOf(priceBeverage)

    print(itemNumber)
    var itemName1 = itemName
    var itemTotal: Int = quantityOfItem
    var itemSold: Int = 0
    var itemRemains = itemTotal!!.minus(itemSold!!).toInt()
    var result:Long = 0
    var priceBeverageLong:Array<Long> = priceBeverage
    result as Int

//    Predict the product remaining in cost
    when (itemName1) {
        listahanSaItem[0].toString() -> result = (priceBeverageLong[0] * itemRemains)
        listahanSaItem[1].toString() -> result = (priceBeverageLong[1] * itemRemains)
        listahanSaItem[2].toString() -> result = (priceBeverageLong[2] * itemRemains)
        listahanSaItem[3].toString() -> result = (priceBeverageLong[3] * itemRemains)
        listahanSaItem[4].toString() -> result = (priceBeverageLong[4] * itemRemains)
        listahanSaItem[5].toString() -> result = (priceBeverageLong[5] * itemRemains)
        listahanSaItem[6].toString() -> result = (priceBeverageLong[6] * itemRemains)
        listahanSaItem[7].toString() -> result = (priceBeverageLong[7] * itemRemains)
        listahanSaItem[8].toString() -> result = (priceBeverageLong[8] * itemRemains)
        listahanSaItem[9].toString() -> result = (priceBeverageLong[9] * itemRemains)
        listahanSaItem[10].toString() -> result = (priceBeverageLong[10] * itemRemains)

    }
    println(result)

}









