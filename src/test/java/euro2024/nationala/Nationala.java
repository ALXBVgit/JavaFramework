package euro2024.nationala;

import euro2024.antrenor.Antrenor;
import euro2024.fotbalist.pozitii.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nationala {

    private String denumire;
    private Integer nrJucatori;
    private Antrenor antrenor;
    private List<AtacantCentral> atacantiCentrali;
    private List<AtacantLateral> atacantiLaterali;
    private List<FundasCentral> fundasiCentrali;
    private List<FundasLateral> fundasiLaterali;
    private List<FundasOfensiv> fundasiOfensivi;
    private List<JucatorTerenUniversal> jucatoriTerenUniversali;
    private List<MijlocasCentral> mijlocasiCentrali;
    private List<MijlocasDefensiv> mijlocasiDefensivi;
    private List<MijlocasOfensiv> mijlocasiOfensivi;
    private List<Portar> portari;
}
