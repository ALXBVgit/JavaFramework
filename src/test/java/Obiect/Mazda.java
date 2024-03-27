package Obiect;

import java.util.List;

public class Mazda extends Masina {

    private List<String> dotariInterior;
    private List<String> dotariExterior;
    private Integer pretFinal;

    public Mazda(String marca, String model, String culoare, String carburant, Integer an,
                 Integer capacitateCilindrica, Integer pret,
                 List<String> dotariInterior, List<String> dotariExterior) {
        super(marca, model, culoare, carburant, an, capacitateCilindrica, pret);
        this.dotariInterior = dotariInterior;
        this.dotariExterior = dotariExterior;
    }

    public void prezentareMazda() {
        prezentareMasina();
        calculDotari();
        System.out.println("Dotarile exterioare sunt " + dotariExterior);
        System.out.println("Dotarile interioare sunt " + dotariInterior);
        System.out.println("Pretul cu dotari este " + pretFinal);
    }

    //polimorfism static
    public void afisarePret(){
        System.out.println(pretFinal);
    }

    public void afisarePret(Integer reducere){
        System.out.println("Pret reducere");
    }

    public void afisarePret(String voucher){
        System.out.println("Pret voucher");
    }



    public void calculDotari() {
        pretFinal = getPret();
        for (Integer index = 0; index < dotariInterior.size(); index++) {
            switch (dotariInterior.get(index)) {
                case "incalzire scaune":
                    pretFinal += 250;
                    break;
                case "HUD":
                    pretFinal += 250;
                    break;
                case "senzori adormire":
                    pretFinal += 150; //pretFinal += 150 inlocuieste sintaxa pretFinal = pretFinal + 150;
                    break;
            }
        }
        for (Integer index = 0; index < dotariExterior.size(); index++) {
            switch (dotariExterior.get(index)) {
                case "faruri LED":
                    pretFinal += 400;
                    break;
                case "camera trafic":
                    pretFinal += 350;
                    break;
            }
        }
    }

    @Override
    public void pornesteMasina() {
        System.out.println("Mazda porneste cu neurolink :-P");
    }
}

