package oop

class User(name:String): Human() {

    //Encapsulation
    var name:String? =name
        private set
        get
    private var gender:String?=null
    var age:Int?= null

    //Fix Kotlin Primary Constructor call expected
    constructor(name:String,age:Int,gender:String):this(name)
    {
        this.name=name
        this.age=age
        this.gender=gender
        println("constructor function $name $age")
    }

    //first call init than constructor
    init {
        println("init ...")
    }

}