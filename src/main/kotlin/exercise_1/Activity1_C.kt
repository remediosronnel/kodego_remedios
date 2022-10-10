package exercise_1

import java.time.LocalDate
import java.time.Period
import java.util.Date




var listOfItem:MutableList<String> = mutableListOf("Beverages, Bread/Bakery, Canned/Jarred Goods, Dairy," +
            " Dry/Baking Goods, Frozen Foods, Meat, Fruits/Vegerables, Cleaners, Office Goods, Personal Care, Others")

val beverageProduct = arrayOf("Water" , "Coffee", "Milk", "Juice", "Softdrink", "Tea", "Beer", "Wine", "Tanduay", "Emperador", "Gin")
var priceBeverage = arrayOf("P15", "P10","P25", "P20", "P35", "P18", "P55", "68", "37", "49", "P140")

var breadBakeryProduct = arrayOf("Whole Wheat, Cookies, Tortillas, Pies, Muffins, Bagels, Cake, Cheese Rolls ")
var cannedJarredGoods = arrayOf("Olives, Soup, Sika Tuna, Blue Bay Tuna, Corned Beef, Fruit Cocktail, Fried Sardines")
var dairyProduct = arrayListOf<String>("Milk, Yogurt, Cheese, Soy Milk, Butter, Creamier, Cream Cheese ")
var dryBakingGoods = arrayListOf<String>("Cereals, Flour, Sugar, Pasta, Mixes, Spaghetti, Macaroni, Noodles, White Rice, Oats, Wheat, Granola")
var frozenProducts = arrayListOf<String>("Fish, Ice Cream, Pizza, Ready Meals, Fruits, Vegetables, Waffles")
var meatProduct = arrayListOf<String>("Beef, Pork, Chicken, Lamb, Sausage, Tocino")
var fruitsVegetables = arrayListOf<String>("Banana, Apple, Grapes, Oranges, Strawberries, Avocados, Pineapples, Pears, Potatoes, tomatoes, Onions, Carrots, Lettuce, Broccoli, Peppers, Celery," +
            "Garlic, Cucumber, Kangkong, Squash, Pechay, Hoarse-raddish leaves, Raddish")
var cleanerItems = arrayListOf<String>("Zonrox, Ariel, Pride, Bar Soaps, Chlorine")


fun main(args: Array<String>) {


    var itemNumber: Int = 0
    var itemName: String = "Beer"
    var expirationDate:Date
    var quantityOfItem:Int = 900
    var itemSold:Int ?= null
    var itemPrice:Float = 000.000F

    expirationOfItem()
    priceProduct(itemName)
    itemNumberProcess(itemNumber, itemName, quantityOfItem)

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
fun itemNumberProcess(itemNumber:Int, itemName: String, quantityOfItem:Int){
    var listahanSaItem = arrayListOf(beverageProduct)
    var priceEachBeverage = arrayListOf(priceBeverage)

       print(itemNumber)
        var itemName = itemName
        var itemTotal:Int ?= quantityOfItem
        var itemSold:Int ?= 3500
        var itemRemains = itemTotal!!.minus(itemSold!!).toInt()


    when(itemName){
        listahanSaItem[0] -> priceEachBeverage[0] * itemTotal
        listahanSaItem[1] -> priceEachBeverage[1] * itemTotal
        listahanSaItem[2] -> print("$priceEachBeverage[2] * $itemTotal")
        listahanSaItem[3] -> print("$priceEachBeverage[3] * $itemTotal")
        listahanSaItem[4] -> print("$priceEachBeverage[4] * $itemTotal")
        listahanSaItem[5] -> print("$priceEachBeverage[5] * $itemTotal")
        listahanSaItem[6] -> print("$priceEachBeverage[6] * $itemTotal")
        listahanSaItem[7] -> print("$priceEachBeverage[7] * $itemTotal")
        listahanSaItem[8] -> print("$priceEachBeverage[8] * $itemTotal")
        listahanSaItem[9] -> print("$priceEachBeverage[9] * $itemTotal")
        listahanSaItem[10] -> print("$priceEachBeverage[10] * $itemTotal")

   }



}







