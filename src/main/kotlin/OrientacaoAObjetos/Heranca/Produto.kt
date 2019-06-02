package OrientacaoAObjetos.Heranca

open class Produto(val marca: String, private var preco: Double) {

    fun oscilarPreco(oscilacao: Double) {
        this.preco += oscilacao
    }

}