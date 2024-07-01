package euro2024.antrenor;

import euro2024.Persoana;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Antrenor extends Persoana implements AntrenorInterface{
    private Integer aniExperienta;
    private String echipaNationala;
    private Integer nrTrofee;

    public Antrenor(String nume, String prenume, Integer varsta, String oras, Double rating, String nationalitate,
                    Integer aniExperienta, String echipaNationala, Integer nrTrofee) {
        super(nume, prenume, varsta, oras, rating, nationalitate);
        this.aniExperienta = aniExperienta;
        this.echipaNationala = echipaNationala;
        this.nrTrofee = nrTrofee;
    }

    @Override
    public void strategieAntrenamente() {

    }

    @Override
    public void selectionare() {

    }

    @Override
    public void implementareStrategii() {

    }

    @Override
    public void conferintaPresa() {

    }
}

