package classes.creators

import classes.Agent
import classes.products.Cake
import classes.Product

class CakeCreator(name:String): Agent(name) {

    override fun cook(): Product {
        return Cake("Торт", 150.49)
    }
}