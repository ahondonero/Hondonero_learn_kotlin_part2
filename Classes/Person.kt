// Write your class below 
class Person(val name: String, val age: Int, val favoriteColor: String){
  
}


fun main() {
  // Create your instances below 
  val me = Person("Joey", 20, "Black")
  val myFriend = Person("Natasha", 20, "Pink")

  println("${me.name} is ${me.age} years old and his favorite color is ${me.favoriteColor}.")
  println("${myFriend.name} is ${myFriend.age} years old and her favorite color is ${myFriend.favoriteColor}.")
}