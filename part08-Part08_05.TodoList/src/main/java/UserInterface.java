/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.Scanner;
public class UserInterface {
    
    private TodoList todos;
    private Scanner scanner;
    
    public UserInterface(TodoList todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String commands = scanner.nextLine();
            switch (commands) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add: ");
                    String toAdd = scanner.nextLine();
                    this.todos.add(toAdd);
                    break;
                case "list":
                    this.todos.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int indexToRemoved = Integer.valueOf(scanner.nextLine());
                    this.todos.remove(indexToRemoved);
                    break;
                default:
                    break;
            }
        }
    }
    
}
