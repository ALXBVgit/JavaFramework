package Obiect;

public class Masina {

    // constructor = are ca rol sa initializeze variabilele unei clase
    // putem sa recunoastem un constructor dupa numele clasei
    // de cele mai multe ori, constructorul este public
    // exista 2 dipuri de constructor: cu parametrii sau fara parametrii
    // intr-o clasa Java exista un constructor default fara parametrii
    // obiect = instanta unei clase
    // dintr-o clasa putem instantia n obiecte
    // obiectele se diferentiaza prin numele lor sau prin numarul de parametrii pe care il primesc
    // in momentul cand un obiect primeste valori (se initializeaza), se apeleaza contructorul din clasa
    private String marca;
    private String model;
    private String culoare;
    private String carburant;
    private Integer an;
    private Integer capacitateCilindrica;
    private Integer pret;

    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer capacitateCilindrica) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    //exista 4 concepte oop: mostenire, incapsulare, abstractizare, polimorfism

    //MOSTENIRE = conceptul prin care o clasa este mostenita (sau extinsa) de o alta clasa
    //cand o clasa mosteneste o alta clasa, se formeaza o relatie de parinte-copil
    //in Java, o clasa poate mosteni doar o singura clasa
    //cand se aplica mostenirea, copilul poate accesa toate variabilele/metodele din parinte (daca sunt public /protected)
    //in momentul cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte cu 'super"

    //INCAPSULARE = conceptul prin care excludem posibiliatatea ca unele informatii sa fie modificate din exteriorul clasei
    //Access control in Java: public, private, protected, default
    //public = ofera vizibilitate in toate pachetele din proiect
    //private = restrange vizibilitatea doar in calasa unde este definit
    //ca sa oferim vizibilitate proprietatilor in alte clase, apelam la conceptul getter/setter

    //POLIMORFISM = conceptul prin care o metoda poate avea implementari diferite
    //polimorfism de 2 feluri: dinamic (overwrite) si static (overload)
    //polimorfismul dinamic: intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    //polimorfismul dinamic se regaseste tot timpul in procesul de mostenire
    //polimorfismul static: posibilitatea prin care o metoda cu acelasi nume sa fie impelementata de mai multe ori
    //diferentierea intre aceste metode se face prin numarul sau tipul de parametrii
    //polimorfismul static se poate aplica doar la metodele cu void



    public Masina(String marca, String model, String culoare, String carburant,
                  Integer an, Integer capacitateCilindrica, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.capacitateCilindrica = capacitateCilindrica;
        this.pret = pret;
    }

    //definim prima implementare pentru o metoda pe care o vom suprascrie

    public void pornesteMasina(){
        System.out.println("Masina porneste de la cheie.");
    }



    public void prezentareMasina(){
        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Culoarea masinii este "+culoare);
        System.out.println("Carburantul utilizat este "+carburant);
        System.out.println("Anul fabricatiei este "+an);
        System.out.println("Capacitatea cilindrica este "+capacitateCilindrica);

        if (pret != null){
            System.out.println("Pretul masinii este "+pret);
        }
        else {
            System.out.println("Masina a fost oferita gratuit !");
        }
    }

    //fabriactie >=2023 => impozit 5 RON
    //intre 2020 - 2023 => impozit 10 RON
    //mai vechi de 2020 => 20 RON
    public void definireImpozit(){
        if (an >= 2023) {
            System.out.println("Pentru "+marca+" din anul "+an+" impozitul este 5 RON");
        }
        else if (an>2020 && an<2023){
            System.out.println("Pentru "+marca+" din anul "+an+" impozitul este 10 RON");
        }
        else if(an==2020){
            System.out.println("Pentru "+marca+" din anul "+an+" impozitul este 20 RON");
        }
        else {
            System.out.println("Pentru masini mai vechi de 2020 nu se plateste impozit");
        }

        }


    //facem getter/setter

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }
    public String getCuloare() {
        return culoare;
    }
    public String getCarburant() {
        return carburant;
    }
    public Integer getAn() {
        return an;
    }
    public Integer getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public Integer getPret() {
        return pret;
    }



    public void setModel(String model) {
        this.model = model;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

//    public void setCapacitateCilindrica(Integer capacitateCilindrica) {
//        this.capacitateCilindrica = capacitateCilindrica;
//    }
}


