fun main() {

  val carro = Carro()
  carro.cor = "Azul"
  println(carro.cor)

  carro.abrirPorta()
  carro.marchas()

}

class Carro {
  var cor: String = "" // Atributo - Caracteristica do objeto

  //Ações - Metodos
  fun abrirPorta() {
    println("Abrir a porta do carro")
  }

  fun primeraMarcha() {
    println("Passando a primera marcha")
  }

  fun segundaMarcha() {
    println("Passando a segunda marcha")
  }

  fun marchas() {
    this.primeraMarcha()
    this.segundaMarcha()
  }
}