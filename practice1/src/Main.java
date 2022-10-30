import java.util.Arrays;
import java.util.Collections;

public class Main extends GravityCalculator {
    public static void main(String[] args) {
//Exercise 1
        System.out.println("Exercise 1");
        fallingTime = 5;
        System.out.println ("Position in " + fallingTime +
                " seconds: " + finalPosition(fallingTime));
//Exercise 2
        System.out.println("Exercise 2");
        System.out.println("Loop: " + FactorialCalculator.CalculateTheFactorial_loop(7)
                + "\tRecursive: " + FactorialCalculator.CalculateTheFactorial_recursive(7));
//Exercise 3
        System.out.println("Exercise 3");
        double[][] testArray1 = OneDimensionalArray.createRandomArray(10);

        for(int col=0;col< (testArray1.length-1); col++) {   //print the array
            System.out.print('|');
            for (int row = 0; row < (testArray1[col].length - 1); row++) {
                System.out.print("\t " + testArray1[row][col] + "\t ");
            }
            System.out.print("\t|\n");
        }

        double min = 100, max = 0;        //searching for max and min value
        for(int col=0;col< (testArray1.length-1); col++) {
            for (int row = 0; row < (testArray1[col].length - 1); row++) {
                if(min>testArray1[row][col]){
                    min=testArray1[row][col];
                }
                if(max<testArray1[row][col]){
                    max=testArray1[row][col];
                }
            }
        }

        System.out.println( "largest: " + max + "\tsmallest: " + min + "\taverage values: " + OneDimensionalArray.mean(testArray1));
//Exercise 4
        System.out.println("Exercise 4");
        Marathon.printResult();
//Exercise 5
        System.out.println("Exercise 5");
        int[][] testArray2=TwoDimensionalArray.createRandomArray(10);
        TwoDimensionalArray.print(testArray2);
//Exercise 6
        System.out.println("Exercise 6");
        Cat cat=new Cat();
        Dog dog=new Dog();
        Fox fox=new Fox();

        cat.sound();
        System.out.print('\n');

        dog.sound();
        System.out.print('\n');

        fox.sound();
        System.out.print('\n');
//Exercise 7
        System.out.println("Exercise 7");
        Cat cat_= new Cat("Yafa Shist");
        Dog dog_= new Dog("Snoop");
        Fox fox_=new Fox();

        cat_.printName();
        System.out.print('\n');

        dog_.printName();
        System.out.print('\n');

        //fox_ doesn't have a name - it's a fox... but
        fox_.killRabbit();
    }
}