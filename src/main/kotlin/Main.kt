fun main() {
    var banker=Banker ("Jemima",20)
    banker.introduction()
    banker.talk("I am going to Kisumu")
    banker.sleep()
    println( banker.countMoney(arrayOf(1000,200,100,500,50)))
    var doctor=Doctor("Naomi",28,"female")
    doctor.introduction()

    println(doctor. gender)
    doctor.eat()
    doctor.sleep()

    doctor.talk("When did you start feeling this way?")
    doctor.treatPatient("Wambui","Flu")
    var farmer= Farmer("Wangeci",22)
    farmer.introduction()
    farmer.eat()
    farmer.talk("The rains are coming")
    farmer.sleep()
    farmer.cultivateLand()
}
open class Person(var name: String,var age: Int){
    fun talk(words:String){
        println(words)
    }
    open fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzzz")
    }
    open fun introduction(){
        println("Hey my name is $name")
    }


}
class Banker( name: String,age: Int): Person(name,age){

    fun countMoney(notes:Array<Int>): Int{
        return notes.sum()
    }
}
class Doctor( name: String,age:Int, var gender:String):Person(name,age){

    fun treatPatient(patientName: String,disease:String){
        println("treat $patientName for $disease")
    }

    override fun introduction() {
        println("Hey my name is Dr. $name")
//        super.introduction()
    }

}
class Farmer(name: String,age:Int): Person(name,age){
    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
   super.eat()
        println("I am eating cassava from my farm")
    }
}