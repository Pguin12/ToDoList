package todo;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	  public static void main(String[] args) throws IOException {
	    // create saveFile
	    saveFile();
	  }

	  public static void saveFile() throws IOException {
	    FileWriter fw = new FileWriter("output.txt");

	    // write to file
	    for (int i = 0; i < 10; i++) {
	      fw.write("Hello, world!\n");
	    }

	    fw.close();
	  }
	}