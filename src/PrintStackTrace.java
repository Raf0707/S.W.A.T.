import java.util.ArrayList;

public class PrintStackTrace {

    ArrayList<Acc> accs = new ArrayList<>();

    public ArrayList<Acc> getAccs() {
        return accs;
    }

    public void setAccs(ArrayList<Acc> accs) {
        this.accs = accs;
    }

    public String name;

    public PrintStackTrace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PrintStackTrace)) return false;

        PrintStackTrace p = (PrintStackTrace) o;
        return this.name.equals(p.name);
    }

    /*
    Метод equals принимает в качестве параметра объект любого типа,
    который мы затем приводим к текущему, если они являются объектами одного класса.
    Оператор instanceof позволяет выяснить,
    является ли переданный в качестве параметра объект объектом определенного класса,
    в данном случае класса Person. Если объекты принадлежат к разным классам,
    то их сравнение не имеет смысла, и возвращается значение false.
    Затем сравниваем по именам.
    Если они совпадают, возвращаем true, что будет говорить, что объекты равны.
     */
}
