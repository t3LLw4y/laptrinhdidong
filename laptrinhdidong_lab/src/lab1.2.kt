fun main() {

    val operatingSystem = "Chrome OS"
    val firstUserEmailId = "user_one@gmail.com"
    println(displayAlertMessage(operatingSystem, firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId)) // Pass  
    thirdUserEmailId to "email"
}

fun displayAlertMessage(os: String, email: String): String { // Function parameter is 'email'
    return "There's a new sign-in request on $os for your Google Account $email. "

}

