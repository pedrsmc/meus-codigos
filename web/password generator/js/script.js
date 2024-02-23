const generateBtn = document.querySelector('#generateBtn')
const password = document.querySelector('#password')
const inputBox = document.querySelector('.input-box')
const copyBtn = document.querySelector('#copyBtn')
const lengthInput = document.querySelector('#length')
const advice = document.querySelector("#advice")

const upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
const lowerCase = "abcdefghijklmnopqrstuvwxyz"
const number = "0123456789"
const symbol = "!@#$%^&*()_+{}][=-<>/"

const allChars = upperCase + lowerCase + number + symbol

generateBtn.addEventListener('click', validation)
password.addEventListener('click', verifyFirtClick)
copyBtn.addEventListener('click', verifyFirtClick)

function validation() {
    let value = lengthInput.value

    if (value == "") {
        inputBox.style.border = "2px solid #ca1010"
        advice.textContent = "Digite a quantidade de caracteres que deseja que a senha possua."
    } else {
        if (value < 6) {
            inputBox.style.border = "2px solid #ca1010"
            advice.textContent = "Quantidade de caracteres muito baixa!"
        } else if (value > 50) {
            inputBox.style.border = "2px solid #ca1010"
            advice.textContent = "Quantidade de caracteres muito alta!"
        } else {
            inputBox.style.border = ""
            advice.textContent = ""
            generatePassword(value)
        }
    }
}

function verifyFirtClick() {
    if (password.value != "") {
        copyPassword()
    } else {
    }
}

function generatePassword(length) {
    length = lengthInput.value
    let newPassword = ""

    newPassword += upperCase[Math.floor(Math.random() * upperCase.length)]
    newPassword += lowerCase[Math.floor(Math.random() * lowerCase.length)]
    newPassword += number[Math.floor(Math.random() * number.length)]
    newPassword += symbol[Math.floor(Math.random() * symbol.length)]

    while (length > newPassword.length) {
        newPassword += allChars[Math.floor(Math.random() * allChars.length)]
    }

    password.value = newPassword
}

function copyPassword() {
    password.select()
    document.execCommand("copy")
    alert('A senha gerada foi copiada com sucesso.')
}