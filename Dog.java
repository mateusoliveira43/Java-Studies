public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is walking.");
    }

    public static void main(String[] args) {
        Dog rufus = new Dog("Rufus");
        rufus.move();
        rufus.eat("meat");
        rufus.sleep();
    }
}
