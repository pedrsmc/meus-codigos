const generateBtn = document.querySelector('#generateBtn')
const password = document.querySelector('#password')
const lengthInput = document.querySelector('#length')
const lengthText = document.querySelector("#lengthText")

const upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
const lowerCase = "abcdefghijklmnopqrstuvwxyz"
const number = "0123456789"
const symbol = "!@#$%^&*()_+{}][=-<>/"

const allChars = upperCase + lowerCase + number + symbol


generateBtn.addEventListener('click', () => {
    password.style.border = "none"
    let length = lengthInput.value
    let newPassword = ""

    newPassword += upperCase[Math.floor(Math.random() * upperCase.length)]
    newPassword += lowerCase[Math.floor(Math.random() * lowerCase.length)]
    newPassword += number[Math.floor(Math.random() * number.length)]
    newPassword += symbol[Math.floor(Math.random() * symbol.length)]

    while (length > newPassword.length) {
        newPassword += allChars[Math.floor(Math.random() * allChars.length)]
    }

    password.value = newPassword
    password.style.cursor = "pointer"
})

password.addEventListener('click', () => {
    if (password.value != "") {
        copyPassword()
    }
})

lengthInput.addEventListener('input', () => {
    const length = lengthInput.value;
    lengthText.innerHTML = `${length} caracteres`;
});

function copyPassword() {
    password.select()
    document.execCommand("copy")
    
    password.style.border = "solid 2px #008cff"
}