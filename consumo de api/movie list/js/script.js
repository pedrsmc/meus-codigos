const key = "4ce93ece"
const inputName = document.querySelector('#input-name')
const button = document.querySelector('#button')
const bottomBox = document.querySelector('.bottom-box')

button.addEventListener('click', search)
inputName.addEventListener('keydown', function (event) {
    if (event.key === "Enter") {
        search()
    }
})

async function search() {
    let search = inputName.value
    
    if (search === "") {
        alert("Type a movie name!")
    } else {

        let data = await fetch(`http://www.omdbapi.com/?apikey=${key}&s=${search}`)
        .then(answer => answer.json())

        if (data.Response === "True") {

            const list = document.querySelector('.item-box')
            list.innerHTML = ""

            data.Search.forEach(element => {
                let item = document.createElement("div")
                item.classList.add("item")

                item.innerHTML = `<img src= "${element.Poster}"/><p>${element.Title} (${element.Year})</p>`

                list.appendChild(item)
            });

        } else {
            alert("Movie not found!")
        }
    }
}