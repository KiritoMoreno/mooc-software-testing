package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        if (message == null) {
            return "invalid";
        }

        StringBuilder sb = new StringBuilder();
        shift = shift % 26; // Normalize shift within 0-25

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            // Check if the character is a lowercase letter
            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            }

            // Apply the shift
            char shiftedChar = (char) (currentChar + shift);

            // Wrap around if needed
            if (shiftedChar > 'z') {
                shiftedChar -= 26;
            } else if (shiftedChar < 'a') {
                shiftedChar += 26;
            }

            // Append the shifted character
            sb.append(shiftedChar);
        }

        return sb.toString();
    }
}
