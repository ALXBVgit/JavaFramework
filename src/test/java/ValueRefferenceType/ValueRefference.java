package ValueRefferenceType;

import org.testng.annotations.Test;

public class ValueRefference {

    public int originalInt = 10;
    public String originalString = "Alex";
    public Fruct mar = new Fruct("mar", "primavara");
    public final int secondInt = 5;

    @Test
    public void testMethod(){
        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("Valoarea initiala este: "+originalInt);

        System.out.println("2. REFFERENCE TYPE - STRING OBJECT");
        refferenceTypeStringExample(originalString);
        System.out.println("Numele initial este: "+originalString);

        System.out.println("3. REFFERENCE TYPE - OBJECT");
        refferenceTypeObjectExample(mar);
        mar.descriere();

        System.out.println("4. FINAL");
//        secondInt = secondInt + 10;
    }

    public void valueTypeExample(Integer value){
        value = value+5;
        System.out.println("Valoarea noua este: " + value);
    }

    public void refferenceTypeStringExample(String value){
        value = value + "Mirza";
        System.out.println("Numele nou este: " + value);
    }
    public void refferenceTypeObjectExample(Fruct fruct){
        fruct.sezon = "toamna";
        fruct.descriere();
    }
}
