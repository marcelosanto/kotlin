// var -> variavel mutavel
// val -> variavel imutavel
// const val -> variavel imutavel declaro fora da função

/*
  - TIPOS DE DADOS
  String -> Textos
  Double -> Números decimais, 16 numeros apos o ponto
  Float -> numeros decimais, 7 numeros apos o ponto
  Long -> Numeros Inteiros
  Boolean -> Verdadeiro ou Falso
*/

const val sobrenome = "Santos"

fun main() {
  var idade = 29
  val nome: String = "Marcelo"
  val dinheiro = 25.99
  val divida = 110f
  val loteria: Long = 514484949
  val resultado = false

  //println(nome +" "+ sobrenome)
  println("Meu nome é $nome $sobrenome")

  println(idade)
  println(dinheiro)
  println(divida)
  println(loteria)
  println(resultado)
  
}