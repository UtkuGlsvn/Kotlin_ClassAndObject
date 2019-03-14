//interface
interface Iclass
{
    fun Iclassfun()
    {
        println("Interface Class")
    }
}
//inheritance
open class Vehicle
{

    var motorGucu:Int=0

    init {
        this.motorGucu=motorGucu
    }

    open fun setMotorGuc(motorGucu: Int): Int {
         this.motorGucu=motorGucu
        return this.motorGucu
    }
}

//abstract
abstract class Human(_name:String){
    private var name:String =_name

    abstract fun nameHuman(name:String)
    fun yourName()
    {
        println("name: ${this.name}")
    }
}

class Personel(_name:String): Human(_name)
{
    override fun nameHuman(name: String) {
        println("name: $name")
    }


}
    class Car(_hız:Int, _plaka:String): Vehicle(), Iclass
{
    override fun Iclassfun() {
        super.Iclassfun()
        println("overriding")
    }
    //getter and setter
    var hız:Int=_hız
        get() = field
        set(hız){field=hız}

    var plaka:String=_plaka
        get()=field
        set(plaka){field=plaka }
    val maxHız=120
        get()=field
    //Primary Constructor
    init {
        this.hız=_hız
        this.plaka=_plaka
        println("hız:$hız plaka:$plaka maximum Hız: $maxHız $motorGucu")
    }

    //Overriding Method
    override fun setMotorGuc(motorGucu: Int): Int {
         this.motorGucu=motorGucu/2
         return this.motorGucu
    }

    class CarType(_type:String,_model:Int)
    {

        var type: String = _type
            get() = field
            set(type){field=type}
        var model: Int=_model
            get() = field
            set(model){field=model}
        //seconder constructor
        constructor(type: String,model: Int,hız: Int,plaka: String) : this(type,model) {
            println("Arabanın plakası $plaka hızı $hız modeli $model arabanın tipi $type")
        }
    }
}

fun main(args : Array <String>)
{
    var car1 = Car(25,"06 A 06")
    var v = Vehicle()
    var personel = Personel("admin")
    println(car1.hız.toString()+"    "+car1.plaka+"   "+car1.maxHız)
    var cartype=Car.CarType("Range Rover",2005)
    var cartype2=Car.CarType("Range Rover",2005,50,"06 ab 07")
    println(cartype.type+"   "+cartype.model)
    println(v.setMotorGuc(50))
    println(car1.setMotorGuc(50))
    println(personel.yourName())
    println(personel.nameHuman("utku"))

}




