Java Linked List Task: Custom To-Do List Manager

Jul 31 (Edited Jul 31)
100 points
Objective:
- Create a simple To-Do List Manager using a singly linked list in Java. You will implement your own Node and LinkedList classes from scratch.

Reference:
- Use the previous video sent as your guide for implementing the linked list logic. Make sure to follow the structure and concepts demonstrated there.

Task Requirements:
- Create a class TaskNode:
- Fields:
String title
TaskNode next
- Create a class ToDoList:
Implements basic linked list operations:
void addTask(String title) – adds a task to the end
void deleteTask(String title) – deletes the task with the matching title
void printTasks() – prints all tasks
boolean contains(String title) – checks if a task exists

- Create a Main class to test your code:
Implement a simple menu system that allows the user to:
Add a task
Delete a task
View all tasks
Search for a task
Exit

Sample Output:
1. Add task
2. Delete task
3. View all tasks
4. Search task
5. Exit
Enter choice: 1
Enter task title: Submit assignment

Task added!

Enter choice: 3
Your Tasks:
- Submit assignment

Bonus (Optional):
- Count the number of tasks.
- Add ability to insert a task at a specific index.
- Implement a doubly linked list version.

Submission Instructions:
- Create a GitHub repository for this task.
- Upload your code files:
TaskNode.java
ToDoList.java
Main.java
