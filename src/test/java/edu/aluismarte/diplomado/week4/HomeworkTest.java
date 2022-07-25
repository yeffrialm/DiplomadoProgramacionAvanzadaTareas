package edu.aluismarte.diplomado.week4;

import edu.aluismarte.diplomado.model.week4.Operation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Escribir los test del código
 *
 * @author aluis on 5/1/2022.
 */
public class HomeworkTest {

    private final Homework homework = new Homework();
    private static final File file =  new File("sumTest.txt");


    @AfterAll
     static void afterAllTest(){
       assertTrue(file.delete());
    }

    @Test
    void fileNullTest(){
        Assertions.assertThrows(NullPointerException.class, ()->{

            // se castea el parametro y polimorfismo indique la funcion a utilizar
            homework.calculateAndSave(null,null,null,(File) null);
        });

    }

    @Test
    void operationNullTest(){
        Assertions.assertThrows(Homework.OperationNullException.class, ()->{

            // se castea el parametro y polimorfismo indique la funcion a utilizar
            homework.calculateAndSave(null,null,null,(PrintWriter) null);
        });

    }

    @Test
    void sumOperationTest(){
        StringWriter stringWriter = new StringWriter();
        homework.calculateAndSave(Operation.SUM,2.0,3.0,stringWriter);
        assertEquals("Result is: 5.0",stringWriter.toString());
    }

    @Test
    void divideOperationTest(){
        StringWriter stringWriter = new StringWriter();
        homework.calculateAndSave(Operation.DIV,10.0,2.0,stringWriter);
        assertEquals("Result is: 5.0",stringWriter.toString());
    }

    @Test
    void multiplicationOperationTest(){
        StringWriter stringWriter = new StringWriter();
        homework.calculateAndSave(Operation.MULT,2.0,3.0,stringWriter);
        assertEquals("Result is: 6.0",stringWriter.toString());
    }


    @Test
    void writeInFileTest() throws Exception {

        homework.calculateAndSave(Operation.MULT,2.0,3.0,file);
        assertTrue(file.exists());
        byte[] bytes = Files.readAllBytes(file.toPath());
        String data = new String(bytes);

        assertEquals("Result is: 6.0", data);
    }
}
