public class Q4 {
    public static void main (String[] args) {
        int n = 203; 
        int temp = n ;
        int r , sum = 0 ;
        while (n>0)
        {
            r = n%10 ; 
            n = n/10 ; 
            sum = sum + r*r*r ; 

        }
        if (temp == sum){
            System.out.println(" its an Armstrong number");
        }else{
            System.out.println("its not an armstrong number");
        }
    }
}
