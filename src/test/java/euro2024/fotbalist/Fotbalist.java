package euro2024.fotbalist;

import euro2024.Persoana;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fotbalist extends Persoana {

    private String pozitieTeren;
    private Integer nrTricou;
    private String club;
    private String nationala;
    private Boolean esteCapitan;
    private Boolean esteTitular;

    public Fotbalist(String nume, String prenume, Integer varsta, String oras, Double rating, String nationalitate,
                     String pozitieTeren, Integer nrTricou, String club, String nationala, Boolean esteCapitan, Boolean esteTitular) {
        super(nume, prenume, varsta, oras, rating, nationalitate);

        this.pozitieTeren = pozitieTeren;
        this.nrTricou = nrTricou;
        this.club = club;
        this.nationala = nationala;
        this.esteCapitan = esteCapitan;
        this.esteTitular = esteTitular;
    }
}
