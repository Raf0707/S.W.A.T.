public class SekaiNoTanzo implements PrintName{

    private String title;
    private String nameOwner;
    private String type;
    private int code;

    public SekaiNoTanzo(String title, String nameOwner, String type, int code) {
        this.title = title;
        this.nameOwner = nameOwner;
        this.type = type;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public void printName() {
        System.out.println(getTitle());
    }
}
