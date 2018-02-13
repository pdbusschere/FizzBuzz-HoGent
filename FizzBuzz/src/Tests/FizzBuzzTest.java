package Tests;

import Models.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void oneShouldReturnOne(){
        assertEquals("1", FizzBuzz.evaluate(1));
    }

    @Test
    public void twoShouldReturnTwo(){
        assertEquals("2", FizzBuzz.evaluate(2));
    }

    @Test
    public void threeShouldReturnFizz(){
        assertEquals("Fizz", FizzBuzz.evaluate(3));
    }

    @Test
    public void fiveShouldReturnBuzz(){
        assertEquals("Buzz", FizzBuzz.evaluate(5));
    }

    @Test
    public void sixShouldReturnFizz(){
        assertEquals("Fizz", FizzBuzz.evaluate(6));
    }

    @Test
    public void tenShouldReturnBuzz(){
        assertEquals("Buzz", FizzBuzz.evaluate(10));
    }

    @Test
    public void fifteenShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz.evaluate(15));
    }

    @Test
    public void thirtyShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz.evaluate(30));
    }

}
