package AbstractizareInterfata;

public class StudentAngajat extends Persoana implements Student, Angajat{
    public StudentAngajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void prezentaCurs() {

    }

    @Override
    public void examinare() {

    }

    @Override
    public void studiat() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void prezentaBirou() {

    }

    @Override
    public void pauzaMasa() {

    }

    @Override
    public void incasatSalariu() {

    }
}
