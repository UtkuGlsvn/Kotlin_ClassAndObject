package solid

fun main() {
    //High-level modules should not depend on low-level modules. Both should depend on abstractions.
    //Sınıflar arası bağımlılıklar olabildiğince az olmalıdır
    //Yüksek seviyeli modüller, düşük seviyeli modüllere bağlı olmamalıdır. Her ikisi de abstract classlara bağlı olmalıdır.
}

//wrong

interface Yerba{
    fun getBrand(): String
}

class Kurupi: Yerba {
    override fun getBrand():String {
        return "Yerba Kurupi"
    }
}

class YerbaTest(val yerba: Kurupi) {
    fun getYerbaBrand():String{
        return yerba.getBrand()
    }
}

//True
interface Yerba2{
    fun getBrand(): String
}

class Kurupi2 {
    override fun getBrand():String {
        return "Yerba Kurupi"
    }
}

class YerbaTest(val yerba: Yerba2) {
    fun getYerbaBrand() {
        return yerba.getBrand()
    }
}