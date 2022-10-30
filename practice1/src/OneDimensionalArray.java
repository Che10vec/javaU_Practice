//Exercise 3

public class OneDimensionalArray {

    public static double[][] createRandomArray(int size){
        double[][] Array = new double[size][size];
        for(int row=0;row< (Array.length-1); row++){
            for(int col=0; col<(Array[row].length-1);col++){
                Array[row][col]= Math.random() * 100;
            }
        }
        return Array;
    }
    public static double mean(double[][] Array){
        double mean=0;
        for(int row=0;row< (Array.length-1); row++){
            double m=0;
            for(int col=0; col<(Array[row].length-1);col++){
                m += Array[row][col];
            }
            mean+=m/Array[row].length;
        }
        mean/=Array.length;
        return mean;
    }
}
