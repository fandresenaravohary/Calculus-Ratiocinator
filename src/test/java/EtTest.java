import com.CALCULUS.affirmation.Mensonge;
import com.CALCULUS.affirmation.Verite;
import com.CALCULUS.conjonction.Et;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EtTest {
    @Test
    public void testEt_DeuxVerites() {
        Verite verite1 = new Verite("Lou est beau", "Lou est beau");
        Verite verite2 = new Verite("Lou est généreux", "Lou est généreux");

        Et et = new Et(verite1, verite2);

        assertEquals("vrai", et.evaluer(), "Les deux affirmations sont vraies, donc le résultat devrait être vrai.");
    }

    @Test
    public void testEt_UnVerites_et_Un_mensonge(){
        Verite verite1 = new Verite("Lou est beau", "Lou est beau");
        Mensonge mensonge1 = new Mensonge("Lou est pauvre", "Lou est pauvre");

        Et et = new Et(verite1, mensonge1);

        assertEquals("faux", et.evaluer(), "Lun est vrai, l'autre est faux don le resultat devrait etre je ne sais pas");
    }
}
