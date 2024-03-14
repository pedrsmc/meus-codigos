const taskInput = document.querySelector('#taskInput')
const trashBtn = document.querySelector('#trashBtn')
const addBtn = document.querySelector('#addBtn')


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
    const taskList = document.querySelector('.task-list');

    while (taskList.firstChild) {
        taskList.firstChild.remove();
    }
})

const addTask = () => {
    const taskList = document.querySelector('.task-list')

    let task = document.createElement('div')
    task.classList.add('task')
    let removeBtn = document.createElement('button')
    removeBtn.id = "removeBtn"
    let okBtn = document.createElement('button')
    okBtn.id = "okBtn"
    let buttonsBox = document.createElement('div')
    buttonsBox.classList.add('buttons-box')

    task.innerHTML = `<p>${taskInput.value}</p>`
    removeBtn.innerHTML = `<i class="fa-solid fa-x"></i>`
    okBtn.innerHTML = `<i class="fa-solid fa-check"></i>`

    taskList.appendChild(task)
    task.appendChild(buttonsBox)
    buttonsBox.appendChild(removeBtn)
    buttonsBox.appendChild(okBtn)

    removeBtn.addEventListener('click', function removeTask() {
        const taskToRemove = this.closest('.task');
    
        if (taskToRemove) {
            taskToRemove.remove();
        }
    })

    okBtn.addEventListener('click', function doneTask() {
        const taskToMark = this.closest('.task');
    
        if (taskToMark) {
            taskToMark.classList.add('done');
        }
    })
}