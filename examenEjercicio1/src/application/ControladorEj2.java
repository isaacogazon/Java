package application;



public class ControladorEj2 {
	//VistaEj2 vista;
	//ModeloEj2 m;
	
	String text1;
	String text2;
	
	public ControladorEj2(VistaEj2 vista, ModeloEj2 m) {
		
		
		text1 = vista.getPrimernum().getText();
		text2 = vista.getSegundonum().getText();
		
		/*int n1p1;
		int n1p2;
		
		int n2p1;
		int n2p2;*/
		
		
		vista.suma.setOnMouseClicked(eb->{
			System.out.println("."+text1);
			vista.resul.setText(text1);
		});
		
		
	}

}
