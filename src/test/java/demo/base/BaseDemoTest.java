package demo.base;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    BaseDemo baseDemo;

    @BeforeEach
    public void setup(){
        baseDemo = new BaseDemo();
    }
    @Test
    public void should_return_hello_world() {

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void shouldReturnFive(){
        assertEquals(5, baseDemo.sum(3,2));
    }

    @Test
    public void shouldReturnNegativeSeven(){
        assertEquals(-7, baseDemo.sum(-5,-2));
    }
}
