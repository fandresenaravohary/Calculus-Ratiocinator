import com.CALCULUS.affirmation.Mensonge;
import com.CALCULUS.affirmation.Verite;
import com.CALCULUS.conjonction.Ou;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OuTest {
    @Test
    public void testOu_DeuxVerites(){
        Verite verite1 = new Verite("Lou est beau", "Lou est beau");
        Verite verite2 = new Verite("Lou est généreux", "Lou est généreux");

        Ou ou = new Ou(verite1, verite2);

        assertEquals("vrai", ou.evaluer(), "Les deux affirmations sont vraies, donc le résultat devrait être vrai.");
    }

    @Test
    public void testOu_UnVerité_UnMensonge(){
        Verite verite1 = new Verite("Lou est beau", "Lou est beau");
        Mensonge mensonge1 = new Mensonge("Lou est pauvre", "Lou est pauvre");

        Ou ou = new Ou(verite1, mensonge1);

        assertEquals("vrai", ou.evaluer(), "L'un des affirmations est vrai, donc le résultat devrait être vrai.");
    }

    @Test
    public void testOu_DeuxMensonge() {
        Mensonge mensonge1 = new Mensonge("Lou est beau", "Lou est beau");
        Mensonge mensonge2 = new Mensonge("Lou est pauvre", "Lou est pauvre");
        Ou ou = new Ou(mensonge1, mensonge2);
        assertEquals("faux", ou.evaluer(), "Les deux affirmations sont fausses, donc le résultat devrait être faux.");
    }

}
