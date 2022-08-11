package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int res = 0;

        while (number != 0) {
            int i = number % 10;
            res = res * 10 + i;
            number /= 10;

        }
        System.out.println(res);
    }
}
