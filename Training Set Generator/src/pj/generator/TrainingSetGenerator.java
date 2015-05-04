package pj.generator;

import java.util.Vector;

public class TrainingSetGenerator {
	public TextFileAdapter textFileAdapter;
	
	public TrainingSetGenerator() {
		textFileAdapter = new TextFileAdapter();
		generate();
	}
	
	public void generate() {
		String fileNameTwoBoxes = "hans.txt";

		generateTwoBoxes(fileNameTwoBoxes);
	}
	
	public void generateTwoBoxes(String fileName) {
		String text = null;
		
		textFileAdapter.createTextFile(fileName);
	
		textFileAdapter.writeTextFile(fileName,text);
		
		Vector<String> textFile = new Vector<String>();
		textFile = textFileAdapter.readTextFile(fileName);
	}
	
	public void generateTwoSpirals(String fileName) {
		
	}
	
	public void generateExOr(String fileName) {
		
	}
}
