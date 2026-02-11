package TNS_java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffereReader_demo {

	public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(
	        new FileReader("C:\\Users\\Aman Kumar\\Downloads\\kaif p\\Final keyword & buffered reader.txt")
	    );

	    String data = "";
	    while ((data = br.readLine()) != null) {  
	        System.out.println(data);
	    }

	    br.close();
	}


}
