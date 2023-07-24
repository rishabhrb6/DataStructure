package src.com.Rishabh.DSA.Recursion;

public class Print1toN {
    public void print(int n){

        if(n == 1){
            System.out.println(1);
            return ;
        }
        print(n -1);
        System.out.println(n);
    }
}
