// enum

fun main() {
  
  val pagamento = Pagamento()
  pagamento.status = StatusPagamento.COMPLETO

  when{
    pagamento.status == StatusPagamento.EM_ANALISE -> println("O Pagamento esta em analise.")
    pagamento.status == StatusPagamento.CANCELADO -> println("O Pagamento esta cancelado.")
    pagamento.status == StatusPagamento.APROVADO -> println("O Pagamento esta aprovado.")
    pagamento.status == StatusPagamento.COMPLETO -> println("O Pagamento esta completo.")

  }
}

class Pagamento() {

  var status: StatusPagamento = StatusPagamento.COMPLETO
}

enum class StatusPagamento {

  CANCELADO, EM_ANALISE, APROVADO, COMPLETO
}