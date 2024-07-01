package euro2024.turneu;

import euro2024.grupa.Grupa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Euro2024 {

    private String nume;
    private List<Grupa> grupe;
}
