import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


	 
public class WriteFile {
	public static void main(String[] args) {
		try 
		{
	 
			String content = "This is the content to write into file";
	
			File file = new File("C:\\Users\\prakash_ranjan\\Desktop\\Temp\\file.txt");
			// if file doesnt exists, then create it
			if (!file.exists()) 
			{
				System.out.println("Creating new File");
				file.createNewFile();
			}
	 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			System.out.println(file.getAbsoluteFile());;
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
	 
			System.out.println("Done");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}	
}