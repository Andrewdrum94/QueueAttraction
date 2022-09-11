public class Person {

    protected String name;
    protected String surname;
    protected int numberOfTickets;

    public Person (String name, String surname, int numberOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numberOfTickets = numberOfTickets;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void spendTicket() {
        if (this.numberOfTickets > 0 ) {
            this.numberOfTickets--;
        }
    }

    public String toString() {
        return this.name + " " + this.surname;
    }


}
