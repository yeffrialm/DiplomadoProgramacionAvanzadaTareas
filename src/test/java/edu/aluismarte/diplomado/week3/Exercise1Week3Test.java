package edu.aluismarte.diplomado.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author aluis on 5/8/2022.
 */
class Exercise1Week3Test {

    private final Exercise1Week3 Exercise1Week3 = new Exercise1Week3();

    @Test
    void nullValueTest() {
        assertThrows(NullPointerException.class, () -> Exercise1Week3.fizzbuzz1(null));
    }

    @Test

    void  divisibleBy3Case1Test(){assertEquals(Exercise1Week3.BUZZ, Exercise1Week3.fizzbuzz1(3));}

    @Test

    void  divisibleBy5Case1Test(){assertEquals(Exercise1Week3.FIZZ, Exercise1Week3.fizzbuzz1(5));}

    @Test

    void  divisibleBy3And5Case1Test(){assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz1(15));}


    @Test
    void noDivisorTest() {assertEquals("4", Exercise1Week3.fizzbuzz1(4));
    }

    @Test
    void useZeroTest() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz1(0));
    }

    @Test
    void negativeNumberTest() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz1(-15));
    }

    @Test
    void negativeNoDividerTest() {assertEquals("-4", Exercise1Week3.fizzbuzz1(-4));
    }

    //Segunda forma de solucionarlo

    @Test
    void nullValueTest2() {
        assertThrows(NullPointerException.class, () -> Exercise1Week3.fizzbuzz2(null));
    }

    @Test

    void  divisibleBy3Case1Test2(){assertEquals(Exercise1Week3.BUZZ, Exercise1Week3.fizzbuzz2(3));}

    @Test

    void  divisibleBy5Case1Test2(){assertEquals(Exercise1Week3.FIZZ, Exercise1Week3.fizzbuzz2(5));}

    @Test

    void  divisibleBy3And5Case1Test2(){assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz2(15));}


    @Test
    void noDivisorTest2() {assertEquals("4", Exercise1Week3.fizzbuzz2(4));
    }

    @Test
    void useZeroTest2() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz2(0));
    }

    @Test
    void negativeNumberTest2() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz2(-15));
    }

    @Test
    void negativeNoDividerTest2() {assertEquals("-4", Exercise1Week3.fizzbuzz2(-4));
    }

    //Tercera forma de solucionarlo

    @Test
    void nullValueTest3() {
        assertThrows(NullPointerException.class, () -> Exercise1Week3.fizzbuzz3(null));
    }

    @Test

    void  divisibleBy3Case1Test3(){assertEquals(Exercise1Week3.BUZZ, Exercise1Week3.fizzbuzz3(3));}

    @Test

    void  divisibleBy5Case1Test3(){assertEquals(Exercise1Week3.FIZZ, Exercise1Week3.fizzbuzz3(5));}

    @Test

    void  divisibleBy3And5Case1Test3(){assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz3(15));}


    @Test
    void noDivisorTest3() {assertEquals("4", Exercise1Week3.fizzbuzz3(4));
    }

    @Test
    void useZeroTest3() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz3(0));
    }

    @Test
    void negativeNumberTest3() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz3(-15));
    }

    @Test
    void negativeNoDividerTest3() {assertEquals("-4", Exercise1Week3.fizzbuzz3(-4));
    }
    //Cuarta forma de solucionarlo

    @Test
    void nullValueTest4() {
        assertThrows(NullPointerException.class, () -> Exercise1Week3.fizzbuzz4(null));
    }

    @Test

    void  divisibleBy3Case1Test4(){assertEquals(Exercise1Week3.BUZZ, Exercise1Week3.fizzbuzz4(3));}

    @Test

    void  divisibleBy5Case1Test4(){assertEquals(Exercise1Week3.FIZZ, Exercise1Week3.fizzbuzz4(5));}

    @Test

    void  divisibleBy3And5Case1Test4(){assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz4(15));}


    @Test
    void noDivisorTest4() {assertEquals("4", Exercise1Week3.fizzbuzz4(4));
    }

    @Test
    void useZeroTest4() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz4(0));
    }

    @Test
    void negativeNumberTest4() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz4(-15));
    }

    @Test
    void negativeNoDividerTest4() {assertEquals("-4", Exercise1Week3.fizzbuzz4(-4));
    }

    //Quinta forma de solucionarlo

    @Test
    void nullValueTest5() {
        assertThrows(NullPointerException.class, () -> Exercise1Week3.fizzbuzz5(null));
    }

    @Test

    void  divisibleBy3Case1Test5(){assertEquals(Exercise1Week3.BUZZ, Exercise1Week3.fizzbuzz5(3));}

    @Test

    void  divisibleBy5Case1Test5(){assertEquals(Exercise1Week3.FIZZ, Exercise1Week3.fizzbuzz5(5));}

    @Test

    void  divisibleBy3And5Case1Test5(){assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz5(15));}


    @Test
    void noDivisorTest5() {assertEquals("4", Exercise1Week3.fizzbuzz5(4));
    }

    @Test
    void useZeroTest5() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz5(0));
    }

    @Test
    void negativeNumberTest5() {assertEquals(Exercise1Week3.FIZZBUZZ, Exercise1Week3.fizzbuzz5(-15));
    }

    @Test
    void negativeNoDividerTest5() {assertEquals("-4", Exercise1Week3.fizzbuzz5(-4));
    }

}