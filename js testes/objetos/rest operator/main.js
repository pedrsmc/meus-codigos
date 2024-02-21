// Rest Operator

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

// const { name, ...rest} = customer

const array = [1, 2, 3, 4, 5]

const [first, , second, ...rest] = array

document.body.innerText = [first, second, rest]
