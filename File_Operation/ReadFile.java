import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ReadFile {

    public static void main(String[] args) throws IOException {
    	String incomming = "";

    	File fSourceStore = new File("C:\\Users\\prakash_ranjan\\Desktop\\Temp\\file.txt");
    	
    	FileReader frStore = new FileReader(fSourceStore);
    	
    	BufferedReader brStore = new BufferedReader(frStore);
    	
    	boolean bSearch = true;
    	while (bSearch == true)
    	{
    		incomming = brStore.readLine();
    		if (incomming != null)
    		{
    			 System.out.println(incomming);
    		    		
    		}
    		else 
    		{
    				brStore.close();
    				bSearch = false;
    		}
    	}
    }
}