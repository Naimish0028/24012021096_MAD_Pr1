//Class and Constructor Creation
class Car(
    private val type: String,
    private val model: String,
    private val price: Double,
    private val owner: String,
    private val milesDriven: Double
) {

    fun getCarInformation() {
        println("Type: $type")
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }

    fun getOriginalPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        // Depreciation based on miles driven
        val depreciation = milesDriven * 0.10
        return maxOf(0.0, price - depreciation)
    }

    fun displayCarInformation() {
        println("\n--- Car Information ---")
        getCarInformation()
        println("Original Price: ${getOriginalPrice()}")
        println("Current Price: ${getCurrentPrice()}")
    }
}

fun main() {

    val car = Car(
        type = "SUV",
        model = "Toyota Fortuner",
        price = 4000000.0,
        owner = "Rahul",
        milesDriven = 50000.0
    )

    car.displayCarInformation()
}
