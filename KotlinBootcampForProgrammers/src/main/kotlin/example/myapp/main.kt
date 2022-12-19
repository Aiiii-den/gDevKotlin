package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    //Constructor part of tutorial
    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()
    aquarium5.volume = 70
    aquarium5.printSize()

    //Subclass part
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    buildAquarium()
}