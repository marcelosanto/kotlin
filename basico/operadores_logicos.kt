/*
  Operadores Lógicos
  -> (&&) E
  -> (||) ou 
*/

fun main() {
  val valor1 = 100
  val valor2 = 75

  if(valor2 > valor1 && valor1 > valor2) {
    println("Os dois é verdadeiro.")
  } else {
    println("Um dos dois é falso.")
  }
}