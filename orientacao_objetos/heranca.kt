fun main() {

  val cachorro = Cachorro()
  cachorro.latir()
  cachorro.dormir()

  val passaro = Passaro()
  passaro.voando()
  passaro.dormir()
  
}

open class Animal {
  fun dormir(){
    println("Dormir")
  }
}

class Cachorro: Animal() {

  fun latir() {
    println("O Cachorro está latindo")
  }

 

}

class Passaro: Animal() {

  
  fun voando() {
    println("O Passaro está voando")
  }

}