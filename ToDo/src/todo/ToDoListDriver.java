package todo;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ToDoListDriver {
	public static void main(String[] args) throws IOException{
		// sets up task
		//int[] listTasks;
		//listTasks = new int [99];
		Usability a = new Usability();
		// choice
		int choice = 0;
		Scanner in = new Scanner(System.in);
		while (choice != 4) {
			switch (choice) {
			case 1:
			//ask how to list tasks
			case 2:
			case 3:
			case 4:
			FileWriter fw = new FileWriter("Output.txt");
			for (int i = 0; i < str.task(); i++) {
				  fw.write(str.task());
			}
			break;
		}


}}}
