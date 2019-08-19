package com.car.maintin

                           // this is a simple object oriented design. we are sharing an interface with multiple classes as a style of structure.
interface CreditCard{
    val cardNumber:String

    fun score(age: Int)    //score should be input // this is a method
}

class MasterCard(override val cardNumber: String) : CreditCard{

    override fun score(age: Int) {

        if(age>50){
            println("Negative")
        }else{
            println("positive")
        }
    }
   fun print(){
       println("hello")
   }


}

class Visa(override val cardNumber: String) : CreditCard{

    override fun score(age: Int) {    // we are not returning anything

        if(age>60){
            println("Negative")
        }else{
            println("positive")
        }
    }

}

fun main(){
    val visa = Visa("546546354654")  //looks like we are calling the class here
    visa.score(60)

    val masterCard = MasterCard("43543543543534534") //this val is implementing this class of MasterCard
    masterCard.score(60)
}