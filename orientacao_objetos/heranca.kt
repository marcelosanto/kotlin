fun main() {

  val cachorro = Cachorro()
  cachorro.latir()
  cachorro.dormir()

  val passaro = Passaro()
  passaro.voando()
  passaro.dormir()
  
}

open class Animal {
  // open = public
  open fun dormir(){
    println("Dormir")
  }
}

class Cachorro: Animal() {

  // sobrescrita de metodos herdados
  override fun dormir(){
    println("O Cachorro esta dormindo")
  }

  fun latir() {
    println("O Cachorro está latindo")
  }

 

}

class Passaro: Animal() {

  // sobrescrita de metodos herdados
  override fun dormir(){
    println("O Passaro esta dormindo")
  }
  
  fun voando() {
    println("O Passaro está voando")
  }

}