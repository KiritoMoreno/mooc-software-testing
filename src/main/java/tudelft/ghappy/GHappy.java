package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str != null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                // Check if "g" is not part of a pair
                if (!(i > 0 && str.charAt(i - 1) == 'g') &&
                        !(i + 1 < str.length() && str.charAt(i + 1) == 'g')) {
                    return false;
                }
            }
        }

        return true;

    }
}
