// Objeto

const customer = {
    name: "Pedro", lastname: "Souza",
    age: 20,
    address: {
        street: "Rua Não Sei",
        number: 64,
        zip: {
            code: "1234960",
            city: "Salvador"
        },
        showFullAddress() {
            return "ok";
        }
    }
}

// Funções

console.log('name' in customer) // retorna true or false

console.log(Object.keys(customer))

console.log(Object.values(customer))

console.log(Object.entries(customer))
