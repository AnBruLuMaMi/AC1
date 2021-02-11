package org.anbrulumami.test;

import org.anbrulumami.Arranjo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArranjoTest {
    @Test
    void test() {
        Arranjo a = new Arranjo();

        // Testa se o menor é 510
        Assertions.assertEquals(510, a.menor(), "O menor deve ser 510");

        // Testa se o maior é o 940
        Assertions.assertEquals(940, a.maior(), "O maior deve ser 940");

        // Testa se a soma é 7540
        Assertions.assertEquals(7540, a.soma(), "A soma deve ser 7540");

        // Testa se a quantidade de vezes que o número 3 aparece
        Assertions.assertEquals(0, a.repeticoes(3), "3 deve aparecer 0 vezes");

        // Testa se a quantidade de vezes que o número 790 aparece
        Assertions.assertEquals(1, a.repeticoes(790), "790 deve aparecer 1 vez");

        // Testa se a quantidade de vezes que o número 940 aparece
        Assertions.assertEquals(2, a.repeticoes(940), "940 deve aparecer 2 vezes");
    }
}
