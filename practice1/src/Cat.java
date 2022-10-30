//Exercise 6, Exercise 7

public class Cat implements Animal,Domestic {
    String name;

    Cat(){}
    Cat(String name){
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.print("Meow");
    }

    @Override
    public void printName() {
        System.out.print("Cat\'s name is "+this.name);
    }
}
