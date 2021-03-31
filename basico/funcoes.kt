fun main() {
  println(max(22,9))
  println(max1(41,42))
} 

// Corpo de Bloco
fun max(a: Int, b: Int): Int {
  return if (a>b) a else b
}

// Corpo de expressão
fun max1(a: Int, b: Int) = if (a>b) a else b