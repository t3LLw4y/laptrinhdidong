fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(os: String, email: String): String {
    return "Alert! This device ($os) may not be compatible with your primary email ($email). \nPlease ensure you have access to your email on this device."
}