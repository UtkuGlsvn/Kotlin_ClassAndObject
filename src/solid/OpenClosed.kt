package solid

fun main()
{
    //You should be able to extend a classes behavior, without modifying it.
    //Değişime kapalı, gelişime açık olmalı

    //example code -> https://github.com/androidrivernet/Kotlin-SOLID-Principles
    val areaManager= AreaManager()
    areaManager.calculateArea(5.0,6.7)
    val areaManager2= AreaManager2()
    areaManager2.calculateArea2(5.0,6.7)
}

//Wrong
data class Rectangle(val length: Double, val height: Double)

data class Circle(val radius: Double)


class AreaManager {
    fun calculateArea(vararg shapes: Double): Double {
        var area = 0.0
        for (shape in shapes) {
            if(shape is Rectangle)
            {
                val (length, height) = shape as Rectangle
                area += length * height
            }
            else if (shape is Circle) {
                val (radius) = shape as Circle
                area += radius * shape.radius * Math.PI
            } else {
                throw RuntimeException("Shape not supported")
            }
        }
        return area
    }
}
//True
//add interface

interface Shape {
    fun getArea(): Double
}

class AreaManager2 {

    fun calculateArea2(vararg shapes: Double): Double {
        var area = 0.0

        for (shape: Shape in shapes) {
            area += shape.getArea()
        }

        return area
    }
}