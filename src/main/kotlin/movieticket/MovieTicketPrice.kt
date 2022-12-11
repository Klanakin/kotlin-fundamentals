package movieticket

// val child = 5
// val adult = 28
// val senior = 87
// val isMonday = true
// println("The movie ticket price for a person aged $child is  \$${ticketPrice(child, isMonday)}.")
// println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
// println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")

fun calcTicketPrice(moviegoer: Int, isMonday: Boolean): Int {
    if (moviegoer <= 12) {
        return 15
    }
    if (moviegoer in 13..60 && isMonday) {
        return 25
    }
    if (moviegoer in 13..60) {
        return 30
    }
    if (moviegoer in 61..100) {
        return 20
    }
    else return -1
}