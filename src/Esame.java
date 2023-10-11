import java.time.*;


public class Esame {
	
	//Attributi
	String Matricola;
	String NomeInsegnamento;
	LocalDate DataVerbalizzazione;
	int Voto;
	boolean Lode;
	
	
	//Costruttori
	public Esame(String matr, String ins, int v, boolean l) {
		Matricola= matr;
		NomeInsegnamento = ins;
		DataVerbalizzazione = LocalDate.now();
		Voto=v;
		if(Voto==30)
			Lode=l;
		
	}
	
	
	
	
	//Metodi
	public void StampaEsame() {
		System.out.println("Esame: "+Matricola+", "+NomeInsegnamento+", "+DataVerbalizzazione+", "+Voto+", "+Lode);
	}
	

}
