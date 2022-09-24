import java.util.Scanner;

public class Animal {
    private String type;
    private String name;
    private int age;
    private double weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean getFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean getWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean getSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    public Animal(String type, String name, int age, double weight,
                  boolean isFly, boolean isSwim, boolean isWalk) {

        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public void display() {
        System.out.println("Тип: " + getType());
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Вес: " + getWeight());
        System.out.println("Умеет летать: " + getSwim());
        System.out.println("Умеет ходить: " + getWalk());
        System.out.println("Умеет плавать: " + getSwim());
    }

    public void rename(Animal animal) {
        animal.setName("name");
    }

    public double holiday(int holidays) {
        return weight + holidays * 0.1;
    }

}
