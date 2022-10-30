//Exercise 6, Exercise 7

public class Dog implements Animal,Domestic{
    String name;

    Dog(){}
    Dog(String name){
        this.name=name;
    }

    @Override
    public void sound() {
        System.out.print("Bark");
    }

    @Override
    public void printName() {
        System.out.print("Cat\'s name is "+this.name);
    }
}
