package application;

public class ControladorEj1 {
	VistaEj1 vista;
	ModeloEj1 m;
	Numero num;
	
	public ControladorEj1(VistaEj1 vista, ModeloEj1 m) {
		
		vista.getSuma().setOnAction(e->{
			
			 int suma1 =  this.num.uno1 + this.num.uno2;
			 int suma2 =  this.num.dos1 + this.num.dos2;
			 
			 vista.getResul().setText(suma1+"+"+suma2+"i");
		  
		});
		
		vista.getResta().setOnAction(e->{
			 int resta1 =  num.uno1 - num.uno2;
			 int resta2 =  num.dos1 - num.dos2;
			 
			 vista.getResul().setText(resta1+"+"+resta2+"i");
		  
		});
		
		vista.getMult().setOnAction(e->{
			 int mul1 =  num.uno1 * num.uno2;
			 int mul2 =  num.dos1 * num.dos2;
			 int mul3 = num.uno1 * num.dos2;
			 int mul4 = num.uno2 * num.dos1;
			 
			 int pricifra = mul1 + mul3;
			 int segcifra = mul2 + mul4;
			 
			 vista.getResul().setText(pricifra +"+"+segcifra+"i");
		  
		});
		
	}

}
