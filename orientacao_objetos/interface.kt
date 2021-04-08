// -> Interface

fun main() {
  val limao = Limao()
  limao.vitaminaC()


  val jabuticaba = Jabuticaba()
  jabuticaba.vitaminaE()
}

interface Vitaminas {
  fun vitaminaE()
  fun vitaminaC()
}

open class Frutas {
  fun vitaminas() {
    println("Todas as frutas tem vitaminas")
  }
}

class Limao: Frutas(), Vitaminas{
  override fun vitaminaC(){
    println("A fruta Limão tem a vitamina C")
  }
  
  override fun vitaminaE(){}
}

class Jabuticaba: Frutas(), Vitaminas {
  override fun vitaminaE(){
    println("A fruta Jabuticaba tem a vitamina E")
  }
  
  override fun vitaminaC(){}
}