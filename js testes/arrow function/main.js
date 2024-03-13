//Modo tradicional

function soma(a, b) {
    return a + b
}

//Arrow function

const soma = (a, b) => a + b


//Arrow function com várias instruções (sem retorno)

const media = () => {
    let a = 7.5, b = 8.2
    
    soma = a + b
    resultado = soma / 2

    document.body.textContent = resultado.toFixed(1)
}

// Com retorno

const media = (a, b) => {
    soma = a + b
    resultado = soma / 2

    return resultado
}

document.body.textContent = media(7.5, 8.2).toFixed(1)