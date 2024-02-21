const idade = null

// usando o operador "ou":

// document.body.innerHTML = "Idade: " + (idade || "Náo informado.")

// nullish coalescing operator:

document.body.innerHTML = "Idade: " + (idade ?? "Não informado")