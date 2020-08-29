package oop

open class Animal(gender:String,age:Int,typeNutrition:String) {

    var gender:String?=gender
    var age:Int?=age
    var typeNutrition:String?=typeNutrition

    open fun printMessage()
    {
        println("Animal class -> $gender - $age - $typeNutrition")
    }
}
