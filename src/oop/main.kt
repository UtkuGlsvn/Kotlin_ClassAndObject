package oop

fun main(args: Array<String>) {
    //user ->constructor and encapsulation
    val user = User("utkuglsvn", 1903,"male")
    val user2= User("utkuglsvn")
    println(user2.name)
    //animal -> inheritance
    println("------------inheritance------------")
    val animal=Animal("cat",2,"omnivore")
    animal.printMessage()
    val pet=Pet("cat",2,"omnivore","mavis")
    pet.name
    //Polymorphisim - static
    println("------------Polymorphisim static------------")
    println(addition(5))
    println(addition(5,9))
    println(addition(5,9,2))
    //Polymorphisim - dinamil
    println("------------Polymorphisim static------------")
    pet.printMessage()
    //Abstraction & Interface
    println("------------Abstraction & Interface ------------")
    user.readHuman()
    val guitar = Guitar(true)
    guitar.slowMusicFun()
    guitar.groupName()
    guitar.groupType()


}


fun addition(i: Int): Any? {
    return i
}
fun addition(a:Int, b:Int):Int
{
    return a+b
}

fun addition(a:Int, b:Int,c:Int):Int
{
    return a+b+c
}
