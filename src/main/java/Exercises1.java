
public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {

        // usual answer
//        long fact =1;
//        if(n==0){
//            return 1;
//        }
//        for(int i=1 ; i<= n ; i++){
//
//            fact *= i;
//        }
//        ...........................
        // Recursive
        if(n==1 || n==0){
            return 1;
        }
        return n * factorial(n-1);
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        // Recursive
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);

        //non_recursive answer
        long lastFibo = 1;
        long currentFibo =1;
        if(n==1 || n==2){
            return currentFibo;
        }
        for(int i=3 ; i<=n ; i++){
            long temp = currentFibo;
            currentFibo =lastFibo +currentFibo ;
            lastFibo =  temp ;
        }
        return currentFibo;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char [][] starTriangle  = new char [rows][];
        for(int i =0 ; i < rows ; i++ ){
            starTriangle [i] = new char[i +1];
            for(int j=0 ; j< i+1 ; j++){
                starTriangle [i][j] ='*';
            }
        }

        return starTriangle;
    }


    public static void main(String[] args) {
        // test your code here!

    }

}