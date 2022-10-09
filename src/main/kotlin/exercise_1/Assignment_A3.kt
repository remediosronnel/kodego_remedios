package exercise_1

import com.sun.jdi.FloatType
import java.text.DateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.util.Date
    val listOfItem:MutableList<String> = mutableListOf("Beverages, Bread/Bakery, Canned/Jarred Goods, Dairy," +
            " Dry/Baking Goods, Frozen Foods, Meat, Fruits/Vegerables, Cleaners, Office Goods, Personal Care, Others")

var beverageProduct = listOf<String>("Water, Coffee, Milk, Juice, Softdrink, Tea, Beer, Wine, Tanduay, Emperador, Gin")
var breadBakeryProduct = listOf<String>("Whole Wheat, Cookies, Tortillas, Pies, Muffins, Bagels, Cake, Cheese Rolls ")
var cannedJarredGoods = listOf<String>("Olives, Soup, Sika Tuna, Blue Bay Tuna, Corned Beef, Fruit Cocktail, Fried Sardines")
var dairyProduct = listOf<String>("Milk, Yogurt, Cheese, Soy Milk, Butter, Creamier, Cream Cheese ")
var dryBakingGoods = listOf<String>("Cereals, Flour, Sugar, Pasta, Mixes, Spaghetti, Macaroni, Noodles, White Rice, Oats, Wheat, Granola")
var frozenProducts = listOf<String>("Fish, Ice Cream, Pizza, Ready Meals, Fruits, Vegetables, Waffles")
var meatProduct = listOf<String>("Beef, Pork, Chicken, Lamb, Sausage, Tocino")
var fruitsVegetables = listOf<String>("Banana, Apple, Grapes, Oranges, Strawberries, Avocados, Pineapples, Pears, Potatoes, tomatoes, Onions, Carrots, Lettuce, Broccoli, Peppers, Celery," +
            "Garlic, Cucumber, Kangkong, Squash, Pechay, Hoarse-raddish leaves, Raddish")
var cleanerItems = listOf<String>("Zonrox, Ariel, Pride, Bar Soaps, Chlorine")


fun main(args: Array<String>) {
    var itemNumber: Int? = null;
    var itemName: Int? = null
    var expirationDate:Date
    var quantityOfItem:Int ?= null
    var itemSold:Int ?= null
    var itemPrice:Float = 000.000F





}
fun expirationOfItem(){
    if ( listOfItem == beverageProduct ){
        var expirationDateProduct = Period.of(3, 5, 0)
        var itemManufacturing = LocalDate.of(2022, 10, 9)//Considering the Date of purchase is today
        var modifiedDate = itemManufacturing.plus(expirationDateProduct)

    }

}
fun priceproduct(){


}
fun itemNumber(){

}



