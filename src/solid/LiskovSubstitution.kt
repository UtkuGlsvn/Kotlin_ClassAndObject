package solid

fun main() {
    //Essentially, we should be able to replace any instance of a parent class with that of a child class without anything breaking
    //Kodlarımızda herhangi bir değişiklik yapmaya gerek duymadan alt sınıfları, türedikleri(üst) sınıfların yerine kullanabilmeliyiz


    // example code ->https://jorgecasariego.github.io/solid-principles/

    //wrong
    val rectangle = Rectangle2()
    rectangle.setWidth(3)
    rectangle.setHeight(5)
    println(rectangle.getArea())

    val square = Square()
    square.setWidth(3)
    square.setHeight(5)
    println(square.getArea())

    //true

    val rectangle2 = Rectangle3()
    rectangle2.setWidth(3)
    rectangle2.setHeight(5)
    println(rectangle2.getArea())

    val square2 = Square2()
    square2.setDiameter(5)
    println(square2.getArea())
}
// Wrong

open class Rectangle2 {
    private var width: Int = 0
    private var height: Int = 0

    fun getArea(): Int {
        return width * height
    }
    open fun setWidth(width: Int) {
        this.width = width
    }
    open fun setHeight(height: Int) {
        this.height = height
    }
}

class Square : Rectangle2() {
    override fun setWidth(width: Int) {
        super.setWidth(width)
        super.setHeight(width)
    }

    override fun setHeight(height: Int) {
        super.setWidth(height)
        super.setHeight(height)
    }
}

//True

interface Shape2 {
    fun getArea(): Int
}

class Rectangle3: Shape2 {
    private var width: Int = 0
    private var height: Int = 0

    override fun getArea(): Int {
        return width * height
    }

    fun setWidth(width: Int) {
        this.width = width
    }

    fun setHeight(height: Int) {
        this.height = height
    }
}

class Square2: Shape2 {
    private var diameter: Int = 0

    override fun getArea(): Int {
        return diameter * diameter
    }

    fun setDiameter(diameter: Int) {
        this.diameter = diameter
    }
}