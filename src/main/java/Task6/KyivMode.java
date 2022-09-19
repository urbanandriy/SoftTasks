package Task6;


public class KyivMode {
    Result result = new Result();

    public void determine(char[][] allWords) {
        int sum1 = 0;
        int sum2 = 0;
        for (char[] chars : allWords) {
            for (int i = 0; i < chars.length; i++) {
                if (i < 3) {
                    sum1 += Character.getNumericValue(chars[i]);
                } else {
                    sum2 += Character.getNumericValue(chars[i]);
                }
            }
            result.addResult(sum1 == sum2);
            sum1 = sum2 = 0;
        }
    }

}
