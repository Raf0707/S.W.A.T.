public class Account {
    private String userName;
    private String pass;

    Account(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    public void displayAccountInfo() {
        System.out.println("userName: " + userName);
        System.out.println("password: " + pass);
    }

}
