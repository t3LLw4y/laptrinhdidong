fun main() {


    val cities = listOf(
        Pair("Ankara", Pair(27, 31)),
        Pair("Tokyo", Pair(32, 36)),
        Pair("Cape Town", Pair(59, 64)),
        Pair("Guatemala City", Pair(50, 55))
    )


    cities.forEach { (city, temps) ->
        val (lowTemp, highTemp) = temps
        val rainChance = when (city) {
            "Ankara" -> 82
            "Tokyo" -> 10
            "Cape Town" -> 2
            "Guatemala City" -> 7
            else -> 0
        }
        printWeatherInfo(city, lowTemp, highTemp, rainChance)
    }
}

fun printWeatherInfo(city: String, lowTemp: Int, highTemp: Int, rainChance: Int) {
    println("City: $city")
    println("Low Temperature: $lowTemp°C, High Temperature: $highTemp°C")
    println("Rain Percentage: $rainChance%")
    println()
}