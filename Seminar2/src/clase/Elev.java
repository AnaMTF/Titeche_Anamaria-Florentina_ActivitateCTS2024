package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int finantare = 20;

	public static void setFinantare(int finantare) {
		Elev.finantare = finantare;
	}
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}


	@Override
	public String toString() {
		return "Elev: Nume = " + nume + ", Prenume = " + prenume + ", Varsta = "
				+ varsta + ", Punctaj = " + punctaj + ", NrProiecte = " + nrProiecte  + ", DenumireProiect = "
				+ Arrays.toString(denumireProiect) + "Clasa = " + clasa + ", Tutore = " + tutore;
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public void afiseazaFinantare() {
		System.out.println("Elevul "+getNume()+" "+getPrenume()+" primeste"+finantare+" Euro/zi in proiect.");
	}


}
