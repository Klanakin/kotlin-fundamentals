import mobilenotificaion.printNotificationSummary
import movieticket.calcTicketPrice
import screenregulator.FoldablePhone
import screenregulator.Phone
import songcatalog.Song
import temparatureconverter.printFinalTemperature
import userprofile.Person

fun main() {

//    val morningNotification = 51
//    val eveningNotification = 135
//    printNotificationSummary(morningNotification)
//    printNotificationSummary(eveningNotification)
//
//    println()
//
//    val child = 5
//    val adult = 28
//    val senior = 87
//    val isMonday = true
//    println("The movie ticket price for a person aged $child is  \$${calcTicketPrice(child, isMonday)}.")
//    println("The movie ticket price for a person aged $adult is \$${calcTicketPrice(adult, isMonday)}.")
//    println("The movie ticket price for a person aged $senior is \$${calcTicketPrice(senior, isMonday)}.")
//
//    println()
//
////    27.0 degrees Celsius is 80.60 degrees Fahrenheit.
////    350.0 degrees Kelvin is 76.85 degrees Celsius.
////    10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
//
//    printFinalTemperature(
//        initialMeasurement = 27.0,
//        initialUnit = "Celsius",
//        finalUnit = "Fahrenheit"
//    ) {
//        it * 9/5 + 32
//    }
//
//    printFinalTemperature(
//        initialMeasurement = 350.0,
//        initialUnit = "Kelvin",
//        finalUnit = "Celsius"
//    ) {
//        it - 273.15
//    }
//
//    printFinalTemperature(
//        initialMeasurement = 10.0,
//        initialUnit = "Fahrenheit",
//        finalUnit = "Kelvin"
//    ) {
//        5.0/9.0 * (it-32.0) + 273.15
//    }
//
//    println()
//
//    val single = Song(
//        title = "Home",
//        artist = "Micheal Buble",
//        releasedYear = "2009",
//        playcount = 143000000
//    )
//    single.printSongInfo()
//
//    println()
//
//    val amanda = Person("Amanda", 33, "play tennis", null)
//    val atiqah = Person("Atiqah", 28, "climb", amanda)
//
//    amanda.showProfile()
//    println()
//    atiqah.showProfile()
//
//    println()

    val regularPhone: Phone = Phone(isScreenLightOn = false)
    regularPhone.switchOn()
    regularPhone.checkPhoneScreenLight()

    val foldablePhonePhone: Phone = FoldablePhone(isScreenLightOn = true)
    foldablePhonePhone.switchOn()
    foldablePhonePhone.checkPhoneScreenLight()
}

