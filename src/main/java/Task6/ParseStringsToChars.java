package Task6;


public class ParseStringsToChars {
    public char[][] parse(String[] s) {
        char[][] allWords = new char[s.length][6];
        for (int i = 0; i < s.length; i++) {
            char[] word = s[i].toCharArray();
            System.arraycopy(word, 0, allWords[i], 0, word.length);
        }
        return allWords;
    }

}
