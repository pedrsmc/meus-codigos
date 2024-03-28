const inputCep = document.querySelector('#cep')
const neighborhood = document.querySelector('#neighborhood')
const city = document.querySelector('#city')
const state = document.querySelector('#state')
const place = document.querySelector('#place')
const complement = document.querySelector('#complement')
const cepButton = document.querySelector('#cepButton')
const warning = document.querySelector('#warning')

cepButton.addEventListener('click', function() {
    validation(inputCep.value)
})

inputCep.addEventListener('keyup', function (event) {
    if (event.key === "Enter") {
        validation(inputCep.value)
        
    } else {
        setTimeout(function () {
            inputCep.value = inputCep.value.replace(/[\s-]/g, '')
            
            const inputColor = () => {
                if (isNaN(inputCep.value)) {
                    inputCep.style.outlineColor = 'red'
                } else {
                    inputCep.style.outlineColor = '#2dc653'
                }
            }
        }, 0)
    }
})


async function searchCep(cep) {
    try {
        let data = await fetch(`https://viacep.com.br/ws/${cep}/json/`)
            .then(res => res.json())

        if (data.erro === true) {
            alert("O CEP informado não é válido.")

        } else {
            neighborhood.textContent = (data.bairro || "Não informado")
            city.textContent = (data.localidade || "Não informado")
            state.textContent = (data.uf || "Não informado")
            place.textContent = (data.logradouro || "Não informado")
            complement.textContent = (data.complemento || "Não informado")
        }
    } catch (erro) {
        console.log(`Erro encontrado: ${erro.message}`)
    }
}

function validation(inputValue) {
    if (inputValue != "") {
        warning.textContent = ""

        if (!isNaN(inputValue)) {
            warning.textContent = ""

            if (inputValue.length == 8) {
                warning.textContent = ""
                searchCep(inputValue)

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