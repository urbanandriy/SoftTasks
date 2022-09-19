package Task6;

import java.util.ArrayList;

public class Result {
    private static final ArrayList<Boolean> r = new ArrayList<>();

    public void addResult(boolean result) {
        r.add(result);
    }

    public long resultCounter() {
        return r.stream().filter(e -> e).count();
    }

}
