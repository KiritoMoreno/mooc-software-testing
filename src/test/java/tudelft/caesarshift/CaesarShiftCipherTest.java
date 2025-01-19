package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void testValidShifts(){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("cde", cipher.CaesarShiftCipher("abc",2));
        Assertions.assertEquals("xyz", cipher.CaesarShiftCipher("abc", -3));
        Assertions.assertEquals("abc", cipher.CaesarShiftCipher("abc", 26)); // No shift
        Assertions.assertEquals("bcd", cipher.CaesarShiftCipher("abc", 27)); // Shift wraps
    }

    @Test
    void testInvalidCharacters() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("aBc", 2)); // Uppercase not allowed
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("123", 2)); // Digits not allowed
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("abc!", 2)); // Special characters not allowed
    }

    @Test
    void testEmptyString() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals("", cipher.CaesarShiftCipher("", 2)); // Empty string remains empty
    }
}
