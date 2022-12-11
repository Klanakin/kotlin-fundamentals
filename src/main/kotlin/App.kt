import mobilenotificaion.printNotificationSummary
import movieticket.calcTicketPrice

fun main() {

    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

    println()

    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("The movie ticket price for a person aged $child is  \$${calcTicketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${calcTicketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${calcTicketPrice(senior, isMonday)}.")

}

