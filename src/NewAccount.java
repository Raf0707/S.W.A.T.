public class NewAccount {

    private String id;
    private int sum;

    <Generic>NewAccount(Generic id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
