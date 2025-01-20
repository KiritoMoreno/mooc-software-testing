package tudelft.countletters;

public class CountLetters {

    public int count(String str) {
        char last = ' ';
        int words = 0;
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i)) &&
                    (last == 'r' || last == 's')) {
                words++;
            }

            last = str.charAt(i);
        }

        if(last == 'x' || last == 's')
            words++;

        return words;
    }

}