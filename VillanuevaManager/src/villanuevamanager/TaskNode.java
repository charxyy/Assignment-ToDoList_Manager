/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package villanuevamanager;

/**
 *
 * @author LENOVO
 */
public class TaskNode {
    String title;
    TaskNode next;

    public TaskNode(String title) {
        this.title = title;
        this.next = null;
    }
}
    