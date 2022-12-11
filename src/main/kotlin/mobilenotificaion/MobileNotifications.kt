package mobilenotificaion

val printNotificationSummary: (Int) -> Unit = {
    if (it < 99) {
        println("You have $it notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}