const taskInput = document.querySelector('#taskInput')
const trashBtn = document.querySelector('#trashBtn')
const addBtn = document.querySelector('#addBtn')
const container = document.querySelector('.container')


taskInput.addEventListener('keydown', function (event) {
    if (event.key === "Enter") {
        verifyInput()
    }
})

addBtn.addEventListener('click', verifyInput = () => {
    if (taskInput.value == "") {
        alert('Náo é possível adicionar uma tarefa vazia!')
    } else {
        addTask()
    }
})

trashBtn.addEventListener('click', removeAllTasks = () => {
    const taskList = document.querySelector('.task-list')
    
    while (taskList.firstChild) {
        taskList.firstChild.remove()
    }
    
    container.style.height = '110px'
})


const addTask = () => {
    container.style.height = "fit-content"
    
    const taskList = document.querySelector('.task-list')
    
    let task = document.createElement('div')
    task.classList.add('task')
    
    let removeBtn = document.createElement('button')
    removeBtn.id = "removeBtn"
    
    let okBtn = document.createElement('button')
    okBtn.id = "okBtn"
    
    let buttonsBox = document.createElement('div')
    buttonsBox.classList.add('buttons-box')
    
    let textBox = document.createElement('div')
    textBox.classList.add('text-box')
    
    let taskInBox = document.createElement('p')
    
    taskInBox.innerHTML = `<p>${taskInput.value}</p>`
    removeBtn.innerHTML = `<i class="fa-solid fa-x"></i>`
    okBtn.innerHTML = `<i class="fa-solid fa-check"></i>`
    
    taskList.appendChild(task)
    task.appendChild(textBox)
    task.appendChild(buttonsBox)
    textBox.appendChild(taskInBox)
    buttonsBox.appendChild(removeBtn)
    buttonsBox.appendChild(okBtn)
    
    removeBtn.addEventListener('click', function removeTask() {
        const taskToRemove = this.closest('.task')
        
        if (taskToRemove) {
            taskToRemove.remove()
            checkTaskListSize()
        }
    })
    
    okBtn.addEventListener('click', function doneTask() {
        const textBoxToMark = this.closest('.task').querySelector('.text-box');
        if (textBoxToMark) {
            if (textBoxToMark.classList.contains('done')) {
                textBoxToMark.classList.remove('done')
            } else {
                textBoxToMark.classList.add('done')
            }
        }
    });    

    const checkTaskListSize = () => {
        const taskList = document.querySelector('.task-list')
        
        if (taskList.children.length === 0) {
            container.style.height = '110px'
        } else {
            container.style.height = 'fit-content'
        }
    }
}