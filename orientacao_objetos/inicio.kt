fun main() {

  val carro = Carro("Preto", 1.59)
  carro.detalhesDoCarro()

}

class Carro /*(cor: String, altura: Double)*/{

  var cor: String = "" // Atributo - Caracteristica do objeto
  var altura: Double

  constructor(cor: String, altura: Double){
    this.cor = cor
    this.altura = altura
  }

  // init{
  //   this.cor = cor
  //   this.altura = altura
  // }

  //Ações - Metodos

  fun detalhesDoCarro(){
    println("Cor: $cor, Altura: $altura")
  }

  fun abrirPorta() {
    println("Abrir a porta do carro")
  }

  
}