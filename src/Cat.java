public class Cat {
    private String name;
    private int age;
    private String colorEyes;

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

    public String getColorEyes() {
        return colorEyes;
    }

    public void setColorEyes(String colorEyes) {
        this.colorEyes = colorEyes;
    }

    public Cat(String name, int age, String colorEyes) {
        this.name = name;
        this.age = age;
        this.colorEyes = colorEyes;
    }

    public String myau() {
        return "Myaaaaaau!";
    }

    public void getInfo(String name, int age, String colorEyes) {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("colorEyes: " + this.colorEyes);
    }

    public void rename(String name) {
        setName(name);
    }
}
