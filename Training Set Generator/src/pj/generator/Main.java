package pj.generator;

import pj.generator.*;
import pj.ui.NNVisualisation;

public class Main {
	public TrainingSets trainingSets;
	public NNVisualisation nNVisualisation;

	public Main() {
		trainingSets = new TrainingSets();
		nNVisualisation = new NNVisualisation(this);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
