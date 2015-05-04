package pj.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

public class TextFileAdapter {
	
	public static final String relativOutputPath = "";
	private String absolutProjectPath;
	private String absolutOutputPath;
	private String absolutTextFilePath;
	
	public TextFileAdapter() {
		absolutProjectPath = new File("").getAbsolutePath();
		absolutOutputPath = absolutProjectPath + relativOutputPath;
		absolutTextFilePath = "";
	}
	
	public boolean createTextFile(String name) {
		File file = new File(absolutOutputPath+"/"+name);
		
        if (file != null) {
            try {
                file.createNewFile();
                absolutTextFilePath = file.getAbsolutePath();
                System.out.println("Created: "+absolutTextFilePath);
            } catch (IOException e) {
                System.err.println("Error creating " + file.toString());
            }
            if (file.isFile() && file.canWrite() && file.canRead())
                return true;
        }
        return false;
    }
	
	public void writeTextFile(String name, String text) {			
		PrintWriter out = null;
		File file = new File(absolutOutputPath+"/"+name);
		try {
			out = new PrintWriter(file);
			System.out.println("Written: "+file.getAbsolutePath());
			out.println(text);
			out.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error init print writer");
		}
	}
	
	public Vector<String> readTextFile(String name) {
		String line = null;
        Vector<String> lines = new Vector<String>();

        try {
            FileReader fileReader = new FileReader(name);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	lines.add(line);
                System.out.println(line);
            }  
            bufferedReader.close();            
        }
        
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '"+name+"'");
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '"+name+"'");
        }
        return lines;
    }
	
	public void clearTextFile(String name) {
		FileWriter writer = null;
		File file = new File(absolutOutputPath+"/"+name);
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			System.err.println("Error init file writer " + file.toString());
		}
		
		try {
			writer.write("");
		} catch (IOException e) {
			System.err.println("Error clearing " + file.toString());
		}
	}
}
