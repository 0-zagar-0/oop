package mate.academy;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String color) {
        super (name, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                " name='" + getName() + '\'' +
                " age='" + getAge() + '\'' +
                " color='" + color + '\'' + '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", color: " + color;
    }
}
