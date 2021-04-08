/* 
  -> Collections *(Coleções)* <- 
  -> List(listOf) *(Imutável - tamanho fixo - apenas leitura)* <-
  -> ArrayList(arrayListOf) *(Mutável - sem tamanho fixo - pode adicionar novos itens ou remover)* <-
  -> MutableList(mutableListOf) *(Mutável - sem tamanho fixo - pode adicionar novos itens ou remover)* <-
*/

fun main() {
  var listaDeFilmes = mutableListOf("Batman", "Liga da Justiça", "Mulher Maravilha")
  println(listaDeFilmes)

  listaDeFilmes.add("Capitao America")
  println(listaDeFilmes)

  listaDeFilmes[2] = "Norbit"
  println(listaDeFilmes)

  println("numeros de filmes na lista: " + listaDeFilmes.size)

  listaDeFilmes.remove("Norbit")
  println("numeros de filmes na lista: " + listaDeFilmes.size)
}