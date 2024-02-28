package main;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Aplicant;
import reader.AngajatReader;
import reader.AplicantReader;
import reader.ElevReader;
import reader.StudentReader;

public class Program {

	public static void main(String[] args) {
		System.out.println("=== Angajati === ");
		List<Aplicant> listaAngajati;
		try {
			AplicantReader angajatReader = new AngajatReader();
			listaAngajati = angajatReader.read("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("=== Elevi === ");
		List<Aplicant> listaElevi;
		try {
			AplicantReader elevReader = new ElevReader();
			listaElevi = elevReader.read("elevi.txt");
			for(Aplicant elev:listaElevi)
				System.out.println(elev.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("=== Studenti === ");
		List<Aplicant> listaStudenti;
		try {
			AplicantReader studentReader = new StudentReader();
			listaStudenti = studentReader.read("studenti.txt");
			for(Aplicant student:listaStudenti)
				System.out.println(student.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
