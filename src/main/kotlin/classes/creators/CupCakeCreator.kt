package classes.creators

import classes.Agent
import classes.products.CupCake
import classes.Product
import classes.products.Candy

class CupCakeCreator(name: String): Agent(name) {
    override fun cook(): Product {
        return CupCake("Кекс", 123.49)
    }
}