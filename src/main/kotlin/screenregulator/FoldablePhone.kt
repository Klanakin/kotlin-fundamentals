package screenregulator

class FoldablePhone(isScreenLightOn: Boolean) : Phone(isScreenLightOn = isScreenLightOn) {

    private var isFolded: Boolean = true

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }

    override fun switchOn() {
        if (!this.isFolded) {
            super.switchOn()
        } else {
            super.switchOff()
        }
    }
}