public class Mathh {
    public static class Factorial {
        private int res;
        private int key;

        public Factorial(int res, int key) {
            this.res = res;
            this.key = key;
        }

        public int getRes() {
            return res;
        }

        public int getKey() {
            return key;
        }
    }

    public static Factorial getFactorial(int x) {
        int res = 1;
        for (int i = 1; i < res; i++) {
            res *= i;
        }
        return new Factorial(res, x);
    }

}
