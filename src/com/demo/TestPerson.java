package com.demo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestPerson {
    @Test
    public void shouldReturnHelloworld(){
        Personhello obj1 = new Personhello();
        assertEquals("hello world", obj1.hello());
    }
    @Test
    public void shouldReturnhelloDana(){
        Personhello dana = new Personhello();
        assertEquals("Hello Dana",dana.hellod("Dana"));
    }
}
