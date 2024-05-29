package b.ex10.clase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private LocalDateTime dataRezervare;

    public Rezervare(int nrMasa, int nrPersoane, LocalDateTime dataRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.dataRezervare = dataRezervare;
    }

    @Override
    public String toString() {
        return String.format("Rezervarea la masa %d de %d persoane din data de %s%n", this.nrMasa, this.nrPersoane, this.dataRezervare.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
}
