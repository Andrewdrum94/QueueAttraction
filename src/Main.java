import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            int tickets = queue.element().getNumberOfTickets();
            Person person = queue.element();
            if (tickets > 1) {
                queue.element().spendTicket();
                System.out.println(queue.poll() + " прокатился на аттракционе");
                queue.offer(person);
            } else if (tickets == 1) {
                queue.element().spendTicket();
                System.out.println(queue.poll() + " прокатился на аттракционе крайний раз");
            }
        }
    }

    private static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Николай", "Завгородний", 3));
        list.add(new Person("Андрей", "Петров", 5));
        list.add(new Person("Наталья", "Сидорова", 7));
        list.add(new Person("Степан", "Кулаков", 4));
        list.add(new Person("Серафим", "Волшебный", 9));
        return list;
    }
}
