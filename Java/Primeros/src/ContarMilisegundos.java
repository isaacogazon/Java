
public class ContarMilisegundos {

	public static void main(String[] args) {
		
		System.out.println("La hora actual es: ");
		long mils = System.currentTimeMillis();
		long segundos = mils / 1000;
		long horas = segundos / 3600;
		long horareal = horas % 24+2;
		long resthoras = segundos % 3600;
		long minutos = resthoras / 60;
		long restminutos = resthoras % 60;
		long segundosfin = restminutos % 60;
		
		System.out.println(horareal +":"+ minutos + ":"+segundosfin);
	}

}
