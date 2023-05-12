import classes.Product
import classes.creators.CakeCreator
import classes.creators.CandyCreator
import classes.creators.CupCakeCreator
import classes.products.Cake
import classes.products.Candy
import classes.products.CupCake

fun main() {
    println(
        "Ввдетие номер заказа:\n" +
                "1)Торт\n" +
                "2)Конфеты\n" +
                "3)Кекс\n" +
                "4)Коктель\n" +
                "0)Выход"
    )
    var a = readLine()!!
    var product = mutableListOf<Product>()
    while (a.toInt() != 0) {
        product.clear()
        when (a.toInt()) {
            1 -> {
                println("Введите количество")
                val Scount = readLine()!!
                var count = Scount.toInt()
                var price = 0.0;
                while (count != 0) {
                    product.add(CakeCreator("Домолего Захар Андреевич").cook() as Cake)
                    count--
                }
                product.forEach {
                    price+=it.getInfo().second
                }
                println("${CakeCreator("Домолего Захар Андреевич").name} приготовил ${product[0].getInfo().first} в количестве ${product.size} за цену $price")
            }

            2 -> {
                println("Введите количество")
                val Scount = readLine()!!
                var count = Scount.toInt()
                var price = 0.0;
                while (count != 0) {
                    product.add(CandyCreator("Фомин Евгений Александрович").cook() as Candy)
                    count--
                }
                product.forEach {
                    price+=it.getInfo().second
                }
                println("${CandyCreator("Фомин Евгений Александрович").name} приготовил ${product[0].getInfo().first} в количестве  ${product.size} за цену $price")
            }

            3 -> {
                println("Введите количество")
                val Scount = readLine()!!
                var count = Scount.toInt()
                var price = 0.0;
                while (count != 0) {
                    product.add(CupCakeCreator("Акулин Александр Александрович").cook() as CupCake)
                    count--
                }
                product.forEach {
                    price+=it.getInfo().second
                }
                println("${CupCakeCreator("Акулин Александр Александрович").name} приготовил ${product[0].getInfo().first} в количестве ${product.size} за цену $price")
            }
        }
        a = readLine()!!
    }

}