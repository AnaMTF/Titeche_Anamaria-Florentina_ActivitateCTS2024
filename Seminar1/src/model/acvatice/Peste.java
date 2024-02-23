package model.acvatice;

import model.animale.Vietate;

public abstract class Peste implements Vietate {

        private int nrInotatoare;
        private String rasa;

        public int getNrInotatoare() {
            return nrInotatoare;
        }

        public String getRasa() {
            return rasa;
        }

        public void setNrInotatoare(int nrInotatoare) {
            this.nrInotatoare = nrInotatoare;
        }

        public void setRasa(String rasa) {
            this.rasa = rasa;
        }

         public Peste(int nrInotatoare, String rasa) {
            this.nrInotatoare = nrInotatoare;
            this.rasa = rasa;
        }

}
