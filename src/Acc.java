public class Acc<Generic> {
    private Generic id;
    private int sum;

    public Acc(Generic id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public Generic getId() {
        return id;
    }

    public void setId(Generic id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
