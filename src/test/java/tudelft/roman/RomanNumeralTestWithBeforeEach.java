package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    // We can avoid repetition, so we can use @BeforeEach annotation.
    // Methods with that annotation are executed before each individual test.
    private RomanNumeral roman;
    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNum(){
        int result = roman.convert("V");
        Assertions.assertEquals(5,result);
    }

    @Test
    public void numWithManyDig(){
        int result = roman.convert("XIII");
        Assertions.assertEquals(13, result);
    }


    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numWithSubNotation(){
        int result = roman.convert("IX");
        Assertions.assertEquals(9, result);
    }


    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
