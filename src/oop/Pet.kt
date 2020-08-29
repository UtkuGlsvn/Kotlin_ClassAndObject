package oop

class Pet(gender: String, age: Int, typeNutrition: String,name:String) : Animal(gender, age, typeNutrition) {

    var name:String?=name

    override fun printMessage()
    {
        println("Pet class -> $gender - $age - $typeNutrition - $name")
    }

    fun myPetName()
    {
        super.printMessage()
        println("name $name")
    }
}