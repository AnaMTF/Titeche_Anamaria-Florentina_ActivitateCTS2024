package main;
import classes.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import  classes.Angajat;
import reader.AngajatReader;
import reader.AplicantReader;

public class Main {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader angajatReader = new AngajatReader();
			listaAngajati = angajatReader.read("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		List<Aplicant> listaStudenti;
		try {
			AplicantReader studentReader = new AngajatReader();
			listaStudenti = studentReader.read("studenti.txt");
			for(Aplicant student:listaStudenti)
				System.out.println(student.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		List<Aplicant> listaElevi;
		try {
			AplicantReader elevReader = new AngajatReader();
			listaElevi = elevReader.read("elevi.txt");
			for(Aplicant elev:listaElevi)
				System.out.println(elev.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
