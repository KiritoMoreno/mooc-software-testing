package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNum(){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("V");
        Assertions.assertEquals(5,result);
    }

    @Test
    public void numWithManyDig(){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XIII");
        Assertions.assertEquals(13,result);
    }

    @Test
    public void numWithSubDigit(){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IX");
        Assertions.assertEquals(9,result);
    }
    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
