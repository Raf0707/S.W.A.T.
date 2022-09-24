public class Person {
    private String name;
    private int age;

    Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(age > 0 && age < 110) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    Person(String name, int age, String userName, String pass) {
        this.name = name;
        this.age = age;
        this.account = new Account(userName, pass);

    }

    public void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    static void changeName(Person person) {
        person.setName("Alice");
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Person " + name;
    }

}
