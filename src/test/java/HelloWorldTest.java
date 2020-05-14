import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class HelloWorldTest {

    @Test
    public void HelloWorldTest()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        HelloWorld.main(null);

        // assertion
        assertEquals("Hello world!\n", bos.toString(), "Hello World doesn't match");

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void ShouldWorkTest()
    {

        // assertion
        assertEquals(1, 1);


    }
}
