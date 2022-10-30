//Exercise 4

public class Marathon {
    static String [] names = {"Elena", "Thomas", "Hamilton", "Suzie",
            "Phil", "Matt", "Alex", "Emma", "John", "James",
            "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    static int [] times = {341, 273, 278, 329, 445, 402, 388, 275, 243,
            334, 412, 393, 299, 343, 317, 265};

    public static void printResult(){
        for (int i=0;(i<(names.length-1)) && (i< (times.length-1));i++){
            System.out.printf("%s\t%s\n",names[i],times[i]);
        }
    }
}
