package songcatalog

class Song(var title: String, var artist: String, var releasedYear: String, var playcount: Int) {

    var isPopular: Boolean = playcount > 1000

    fun printSongInfo() {
        println("$title, performed by $artist, was released in $releasedYear.")
        if (isPopular) {
            println("This song is very popular.")
        } else {
            println("This song is not popular.")
        }
    }
}