/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package villanuevamanager;

/**
 *
 * @author LENOVO
 */
public class ToDoList {
     private TaskNode head;

    public ToDoList() {
        head = null;
    }

    public void Addtitle(String title) {
        TaskNode newNode = new TaskNode(title);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteTask(String title) {
        if (head == null) return;

        if (head.title.equals(title)) {
            head = head.next;
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.title.equals(title)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }

    public boolean contains(String title) {
        TaskNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
    



