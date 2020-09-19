public abstract class Animal {
    public String name = "Animal";

    public abstract void move();

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}