public class Q1{
    public static void main(String [] args) {
        int n = 2;
     System.out.println(isOdd(n));

    }
    private static boolean isOdd(int n){
        return ( n & 1) == 1;
    }
}
