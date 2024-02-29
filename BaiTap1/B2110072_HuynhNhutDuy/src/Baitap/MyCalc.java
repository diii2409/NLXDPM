package Baitap;

public class MyCalc {
	public int add(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return (b == 0) ? 0 : ((int) a / b);
    }

    public int min(int a, int b) {
        return (a >= b) ? b : a;
    }

    public int max(int a, int b) {
        return (a < b) ? b : a;
    }

    public double mux(double a, int b) {
        return (a ==0 && b == 0 ) ? 0 : Math.pow(a, b);
    }

    public double qrt(double x) {
        return Math.sqrt(x);
    }

    public double progression(double x, double d, int n) {
        return (n < 1) ? x : x * (n) * d;
    }

    public double sumProgression(double x, double d, int n) {
        if (n < 1) {
            return x;
        }
        double result = 0;;
        for (int i = 1; i <= n; ++i) {
            result += x * (i) * d;
        }
        return result;
    }
}
