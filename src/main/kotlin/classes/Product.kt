package classes


open class Product constructor(
    private val name: String,
    private val price: Double,
) {

    fun getInfo(): Pair<String, Double> {
        return Pair(name, price)
    }
}
