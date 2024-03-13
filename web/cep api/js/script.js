const inputCep = document.querySelector('#cep')
const neighborhood = document.querySelector('#neighborhood')
const city = document.querySelector('#city')
const state = document.querySelector('#state')
const place = document.querySelector('#place')
const complement = document.querySelector('#complement')
const cepButton = document.querySelector('#cepButton')
const container = document.querySelector('.container')
const warning = document.querySelector('#warning')
let justNumbers

cepButton.addEventListener('click', validation)

inputCep.addEventListener('keyup', function (event) {
    if (event.key === "Enter") {
        validation()
    } else {
        setTimeout(function () {
            inputCep.value = inputCep.value.replace(/[\s-]/g, '');
        }, 0);
        inputColor()
    }
})

function inputColor() {
    let inputChar = inputCep.value

    if (isNaN(inputChar)) {
        inputCep.style.outlineColor = 'red'
        justNumbers = false
    } else {
        inputCep.style.outlineColor = '#2dc653'
        justNumbers = true
    }
}

function validation() {
    let inputValue = inputCep.value

    if (inputValue != "") {
        warning.textContent = ""
        if (justNumbers == true) {
            warning.textContent = ""

            if (inputValue.length == 8) {
                warning.textContent = ""
                searchCep()

            } else {
                warning.textContent = "A quantidade de caracteres está incorreta!"
            }

        } else {
            warning.textContent = "Digite apenas números!"
        }
    } else {
        warning.textContent = "Opa! Preciso que você digite um CEP válido para realizar uma busca."
    }
}

async function searchCep() {
    let cep = inputCep.value

    try {
        let data = await fetch(`https://viacep.com.br/ws/${cep}/json/`)
            .then(res => res.json())

        if (data.erro == "true") {
            warning.textContent = "CEP não encontrado."
        } else {
            neighborhood.textContent = data.bairro
            city.textContent = data.localidade
            state.textContent = data.uf
            place.textContent = data.logradouro

            if (data.complemento == "") {
                complement.textContent = "Nenhum"
            } else {
                complement.textContent = data.complemento
            }
        }
    } catch (erro) {
        console.log(`Erro encontrado: ${erro.message}`)
    }
}