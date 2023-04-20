package todo;
import javax.swing.JOptionPane;
public class Task {
	int i = 0;
	String newTask;
	Boolean isDone;
	String Category;
	public Task () {
	newTask = "Name";
	isDone = false;
	Category = null;
	}
	public void changeName () {
	String newName = JOptionPane.showInputDialog(null,"Enter Task Name");
	newTask = newName;
	}
	
	public String getTask () {
		return newTask;
		}
		public boolean completeTask () {
		isDone = true;
		return isDone;
		}
		public String changeCategory (String newCate) {
		Category = newCate;
		return Category;
		}
		public void printTask () {
		System.out.println("Task: " + newTask);
		System.out.println("Category: " + Category);
		System.out.println("Completed?" + isDone);
		}
		}



