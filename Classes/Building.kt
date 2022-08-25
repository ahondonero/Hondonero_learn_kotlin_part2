class Building {
  val yearBuilt = 2016
  val height = 400 // Feet
  val type = "Limestone"
}

fun main() {
  // Write your code below 🏙
  val residentialBuilding = Building()

  println(residentialBuilding.yearBuilt)
  println(residentialBuilding.height)
  println(residentialBuilding.type)

  val commercialBuilding = Building()
  println(commercialBuilding.yearBuilt)
  println(commercialBuilding.height)
  println(commercialBuilding.type)
}

