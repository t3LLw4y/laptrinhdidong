fun main() {
    println("Hello, world!")
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    var discountPercentage: Int = 0
    var offer: String = ""
    var item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage discount on $item Hurry up!"

    println(offer)

    var numberOfAdults = 20
    var numberOfKids = 30
    var total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive " +
            "a total of $totalSalary (additional bonus).")

    val firstNumber = 10
    val secondNumber = 5
    var result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}