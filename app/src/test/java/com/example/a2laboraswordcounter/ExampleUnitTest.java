
package com.example.a2laboraswordcounter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleUnitTest {

    //tuscio teksto testas
    @Test
    public void testEmptyText() {
        Textcounter counter = new Textcounter();

        int result = counter.countWords("");

        assertEquals(0, result);
    }

    //paprasto teksto testas
    @Test
    public void testNormalText() {
        Textcounter counter = new Textcounter();

        int result = counter.countWords("Labas kaip sekasi");

        assertEquals(3, result);
    }

    //tik tarpu testas
    @Test
    public void testOnlySpaces() {
        Textcounter counter = new Textcounter();

        int result = counter.countWords("     ");

        assertEquals(0, result);
    }

    //tik skyrybos zenklu testas
    @Test
    public void testOnlySigns() {
        Textcounter counter = new Textcounter();

        int result = counter.countSigns(".,!?");

        assertEquals(4, result);
    }

    //tusciu teksto zenklu testas
    @Test
    public void testEmptySigns() {
        Textcounter counter = new Textcounter();

        int result = counter.countSigns("");

        assertEquals(0, result);
    }

    //zenklu sakinyje testas
    @Test
    public void testNormalSigns() {
        Textcounter counter = new Textcounter();

        int result = counter.countSigns("Labas, kaip sekasi?");

        assertEquals(2, result);
    }

    //tarpu-zenklu testas
    @Test
    public void testSignsWithSpaces() {
        Textcounter counter = new Textcounter();

        int result = counter.countSigns("     ");

        assertEquals(0, result);
    }


}
