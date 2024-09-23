fun main() {
    val Steps = 4000
    val caloriesBurned = result(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
}

fun result(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}