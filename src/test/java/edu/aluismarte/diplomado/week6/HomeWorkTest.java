package edu.aluismarte.diplomado.week6;

import com.github.javafaker.Faker;
import edu.aluismarte.diplomado.model.week3.FrequencyType;
import edu.aluismarte.diplomado.model.week3.LoanType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author aluis on 5/2/2022.
 */
class HomeWorkTest {

    private static final boolean REQUIRED_FIELD = true;
    private static final boolean NO_REQUIRED_FIELD = false;
    private static final boolean USE_DEFAULT_VALUE = true;
    private static final boolean NO_USE_DEFAULT_VALUE = false;

    private final HomeWork homeWork = new HomeWork();
    private final Faker faker = new Faker();


    @ParameterizedTest
    @MethodSource("edu.aluismarte.diplomado.week6.HomeWorkTest#provideRandomNames")
    void fullNameFormTest(String name) {
        assertEquals("",homeWork.formValidation(NO_REQUIRED_FIELD, NO_USE_DEFAULT_VALUE,"" , name,""));
        assertEquals("",homeWork.formValidation(NO_REQUIRED_FIELD, NO_USE_DEFAULT_VALUE,name , "",""));
    }

    @ParameterizedTest
    @EnumSource(LoanType.class)
    void loanTypeFormTest(LoanType loanType) {
        assertEquals(loanType,homeWork.formValidation(REQUIRED_FIELD, NO_USE_DEFAULT_VALUE,loanType , "",null));

    }

    @ParameterizedTest
    @MethodSource("edu.aluismarte.diplomado.week6.HomeWorkTest#provideRandomBigDecimals")
    void capitalFormTest(BigDecimal capital) {
        assertEquals(capital,homeWork.formValidation(REQUIRED_FIELD, NO_USE_DEFAULT_VALUE,capital , null,BigDecimal.ZERO));

    }

    @ParameterizedTest
    @EnumSource(FrequencyType.class)
    void frequencyTypeFormTest(FrequencyType frequencyType) {
        assertEquals(FrequencyType.MONTHLY,homeWork.formValidation(REQUIRED_FIELD, NO_USE_DEFAULT_VALUE,FrequencyType.MONTHLY, frequencyType,null));

    }



    @ParameterizedTest
    @MethodSource("edu.aluismarte.diplomado.week6.HomeWorkTest#provideRandomInteger")
    void quotesFormTest(Integer quote) {
        assertEquals(quote,homeWork.formValidation(REQUIRED_FIELD, USE_DEFAULT_VALUE,quote , 12,1));
        assertNull(homeWork.formValidation(REQUIRED_FIELD, USE_DEFAULT_VALUE, null, 12, null));
    }


    @ParameterizedTest
    @MethodSource("edu.aluismarte.diplomado.week6.HomeWorkTest#provideRandomBigDecimals")
    void interestFormTest(BigDecimal interest) {
        BigDecimal defaultValue =  new BigDecimal(8.5);
        assertEquals(defaultValue,homeWork.formValidation(NO_REQUIRED_FIELD, USE_DEFAULT_VALUE,interest ,defaultValue ,BigDecimal.ZERO));
        assertNull(homeWork.formValidation(NO_REQUIRED_FIELD, USE_DEFAULT_VALUE, interest, null, BigDecimal.ZERO));
    }


    @Test
    void startDateFormTest() {

        assertNull(homeWork.formValidation(REQUIRED_FIELD, USE_DEFAULT_VALUE, null, LocalDate.now(), null));

    }

    static Stream<Arguments> provideRandomNames() {
        Faker faker = new Faker();
        return IntStream.range(0, 10).mapToObj(value -> Arguments.of(faker.name().fullName()));
    }

    static Stream<Arguments> provideRandomInteger() {
        SecureRandom securerandom = new SecureRandom();

        return IntStream.range(0, 10).mapToObj(value -> Arguments.of(securerandom.nextInt()));

    }

    static Stream<Arguments> provideRandomBigDecimals() {
        SecureRandom securerandom = new SecureRandom();

        return IntStream.range(0, 10).mapToObj(value -> {
            if (value % 2 == 0) {
                return Arguments.of(new BigDecimal(securerandom.nextInt()));
            }
            return Arguments.of(new BigDecimal(securerandom.nextDouble() + ""));
        });

    }

    static Stream<Arguments> provideRandomNumbersInterest() {
        Faker faker = new Faker();
        return IntStream.range(0, 10).mapToObj(value -> {
            return Arguments.of(faker.number().randomDouble(3,1,20));
        });
    }

}