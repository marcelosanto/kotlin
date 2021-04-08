/*
  -> private (sempre  vai ser vísivel dentro da classe)
  -> protected (vísivel em subclasse)
  -> public (vísivel em todo o projeto)
*/

fun main() {
  val veiculo = Automovel()
  veiculo.exibir()
  //veiculo.parar()
}

open class Veiculo {
  protected var cor = "Amarelo"

  protected fun parar() {
    println("O Carro esta parando...")
  }
}

class Automovel: Veiculo() {

  fun exibir(){
    println("Cor: $cor")
  }
}