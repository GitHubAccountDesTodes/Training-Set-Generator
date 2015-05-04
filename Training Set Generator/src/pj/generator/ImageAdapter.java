package pj.generator;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;

public class ImageAdapter {

	
	public void readImageBytes(String name) {
		BufferedReader in;
		ByteArrayOutputStream out = null;
	
		int c;
	
	      
		try {
			in = new BufferedReader(new FileReader(name));
		
			out = new ByteArrayOutputStream();
			 
			while((c=in.read())!=-1) {
				 out.write(c);
			} 
			
		} catch(Exception e) {
			 e.printStackTrace();
		}
		
		 ByteArrayOutputStream[] byteArray = out.toByteArray();
		}
	}
}