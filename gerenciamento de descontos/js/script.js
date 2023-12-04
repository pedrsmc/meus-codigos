const nomeProduto = document.querySelector("#nomeProduto")
const dataFinal = document.querySelector("#dataFinal")
const resultado = document.querySelector("#resultado")
const botao = document.querySelector("#botao")
const preco = document.querySelector("#precoProduto")
const desconto = document.querySelector("#valorDesconto")
const descontoPercentual = document.querySelector("#percentual")
const descontoFixo = document.querySelector("#valorFixo")
const descontoQnt = document.querySelector("#quantidade")

botao.addEventListener("click", verificar)

function verificar() {
    let dataAtual = new Date()
    let finalData = new Date(dataFinal.value)
    let precoProduto = Number(preco.value)
    let valorDesconto = Number(desconto.value)
    let descontoAplicado = 0
    let qntVezesPreco = 0
    let precoFinal = 0

    if (finalData >= dataAtual) {
        if (isNaN(precoProduto) || isNaN(valorDesconto)) {
            resultado.textContent = "Por favor, insira um valor numérico válido para o preço e o desconto."
        } else if (precoProduto == "" || valorDesconto == "") {
            resultado.textContent = "Por favor, insira um valor."
        } else {
            if (descontoPercentual.checked) {
                descontoAplicado = (precoProduto * valorDesconto) / 100
                precoFinal = precoProduto - descontoAplicado
                resultado.textContent = "O desconto é válido. Preço final = " + precoFinal + " R$"
            } else if (descontoFixo.checked) {
                descontoAplicado = valorDesconto
                precoFinal = precoProduto - descontoAplicado
                resultado.textContent = "O desconto é válido. Preço final = " + precoFinal + " R$"
            } else if (descontoQnt.checked) {
                qntVezesPreco = precoProduto * valorDesconto
                descontoAplicado = (qntVezesPreco * 10) / 100
                precoFinal = qntVezesPreco - descontoAplicado
                resultado.textContent = "O desconto é válido. Preço final = " + precoFinal + " R$"
            } else {
                resultado.textContent = "Selecione a forma de desconto por favor."
            }
        }
    } else if (finalData < dataAtual) {
        resultado.textContent = "O desconto não é válido. A data final do desconto expirou."
    } else {
        resultado.textContent = "Selecione a data de finalização do desconto."
    }
}

