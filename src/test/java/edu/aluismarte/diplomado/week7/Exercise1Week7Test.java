package edu.aluismarte.diplomado.week7;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * El objetivo será hacer que se ejecute un log pero
 * a su vez en el proceso se registre otra línea que
 * parezca un log real pero que sea ilegal
 *
 * @author aluis on 5/9/2022.
 */
class Exercise1Week7Test {

    private final Exercise1Week7 exercise1Week7 = new Exercise1Week7();

    @Nested
    class WorseLogTest {

        @Test
        void normalLogTest() {
            exercise1Week7.worseLog("Normal Parameter");
        }

        @Test
        void anormalLogTest() {
            exercise1Week7.worseLog("demo\nother Parameter");
        }

    }

    @Nested
    class BadLogTest {

        @Test
        void normalLogTest() {
            exercise1Week7.badLog("Normal Parameter");
        }

        @Test
        void anormalLogTest() {
            exercise1Week7.badLog("Normal Parameter\notra vez\ny otra mas");
        }

    }

    @Nested
    class GoodLogTest {

        @Test
        void normalLogTest() {
            exercise1Week7.goodLog("Normal Parameter");
        }

        @Test
        void anormalLogTest() {
            exercise1Week7.goodLog("Normal Parameter\nvamos a ver si ahora lo hace");
        }

    }

}