public class Solution {


    /**
     * Return True if and only if A can become B after 
     * some number of shifts on A.
     * 
     * Runtime: 1 ms, faster than 38.80% of Java online submissions.
     * Memory Usage: 39 MB, less than 19.69% of Java online submissions.
     */
    static boolean rotateString(String A, String B) {
        
        // **** check if string lengths do not match ****
        if (A.length() != B.length())
            return false;

        // **** check if the strings are equal ****
        if (A.equals(B))
            return true;

        // **** ****
        StringBuilder sba = new StringBuilder(A);

        // **** ****
        for (int i = 0; i < sba.length(); i++) {

            // **** first character ****
            char ch = sba.charAt(0);

            // **** append character ****
            sba.append(ch);

            // **** remove first character ****
            sba.deleteCharAt(0);

            // **** comapre strings ****
            if (B.equals(sba.toString()))
                return true;
        }

        // **** strings do not match ****
        return false;
    }


    /**
     * Return True if and only if A can become B after 
     * some number of shifts on A.
     * 
     * Runtime: 0 ms, faster than 100.00% of Java online submissions.
     * Memory Usage: 36.5 MB, less than 100.00% of Java online submissions.
     */
    static boolean rotateString1(String A, String B) {
        
        // **** check if string lengths do not match ****
        if (A.length() != B.length())
            return false;

        // **** check if the strings are equal ****
        if (A.equals(B))
            return true;

        // **** ****
        for (int i = 0; i < A.length(); i++) {

            // **** starting character ****
            if (A.charAt(i) != B.charAt(0))
                continue;

            // **** right substring of A ****
            String right = A.substring(i, A.length());

            // **** left substring of A ****
            String left = A.substring(0, i);

            // **** concatenate right to left  ****
            String C = right + left;

            // **** compare to B and C ****
            if (B.equals(C))
                return true;
        }

        // **** strings do not match ****
        return false;
    }


    /**
     * Return True if and only if A can become B after 
     * some number of shifts on A.
     * 
     * Runtime: 0 ms, faster than 100.00% of Java online submissions.
     * Memory Usage: 38.7 MB, less than 26.02% of Java online submissions.
     */
    static boolean rotateString2(String A, String B) {
        
        // **** check if string lengths do not match ****
        if (A.length() != B.length())
            return false;

        // **** check if the strings are equal ****
        if (A.equals(B))
            return true;

        // **** concatenate A to A ****
        String C = A + A;

        // **** ****
        return C.contains(B);
    }


    /**
     * Return True if and only if A can become B after 
     * some number of shifts on A.
     * 
     * Runtime: 0 ms, faster than 100.00% of Java online submissions.
     * Memory Usage: 38.1 MB, less than 30.93% of Java online submissions.
     */
    static boolean rotateString3(String A, String B) {
        return A.length() == B.length() ? (A + A).contains(B) : false;
    }


    /**
     * Test scaffolding
     */
    public static void main(String[] args) {

        // **** open scanner ****
        Scanner sc = new Scanner(System.in);

        // **** read strings ****
        String[] AB = sc.nextLine().split(",");

        // **** close scanner ****
        sc.close();

        // ???? ????
        System.out.println("main <<< A ==>" + AB[0] + "<==");
        System.out.println("main <<< B ==>" + AB[1] + "<==");
        
        // **** process strings and display result ****
        System.out.println("main <<<  rotateString: " + rotateString(AB[0], AB[1]));

        // **** process strings and display result ****
        System.out.println("main <<< rotateString1: " + rotateString1(AB[0], AB[1]));

        // **** process strings and display result ****
        System.out.println("main <<< rotateString2: " + rotateString2(AB[0], AB[1]));

        // **** process strings and display result ****
        System.out.println("main <<< rotateString3: " + rotateString3(AB[0], AB[1]));
    }
}