package userprofile

// Name: Amanda
// Age: 33
// Likes to play tennis. Doesn't have a referrer.
//
// Name: Atiqah
// Age: 28
// Likes to climb. Has a referrer named Amanda, who likes to play tennis.

class Person(
    private val name: String,
    private val age: Int,
    private val hobby: String?,
    private val referrer: Person?) {

    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

        if (hobby != null) {
            print("Likes to $hobby.")
        }

        if (referrer != null) {
            print(" Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }
    }
}