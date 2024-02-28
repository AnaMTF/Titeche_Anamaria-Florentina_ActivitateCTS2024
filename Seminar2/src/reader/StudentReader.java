package reader;

import clase.Aplicant;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    @Override
    public List<Aplicant> read(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student aplicant = new Student();
            super.readAplicant(input, aplicant);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            aplicant.setFacultate(facultate);
            aplicant.setAnStudii(an_studii);
            studenti.add(aplicant);
        }
        input.close();
        return studenti;
    }
}
