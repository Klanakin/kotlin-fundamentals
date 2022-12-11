package movieticket

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