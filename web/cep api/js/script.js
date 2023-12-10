const inputCep = document.querySelector('#cep')
const neighborhood = document.querySelector('#neighborhood')
const city = document.querySelector('#city')
const state = document.querySelector('#state')
const place = document.querySelector('#place')
const complement = document.querySelector('#complement')
const cepButton = document.querySelector('#cepButton')
const container = document.querySelector('.container')
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
        if (inputValue.length == 8) {
            if (justNumbers == true) {
                searchCep()
            } else {
                alert('Digite o CEP apenas com valores numéricos.')
            }
        } else {
            alert('o CEP deve conter exatos 8 caracteres.')
        }
    } else {
        alert('Digite o CEP desejado.')
    }
}

async function searchCep() {
    let cep = inputCep.value

    try {
        let data = await fetch(`https://viacep.com.br/ws/${cep}/json/`)
            .then(res => res.json())

        if (data.erro == true) {
            alert("CEP inexistente. Por favor tente novamente.")
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
        alert('Ocorreu um erro ao buscar o CEP. Por favor, tente novamente.')
    }
}