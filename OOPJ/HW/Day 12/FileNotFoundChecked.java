import java.io.*;
import java.io.FileReader;

public class FileNotFoundChecked {
	public static void main(String args[]) {
		String fileName = "XYZ.txt"; // File that does not exist

        try {
            
            FileReader fileReader = new FileReader(fileName);//Exception
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: The file '" + fileName + "' was not found.");
        }catch(Exception e) {
        	System.out.println("Error: The file " + fileName +" was not found.");
        }
	}

}
