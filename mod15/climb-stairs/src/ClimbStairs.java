public class ClimbStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Número de maneiras de subir " + n + " degraus: " + climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
