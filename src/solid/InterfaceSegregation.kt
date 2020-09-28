package solid

fun main()
{
    //no client should be forced to depend on methods it does not use
    //Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmalıyız.
}
// wrong interface

interface NormalRobot {
    fun goToLocation(lat: Double, long: Double)
    fun wave()
}

//True interface

interface WavingRobot {
    fun wave()
}

interface MobileRobot {
    fun goToLocation(lat: Double, long: Double)
}