package exercise_1

import java.time.LocalDate
import java.time.Period
import java.util.Date
import java.lang.Double.parseDouble
import java.util.HashMap
import java.util.*

//You are tasked to automate an inventory system for a grocery.
//Identify the items that can be bought in a grocery store.
//After listing the different items, identify the characteristics of the items.
//You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.


var listOfItem:MutableList<String> = mutableListOf("Beverages, Bread/Bakery, Canned/Jarred Goods, Dairy," +
            " Dry/Baking Goods, Frozen Foods, Meat, Fruits/Vegerables, Cleaners, Office Goods, Personal Care, Others")

val beverageProduct = arrayOf("Water" , "Coffee", "Milk", "Juice", "Softdrink", "Tea", "Beer", "Wine", "Tanduay", "Emperador", "Gin")
var priceBeverage:Array<Long> = arrayOf(15, 10, 25, 20, 35, 18, 55, 68, 37, 49, 140)


var breadBakeryProduct = arrayOf("Whole Wheat, Cookies, Tortillas, Pies, Muffins, Bagels, Cake, Cheese Rolls ")
var cannedJarredGoods = arrayOf("Olives, Soup, Sika Tuna, Blue Bay Tuna, Corned Beef, Fruit Cocktail, Fried Sardines")
var dairyProduct = arrayListOf<String>("Milk, Yogurt, Cheese, Soy Milk, Butter, Creamier, Cream Cheese ")
var dryBakingGoods = arrayListOf<String>("Cereals, Flour, Sugar, Pasta, Mixes, Spaghetti, Macaroni, Noodles, White Rice, Oats, Wheat, Granola")
var frozenProducts = arrayListOf<String>("Fish, Ice Cream, Pizza, Ready Meals, Fruits, Vegetables, Waffles")
var meatProduct = arrayListOf<String>("Beef, Pork, Chicken, Lamb, Sausage, Tocino")
var fruitsVegetables = arrayListOf<String>("Banana, Apple, Grapes, Oranges, Strawberries, Avocados, Pineapples, Pears, Potatoes, tomatoes, Onions, Carrots, Lettuce, Broccoli, Peppers, Celery," +
            "Garlic, Cucumber, Kangkong, Squash, Pechay, Hoarse-raddish leaves, Raddish")
var cleanerItems = arrayListOf<String>("Zonrox, Ariel, Pride, Bar Soaps, Chlorine")


fun main() {


    var itemNumber: Int = 0
    var itemName: String = "Beer"
    var expirationDate:Date
    var quantityOfItem:Int = 900
    var itemSold:Int ?= null
    var itemPrice:Float = 000.000F

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
    var itemSold: Int = 3500
    var itemRemains = itemTotal!!.minus(itemSold!!).toInt()
    var result:Long = 0
    var priceBeverageLong:Array<Long> = priceBeverage

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









