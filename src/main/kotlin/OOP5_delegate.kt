fun main(){

}

interface A {
    fun displayA()
}

interface B {
    fun displayB()
}

open class FirstDelegate: A{
    override fun displayA() {
        println("Interface A was implemented!")
    }

}

open class SecondDelegate: B{
    override fun displayB() {
        println("Interface B was implemented!")
    }

}

// In kotlin, by default you cannot inherit two classes
// But you can use delegate trick to do that
class App: A by FirstDelegate(), B by SecondDelegate(){
    override fun displayA() {
        TODO("Not yet implemented")
    }

    override fun displayB() {
        TODO("Not yet implemented")
    }
}
