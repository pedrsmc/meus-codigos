// Desestruturação

const user = {
    name: "Pedro",
    // lastname: null,
    age: 20,
    address: {
        street: "Rua Não Sei",
        number: 16
    }
}

const { address, age, lastname = "Não informado" } = user

function showAge({ age }) {
    return user.age
}

document.body.innerText = showAge(user)