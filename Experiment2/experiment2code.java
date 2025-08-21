class experiment2code {
    public static long power(long base, long exp) {
        if (exp == 0) return 1;
        if (exp == 1) return base;

        long half = power(base, exp / 2);

        if (exp % 2 == 0) {
            return half * half;        // Even exponent
        } else {
            return base * half * half; // Odd exponent
        }
    }

    public static void main(String[] args) {
        long base = 2;
        long exp = 10;

        System.out.println(base + "^" + exp + " = " + power(base, exp));
    }
}
