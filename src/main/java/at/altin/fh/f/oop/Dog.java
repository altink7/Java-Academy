package at.altin.fh.f.oop;

public class Dog extends Animal {
    int alter;

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int alter) {
        super(name);
        this.alter = alter;
    }

    @Override
    public void eat(){
        System.out.println("Dog is ");
        super.eat();
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void specific() {
        System.out.println("specific Method");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "alter=" + alter +
                ", name='" + name + '\'' +
                '}';
    }
}
