public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String userName, String pass, String company) {
        super(name, age, userName, pass);
        this.company = company;
    }
    public void work() {
        System.out.println(getName() + "work in " + company);
    }

    @Override
    public void displayInfo() {
//        System.out.println("name: " + getName());
//        System.out.println("age: " + getAge());
        super.displayInfo();
        System.out.println("company: " + company);
    }

}
