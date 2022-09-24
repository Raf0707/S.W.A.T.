import java.util.ArrayList;

public class ArrayCollection {
    ArrayList<String> people = new ArrayList<>();

    public ArrayCollection(ArrayList<String> people) {
        this.people = people;
    }

    public ArrayList<String> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<String> people) {
        this.people = people;
    }

    public void addPeople(ArrayList<String> people) {
        people.add(1, "Sam");
        people.add(0, "Raf");
        people.add(2, "Sof");
        people.add(3, "Tim");
        people.add(4, "Robert");
        people.add(5, "Tom");
    }

    public void arrSize(ArrayList<String> people) {
        System.out.println(people.size());
    }

    public void printArrPeople(ArrayList<String> people) {
        for (String person : people) {
            System.out.println(person);
        }
    }

    public void contArr(ArrayList<String> people, String person) {
        if (people.contains(person)) {
            System.out.println("ArrayList people contains " + person);
        } else {
            System.out.println("ArrayList people not contains " + person);
        }
    }

    public void removeArrPerson(ArrayList<String> people) {
        people.remove("Robert");
        people.remove(5);
    }

    public void printPeople(ArrayList<String> people) {
        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {
            System.out.println(person);
        }
    }
}
