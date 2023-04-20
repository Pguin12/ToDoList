package todo;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Usability {
	String addTask;
	String listTasks;
	//try to add reading and saving from files
	public Usability () {
	System.out.print("Created");
	Scanner in = new Scanner(System.in);
	//TaskList arr;
	//arr = new TaskList[99];
	ArrayList<Task> Info = new ArrayList<Task>();
	System.out.print("How many tasks?");
	int numofTasks = in.nextInt();
	for (int i = 0; i < numofTasks; i++) {
	System.out.print("Name of tasks");
	String name = in.next();
	Task names = new Task();
	// names.setName(name);
	// Task.add(names);
	}
	}
	public void addTask() {
	String name = JOptionPane.showInputDialog(null,"Enter Task Name");
	String Category = JOptionPane.showInputDialog(null,"Enter Category");
	}
	public void displayTasks() {
	}
	public void saveTasks() {
	}
	
	}
