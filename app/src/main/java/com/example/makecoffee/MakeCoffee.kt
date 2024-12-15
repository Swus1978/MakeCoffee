package com.example.makecoffee

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main() {
    val coffeeForJuan = CoffeeDetails(sugarCount = 0, name = "Juan", size = "xxl", creamAmount = 0)
    println(coffeeForJuan)

    // Ask for user input
    val coffeeDetails = askCoffeeDetails()
    makeCoffee(coffeeDetails.sugarCount, coffeeDetails.name, coffeeDetails.creamAmount)
}



fun askCoffeeDetails(): CoffeeDetails {
    print("Enter your name: ")
    val name = readln()

    print("How many spoons of sugar do you want? ")
    val sugarCount = readln().toInt()

    print("Enter the size of the coffee (small/medium/large): ")
    val size = readln()

    print("How much cream do you want? ")
    val creamAmount = readln().toInt()

    // Return the CoffeeDetails object
    return CoffeeDetails(sugarCount, name, size, creamAmount)
}

fun makeCoffee(sugarCount: Int, name: String, creamAmount: Int) {
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar and $creamAmount cream for $name.")
    } else if (sugarCount in 2..30) {
        println("Coffee with $sugarCount spoons of sugar and $creamAmount creams for $name.")
    } else {
        println("Coffee with no spoons of sugar or cream for $name.")
    }
}
