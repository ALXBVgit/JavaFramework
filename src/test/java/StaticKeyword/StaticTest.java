package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void metodaTest(){
        Elev elev1 = new Elev("Alex", "Mirza");
        elev1.prezentare();

        System.out.println();

        Elev elev2 = new Elev("Alex2", "Mirza2");
        elev2.prezentare();

        System.out.println();

        Elev elev3 = new Elev("Bubu", "Lina");
        elev3.prezentare();

    }
}
