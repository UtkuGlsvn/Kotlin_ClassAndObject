package oop

class Guitar(override var slowMusic: Boolean) : MusicBand,Instrumant {

    override fun groupName() {
        println("group name: bjk rock")
    }

    override fun groupType() {
        println("group type: slow rock")
    }

//    override var slowMusic: Boolean
//        get() = false
//        set(value) {}

    override fun slowMusicFun() {
        println("slow Music: $slowMusic")
    }


}