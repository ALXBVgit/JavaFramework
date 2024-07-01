package euro2024.fotbalist.pozitii;

import euro2024.fotbalist.Fotbalist;
import euro2024.fotbalist.interfete.FundasInterface;
import euro2024.fotbalist.interfete.MijlocasInterface;

import java.text.Format;

public class MijlocasDefensiv extends Fotbalist implements MijlocasInterface, FundasInterface {
    public MijlocasDefensiv(String nume, String prenume, Integer varsta, String oras, Double rating, String nationalitate,
                            String pozitieTeren, Integer nrTricou, String club, String nationala, Boolean esteCapitan, Boolean esteTitular) {
        super(nume, prenume, varsta, oras, rating, nationalitate, pozitieTeren, nrTricou, club, nationala, esteCapitan, esteTitular);
    }

    @Override
    public void recupereazaMingea() {

    }

    @Override
    public void faulteaza() {

    }

    @Override
    public void aparaCareul() {

    }

    @Override
    public void lovesteCuCapul() {

    }

    @Override
    public void paseazaLaPortar() {

    }

    @Override
    public void mentinePosesia() {

    }

    @Override
    public void executaCorner() {

    }

    @Override
    public void executaLovituriLibere() {

    }

    @Override
    public void alearga() {

    }

    @Override
    public void dribleaza() {

    }

    @Override
    public void paseaza() {

    }

    @Override
    public void suteaza() {

    }

    @Override
    public void marcheaza() {

    }
}
