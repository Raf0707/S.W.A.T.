import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        SekaiNoTanzo sekaiNoTanzo = new SekaiNoTanzo(
//                "Sekai No Tanzo",
//                "Vitalich", "Game Development", 394857);
//
//        sekaiNoTanzo.printName();

//        Cat cat = new Cat(sc.nextLine(), sc.nextInt(), sc.nextLine());
//        System.out.println(cat.getName() + "\n" + cat.getAge());
//        cat.rename(sc.nextLine());
//        System.out.println(cat.getName() + "\n" + cat.getAge());

//        Arabic arabic = new Arabic("بِسۡمِ ٱللَّهِ ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ" ,
//                "Во имя Аллаха, Милостивого ко всем на этом свете и Милосердного лишь к уверовавшим в день суда");
//
//        arabic.translation();
//        arabic.setNewWord(sc.nextLine(), sc.nextLine());
//        arabic.showNewWord();
//        arabic.showNewWord(arabic.setNewWord(arabic.getArabic(), arabic.getTranslate()),
//                arabic.setNewWord(arabic.getArabic(), arabic.getTranslate()));

//        arabic.translation("بِسۡمِ ٱللَّهِ ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ" ,
//                "Во имя Аллаха, Милостивого ко всем на этом свете и Милосердного лишь к уверовавшим в день суда");


//        Person tom = new Person("Tom", 24, "Tomas", "29384723948");
//
//        Person mark = new Person("Mark", 21, "Mark24", "2837462384");
//        Person dav = new Person("David", 18, "Dav123", "81273681273");
//        Person bob = new Person("Robert", 26, "Bob","283472684");
//
//        Person sam = new Employee("Sam", 17,
//                "sam23", "2173450143785", "Oracle");

//        System.out.println(tom.getName() + " " + tom.getAge());
//        System.out.println(mark.getName() + " " + mark.getAge());
//        System.out.println(dav.getName() + " " + dav.getAge());
//        System.out.println(bob.getName() + " " + bob.getAge());
//
//        tom.displayInfo();
//        tom.account.displayAccountInfo();

//        Mathh.Factorial fact = Mathh.getFactorial(6);
//        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getRes());
    }

    static void funf() {
        System.out.println("Hello world!");
    }

    static void funs() {
        System.out.println("Java the best!");
    }

    static void mult(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    static void twoWords(String s1, String s2) {
        System.out.println((s1.length() > s2.length() ? "Первая строка длиннее" :
                ((s2.length() > s1.length() ? "Вторая строка длиннее" : "Равная длина"))));
    }

    static double poluper(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    static void geron(double a, double b, double c) {
        double p = (double) poluper(a, b, c);
        double s = (p * (p - a) * (p - b) * (p - c)) ;
        System.out.println(s > 0 ? Math.pow(s, 0.5) : "Такого треугольника не существует");
    }

    static void area(String figure, int len) {
        System.out.println("Круг".equals(figure) ? (int) Math.ceil(3.14 * len * len) :
                (int) Math.ceil((len * len)));
    }

    static void perimeter(String fig, int ln) {
        System.out.println("Круг".equals(fig) ? (int) Math.ceil(2 * 3.14 * ln) :
                (int) Math.ceil(4 * ln));
    }

    private static void simple(int num) {
        boolean flag = true;
        if (num < 2) flag = false;
        double s = Math.sqrt(num);
        for (int i = 2; i <= s; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    static boolean sim(int num) {
        if (num < 2) return false;
        double s = Math.sqrt(num);
        for (int i = 2; i <= s; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void simpleAB(int a, int b) {
        boolean flag = true;
        for (int i = a; i <= b; i++) {
            if (sim(i) == false) {
                if (i == 1) System.out.println("1 - 1");
                else if (i > 1) System.out.println(i + " - составное");
            } else if (sim(i) == true) {
                System.out.println(i + " - простое");
            }

        }

    }

    private static void monneub(int[] mas) {
        int counter = 1;
        int maxln = 0;
        if (mas.length != 0) {
            for (int i = 1; i < mas.length; i++) {
                if (mas[i - 1] <= mas[i]) {
                    counter++;
                } else {
                    if (counter > maxln) {
                        maxln = counter;
                    }
                    counter = 1;
                }

            }

            if (maxln < counter) maxln = counter;
            System.out.println(maxln);

        }
        else {
            System.out.println(0);
        }

    }

    private static void sortByLength(String s) {
        String[] words = s.split(" ");
        HashMap<Integer, String> wrd = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            wrd.put(words[i].length(), words[i]);
        }
        for (int i = 0; i < wrd.size(); i++) {
            System.out.println(i + ": " + wrd.get(i));
        }
    }

    private static void cubArea(int a, int b, int c) {
        System.out.println(2 * a * b + 4 * a * c);
    }

    private static int arhimed(int ro, int v) {
        int g = 10;
        return ro * g * v;
    }

    private static int second_count(int days, int hours, int min, int sec) {
        int dts = days * 24 * 60 * 60;
        int hts = hours * 60 * 60;
        int mts = min * 60;
        int total = dts + hts + mts + sec;
        return total;
    }

    private static int min_from_4(int a, int b, int c, int d) {
        int min_ab = Math.min(a, b);
        int min_cd = Math.min(c, d);
        int min_general = Math.min(min_ab, min_cd);
        return min_general;
    }

    public static void changeNameView(Person person) {
        person.setName("new name");
    }


}



