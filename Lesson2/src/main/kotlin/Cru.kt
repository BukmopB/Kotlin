enum class Cru(val level: Int) {
    GRAND(100), PREMIER(90), BASE(80);

    override fun toString() = when(this) {
        BASE -> "Base 80"
        PREMIER -> "Premier 90"
        GRAND -> "Grand 100"
    }
}