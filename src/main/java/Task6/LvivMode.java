package Task6;

public class LvivMode {
    Result result = new Result();

    public void determine(char[][] allWords) {
        int sum1 = 0;
        int sum2 = 0;
        for (char[] chars : allWords) {
            for (char c : chars) {
                if (Character.getNumericValue(c) % 2 == 0) {
                    sum1 += Character.getNumericValue(c);
                } else if (Character.getNumericValue(c) % 2 != 0) {
                    sum2 += Character.getNumericValue(c);
                }
            }
            result.addResult(sum1 == sum2);
            sum1 = sum2 = 0;
        }
    }
}

