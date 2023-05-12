package classes

abstract class Agent(var name: String = ""){
    abstract fun cook():Product
}