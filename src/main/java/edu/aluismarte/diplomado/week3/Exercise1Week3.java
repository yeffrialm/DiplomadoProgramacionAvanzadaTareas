package edu.aluismarte.diplomado.week3;

/**
 * @author aluis on 5/8/2022.
 */
public class Exercise1Week3 {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = FIZZ + BUZZ;

    /**
     * Un número es Fizz cuando es divisible entre 5
     * Un número es Buzz cuando es divisible entre 3
     * Un número es FizzBuzz cuando es divisible entre 3 y 5 al mismo tiempo
     * Si no cumple con ninguna condición anterior se retorna el número
     *
     * @param number número a comprobar para saber si es Fizz, Buzz o FizzBuzz
     * @return Un string que es igual a Fizz, Buzz o FizzBuzz
     */
    public String fizzbuzz1(Integer number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return FIZZBUZZ;
        } else if (number % 5 == 0) {
            return FIZZ;
        } else if (number % 3 == 0) {
            return BUZZ;
        }

        return number + "";
    }

    //Otra manera de solucionarlo Minimo comun divisor
    public String fizzbuzz2(Integer number) {
        if (number % 15 == 0) {
            return FIZZBUZZ;
        } else if (number % 5 == 0) {
            return FIZZ;
        } else if (number % 3 == 0) {
            return BUZZ;
        }

        return number + "";
    }

    //Otra manera de solucionarlo
    public String fizzbuzz3(Integer number) {
        String result = "";

        if (number % 5 == 0) {
            result += "Fizz";
        }
        if (number % 3 == 0) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            result += number;
        }

        return result;
    }

    //La misma manera pero mas elegante
    public String fizzbuzz4(Integer number) {
        String result = "";

        if (number % 5 == 0) {
            result += "Fizz";
        }
        if (number % 3 == 0) {
            result += "Buzz";
        }

        return result.isEmpty() ? number + "" : result;
    }

    //Otra manera
    public String fizzbuzz5(Integer number) {
        StringBuilder stringbuilder = new StringBuilder();

        if (number % 5 == 0) {
            stringbuilder.append("Fizz");
        }
        if (number % 3 == 0) {
            stringbuilder.append("Buzz");
        }

        return stringbuilder.isEmpty() ? number + "" : stringbuilder.toString();
    }
}
