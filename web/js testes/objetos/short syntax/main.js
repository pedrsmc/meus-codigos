// Short Syntax

const name = "Pedro"
const age = 20

// const user = {
//     name: name,
//     age: age,
// }

const user = {
    name,
    age
}

document.body.innerText = JSON.stringify(user)

