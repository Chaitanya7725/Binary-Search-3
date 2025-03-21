// TC: O(log n)
// SC: O(log n)
public class Powxn {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10)); // 1024.0
    }

    public static double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        double y = myPow(x, n / 2);
        if (n % 2 == 0) {
            return y * y;
        } else {
            if (n > 0) {
                return y * y * x;
            } else {
                return y * y * 1 / x;
            }
        }
    }
}