import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Александр", "Петров ибн", 47));
        people.add(new Person("Никита", "Иванов", 25));
        people.add(new Person("Олег", "Кащеев", 46));
        people.add(new Person("Акиф", "Абдул оглы Абн", 15));
        people.add(new Person("Антонио", "Кампус Родригес", 35));
        people.add(new Person("Александр", "Панкратов Черный", 55));
        people.add(new Person("Алексей", "Чернов", 13));
        Predicate <Person> stillYoung = person -> person.getAge() < 18;
        people.removeIf(stillYoung);
        people.sort(new NumberWordsSurnameComparator(3));
        System.out.println(people);
    }
}
