package euro2024;

import com.fasterxml.jackson.databind.ObjectMapper;
import euro2024.turneu.Euro2024;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class RecapitulareTest {
    @Test

    public void MetodaTeste(){
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/test/java/euro2024/TestData.json");

        try {
            Euro2024 euro2024 = objectMapper.readValue(jsonFile, Euro2024.class);
            System.out.println("Succesfully read data form EURO2024 Json file");
            System.out.println(euro2024);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
