/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package villanuevamanager;

import java.util.Scanner;
public class VillanuevaManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        String titleToAdd;
      while (true){  
        System.out.println("To-Do-List Manager");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Search Task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
         scan.nextLine();
        
        if(choice == 1 ){
             System.out.print("Enter task title: ");
                    titleToAdd = scan.nextLine();
                    toDoList.Addtitle(titleToAdd);
                    System.out.println(titleToAdd +" Has been add");
                    System.out.println("press anykey to continue");
                    scan.nextLine();
             
                    
        }else if(choice == 2 ){
            System.out.println("Titles: ");
             toDoList.printTasks();
             System.out.print("Enter task title to delete: ");
                    String titleToDelete = scan.nextLine();
                    toDoList.deleteTask(titleToDelete);
                    System.out.println(titleToDelete+ " has been deleted");
                     System.out.println("press anykey to continue");
                    scan.nextLine();
        }else if(choice == 3 ){
                    System.out.println("Titles: ");
                    toDoList.printTasks();
                     System.out.println("press anykey to continue");
                    scan.nextLine();
            
        }else if(choice == 4 ){
            System.out.print("Enter task title to search: ");
                    String titleToSearch = scan.nextLine();
                    if (toDoList.contains(titleToSearch)) {
                       System.out.println("Task founded: "+titleToSearch);
                    } else {
                        System.out.println("Task not found.");
                    }
                         System.out.println("press anykey to continue");
                    scan.nextLine();
        }else{
             System.out.println("Exiting...");
        }
    }
}
}