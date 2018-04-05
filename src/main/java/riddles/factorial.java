package riddles;

public class factorial {

    public int fac(int i) {

        int result;

        if (i == 0 || i == 1) return 1;

        else result = fac(i - 1) * i;

        return result;
    }

}