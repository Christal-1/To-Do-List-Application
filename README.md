To-Do List Application

Description

A simple Java console application that allows users to manage a to-do list. Users can add tasks, view tasks, mark tasks as completed, and delete tasks.
Features

    Add a new task
    View all tasks
    Mark a task as completed
    Delete a task

Requirements

    Java Development Kit (JDK) 8 or higher

Getting Started

    Clone the repository:

    sh

git clone https://github.com/Christal-1/To-Do-List-Application
cd todo-list-app

Compile the Java files:

sh

javac Task.java ToDoList.java Main.java

Run the application:

sh

    java Main

Usage

Upon running the application, you will see a menu with the following options:

    Add Task: Input a description for a new task.
    View Tasks: Display all tasks with their current status.
    Mark Task as Completed: Enter the index of the task you want to mark as completed.
    Delete Task: Enter the index of the task you want to delete.
    Exit: Close the application.

Example


To-Do List Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
4. Delete Task
5. Exit
   Choose an option: 1
   Enter task description: Buy groceries

To-Do List Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
4. Delete Task
5. Exit
   Choose an option: 2
   0: [ ] Buy groceries

To-Do List Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
4. Delete Task
5. Exit
   Choose an option: 3
   Enter task index to mark as completed: 0

To-Do List Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
4. Delete Task
5. Exit
   Choose an option: 2
   0: [x] Buy groceries
