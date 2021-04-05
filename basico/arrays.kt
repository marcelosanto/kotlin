fun main() {
  var listaDeNomes = arrayOf("Marcelo", "Maquerle", "Alice", "Gabriel")
  var listaDeNumeros = intArrayOf(29,27,1,10)

  //println(lista[2])

  for(names in 0..listaDeNomes.size-1){
    println(listaDeNomes[names] + " Tem " + listaDeNumeros[names] + " anos.")
  }

}