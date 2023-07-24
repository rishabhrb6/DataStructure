package src.com.Rishabh.DSA.Recursion;

public class Factorial {
    public int Printfactorial(int n){

        if(n == 1)
            return 1;
        return n * Printfactorial(n-1);
    }
}
