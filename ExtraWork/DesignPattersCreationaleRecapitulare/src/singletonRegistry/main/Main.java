package singletonRegistry.main;

import singletonRegistry.clase.Pachet;
import singletonRegistry.clase.PachetRegistry;

public class Main {
    public static void main(String[] args) {
        Pachet pachetCazare= new Pachet("Pachet Cazare", "PachetCazare",3208.64f);
        Pachet pachetAllInclusive= new Pachet("Pachet ai", "PachetAllInclusive",3208.64f);
        Pachet pachetTransport= new Pachet("PachetCazare", "PachetTransport",3208.64f);
        Pachet pachetCazareLux= new Pachet("Pachet Cazare Lux", "PachetCazareLux",3208.64f);

        try{
            PachetRegistry.inregistrarePachet(pachetCazare.getTipPachet(), pachetCazare);
            PachetRegistry.inregistrarePachet(pachetCazareLux.getTipPachet(), pachetCazareLux);
            PachetRegistry.inregistrarePachet(pachetAllInclusive.getTipPachet(), pachetAllInclusive);
            PachetRegistry.inregistrarePachet(pachetTransport.getTipPachet(), pachetTransport);

        }catch(RuntimeException e){
            System.out.println("Nu s-a putut adauga pachetul");
        }
    }
}