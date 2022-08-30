import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Александр", "Петров ибн", 47));
        people.add(new Person("Никита", "Иванов", 25));
        people.add(new Person("Олег", "Кащеев", 46));
        people.add(new Person("Акиф", "Абдул оглы Абн", 15));
        people.add(new Person("Антонио", "Кампус Родригес", 35));
        people.add(new Person("Александр", "Панкратов Черный", 55));
        Comparator<Person> NumberWordsSurnameComparator = (Person o1, Person o2) ->{
            String[] surname1 = o1.getSurname().split(" ");
            String[] surname2 = o2.getSurname().split(" ");
            if ((surname1.length >= 3 && surname2.length >= 3) || surname1.length == surname2.length) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return surname1.length > surname2.length ? 1 : -1;
        };
        people.sort(NumberWordsSurnameComparator);
        System.out.println(people);
    }
}
