//Exercise 6, Exercise 7

public class Fox implements Animal,Wild{
    Fox(){}

    @Override
    public void sound() {
        System.out.print("Wa-pow");
    }

    @Override
    public void killRabbit() {
        System.out.print("Fox kills Rabbit - ");
        this.sound();
    }
}
