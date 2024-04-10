package WrapperClass;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Curs {

    public int primitiva;
    public Integer wrapper;

    public void metoda(){
        primitiva = 10;
        wrapper = 9;
        wrapper.toString();

        int [] multime = new int[3];
        Integer [] multime2 = new Integer[5];

//        List <int> multime3 = new ArrayList<>();
        List <Integer> multime4 = new ArrayList<>();
    }
}
