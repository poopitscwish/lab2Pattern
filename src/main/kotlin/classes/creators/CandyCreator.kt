package classes.creators

import classes.Agent
import classes.products.Candy
import classes.Product

class CandyCreator(name: String): Agent(name) {

    override fun cook(): Product {
        return Candy("Конфеты", 99.49)
    }
}