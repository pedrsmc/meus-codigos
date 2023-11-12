const key = "4ce93ece"
const inputName = document.querySelector('#input-name')
const inputYear = document.querySelector('#input-year')
const button = document.querySelector('#button')
const title = document.querySelector('#title')
const year = document.querySelector('#year')
const time = document.querySelector('#time')
const genre = document.querySelector('#genre')
const director = document.querySelector('#director')
const rotten = document.querySelector('#rotten')
const desc = document.querySelector('#desc')
const advice = document.querySelector('.advice-box')
const adviceText = document.querySelector('#advice')

button.addEventListener('click', search)
inputName.addEventListener('keydown', function(event) {
    if (event.key === "Enter") {
        search()
    }
})
inputYear.addEventListener('keydown', function(event) {
    if (event.key === "Enter") {
        search()
    }
})

async function search() {
    let movieName = inputName.value
    let movieYear = inputYear.value
    const image = document.querySelector('#image')

    if (movieName === "") {
        advice.style.display = "flex"
        adviceText.textContent = "Please type a movie name."
    } else {
        let data = await fetch(`http://www.omdbapi.com/?apikey=${key}&t=${movieName}&y=${movieYear}`).then(answer => answer.json())

        if (data.Response === "True") {
            advice.style.display = "none"
            image.src = data.Poster

            title.textContent = data.Title
            year.textContent = data.Year
            time.textContent = data.Runtime
            desc.textContent = data.Plot
            genre.textContent = data.Genre
            director.textContent = data.Director
            rotten.textContent = data.Ratings[1].Value
            console.log(data)
        } else {
            advice.style.display = "flex"
            adviceText.textContent = "Movie not found. Please verify if the movie year or name is correct."
        }  
    }
}