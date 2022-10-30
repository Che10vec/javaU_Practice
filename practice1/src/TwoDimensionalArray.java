//Exercise 5

public class TwoDimensionalArray {
    public static int[][] createRandomArray(int size){
        int[][] Array = new int[size][size];
        for(int row=0;row< (Array.length-1); row++){
            for(int col=0; col<(Array[row].length-1);col++){
                Array[row][col]= (int)(Math.random() * 100);
            }
        }
        return Array;
    }
    public static double mean(int[] Array){     //of column
        double mean=0;
        for(int col=0; col<(Array.length-1);col++){
            mean += Array[col];
        }
        mean/=Array.length;
        return mean;
    }
    public static void print(int[][] Array){
        for(int col=0;col< (Array.length-1); col++){
            System.out.print('|');
            for(int row=0; row<(Array[col].length-1);row++){
                System.out.print("\t "+ Array[row][col]+"\t ");
            }
            System.out.print("\t|\n");
        }
        for(int i=1;i<=2;i++){      //printing the mean "...of each column and column"
            for(int row=0;row< (Array.length-1); row++){
                System.out.print("\t "+ mean(Array[row])+"\t ");
            }
            System.out.print('\n');
        }
    }
}
