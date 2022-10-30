//Exercise 2

public class FactorialCalculator {
    public static int CalculateTheFactorial_loop(int N){
        int res=1;

        for (int i = 1; i<=N; i++){
            res*= i;
        }
        return res;
    }
    public static int CalculateTheFactorial_recursive(int N){
        int res=1;
        if(N>0){
            res *= N * CalculateTheFactorial_recursive(N-1);
        }
        return res;
    }
}
