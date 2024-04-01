window.addEventListener('scroll', function () {
    let navbar = document.querySelector('.navbar')

    if (window.scrollY > 0) {
        navbar.classList.add('shadow')
    } else {
        navbar.classList.remove('shadow')
    }
})
document.addEventListener('DOMContentLoaded', function () {
    let paragraphs = document.querySelectorAll('.text-field p, .text-field span')

    paragraphs.forEach(function (paragraphs) {
        paragraphs.style.opacity = "100%"
    })
})


document.addEventListener('DOMContentLoaded', function () {
    let serviceFields = document.querySelectorAll('.service-field, #our-plans')
    
    const fadeInElementsWhenVisible = () => {
        serviceFields.forEach(function (element, index) {
            let bounding = element.getBoundingClientRect()

            if (bounding.top >= 0 && bounding.bottom <= window.innerHeight) {
                setTimeout(function () {
                    element.style.opacity = "100%"
                }, index * 300)
            }
        });
    }

    fadeInElementsWhenVisible()

    window.addEventListener('scroll', function () {
        fadeInElementsWhenVisible()
    });
});

