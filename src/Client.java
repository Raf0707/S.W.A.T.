public class Client extends Person {
    private String bank;
    private int sum;
    public Client(String name, int age, String userName, String pass, String bank, int sum) {
        super(name, age, userName, pass);
        this.bank = bank;
        this.sum = sum;
    }

    public void display() {
        System.out.println("Client" + super.getName() + "has account in" + bank);
    }

    public String getBank() {
        return bank;
    }

    public int getSum() {
        return sum;
    }
}
