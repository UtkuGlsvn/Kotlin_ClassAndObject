package solid

fun main()
{
    //A class should have one, and only one, reason to change.
    //Bir sınıf ve fonk tek sorumluluğu olmalı

    //Kod example -> https://blog.joshua-greenwood.com/the-solid-principles-and-kotlin/

    val robot=Robot("utku","a101")
    robot.printMessage()

    val robot2=Robot2("utku","a102")
    val robotPrinter=RobotPrinter()
    robotPrinter.printMessage(robot2)
}

//Wrong

class Robot(val name: String, val type: String) {

    fun printMessage() {
        println("Hello my name is $name, and I am a $type robot")
    }
}

//True

data class Robot2(val name: String, val type: String)

class RobotPrinter {
    fun printMessage(robot: Robot2) {
        val name = robot.name
        val type = robot.type
        println("Hello my name is $name and I am a $type robot")
    }
}
