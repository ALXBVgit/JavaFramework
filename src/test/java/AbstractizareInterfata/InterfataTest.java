package AbstractizareInterfata;

import org.testng.annotations.Test;

public class InterfataTest {
    @Test
    public void testMethod(){

        PersoanaStudent Alex1 = new PersoanaStudent("Alex", "Mirza", 44);
        PersoanaAngajat Alex2 = new PersoanaAngajat("Alex", "Mirza", 44);
        PersoanaStudentAngajat Alex3 = new PersoanaStudentAngajat("Alex", "Mirza", 44);

    }
}
