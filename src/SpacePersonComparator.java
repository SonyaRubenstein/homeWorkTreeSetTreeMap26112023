import java.util.Comparator;
import java.util.Iterator;

public class SpacePersonComparator implements Comparator<Person> { //TODO укажите интерфейс, имплементируйте его

    @Override
    public int compare(Person o1, Person o2) { //если 01 < O2 - отрицательно

        if (o1.getExperience() > o2.getExperience()) {
            return -1;
        } else if (o1.getExperience() < o2.getExperience()) {
            return 1;
        }

        int count1 = countS(o1.getName()); //проверка на кол-во буков S в имени и фамилии (нужно то, где больше всего буков S_
        int count2 = countS(o2.getName());
        if (count1 > count2) {
            return -1;
        } else if (count1 < count2) {
            return 1;
        }

        return Integer.compare(o1.getName().length(), o2.getName().length());
    }

    public int countS(String s) {
        int foundedChar = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 's') {
                foundedChar++;
            }
        }
        return foundedChar;
    }
}
