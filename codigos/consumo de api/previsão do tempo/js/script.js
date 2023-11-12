const key = 'e355cb35c84a8d8d1ebea310e3e0aca9'
const town = document.querySelector('#town')
const celsius = document.querySelector('#celsius')
const desc = document.querySelector('#desc')
const input = document.querySelector('#input')
const button = document.querySelector('#button')
const mainBox = document.querySelector('.main-box')
const bottomBox = document.querySelector('.bottom-box')

button.addEventListener('click', searchCity)
input.addEventListener('keydown', function (event) {
    if (event.key == "Enter") {
        searchCity()
    }   
})

function fullOpacity() {
    bottomBox.classList.add('active')
}

function noneOpacity() {
    bottomBox.classList.remove('active')
}

function extendMainBox() {
    mainBox.classList.add('active')
}

async function searchCity() {
    let cityName = input.value
    
    if (cityName == "") {
        alert("Digite o nome de uma cidade!")
    } else {
        noneOpacity()
        let data = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${cityName}&appid=${key}&units=metric&lang=pt_br`)
        .then(answer => answer.json())
        
        if (data.cod == "404") {
            alert("Cidade não encontrada!")
            fullOpacity()
        } else {
            fullOpacity()
            extendMainBox()
            town.textContent = data.name
            celsius.textContent = Math.ceil(data.main.temp) + " °C"
            desc.textContent = data.weather[0].description
        }

        console.log(data)
    }
}