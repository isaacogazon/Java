package application;

import java.util.ArrayList;
import javafx.scene.control.Button;

public class Modelo3Raya {
	Vista3Raya v;
	ArrayList<Button> relleno = new ArrayList<Button>(8);
	
	public Modelo3Raya() {
		for (int i = 0; i < relleno.size(); i++) {
			relleno.add(v.getArray().get(i));
			System.out.println(relleno.get(i).getText());
		}
	}
	
	public void check(ArrayList<Button> a) {
		
	}

}
