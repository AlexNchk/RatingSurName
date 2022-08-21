import java.util.Comparator;

public class NumberWordsSurnameComparator implements Comparator<Person> {
    protected int numberWord;

    @Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.getSurname().split(" ");
        String[] surname2 = o2.getSurname().split(" ");
        if ((surname1.length >= numberWord && surname2.length >= numberWord) || surname1.length == surname2.length) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return surname1.length > surname2.length ? 1 : -1;
    }

    public NumberWordsSurnameComparator(int numberWord) {
        this.numberWord = numberWord;
    }
}
