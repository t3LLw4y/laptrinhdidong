fun main(){

    val timeSpentToday = 300.23
    val timeSpentYesterday = 250.11
    println(compare(timeSpentToday, timeSpentYesterday))

    val timeSpentToday1 = 100.238916
    val timeSpentYesterday1 = 200.881
    println("today use more than yesterday: " + compare(timeSpentToday1, timeSpentYesterday1))

}

fun compare(today: Double, yesterday: Double): Boolean {
    return today > yesterday
}