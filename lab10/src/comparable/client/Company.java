package comparable.client;

public class Company extends Client {
    private int numberOfEmployees;

    public Company(String lastName, double balance, int numberOfEmployees) {
        super(lastName, balance);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public int compareTo(Client other) {
        if (other instanceof Company) {
            Company otherCompany = (Company) other;

            int balanceComparison = super.compareTo(other);

            if (balanceComparison == 0) {
                return Integer.compare(this.numberOfEmployees, otherCompany.numberOfEmployees);
            }

            return balanceComparison;
        }
        return super.compareTo(other);
    }

    @Override
    public String toString() {
        return "Company{lastName='" + getLastName() + "', balance=" + getBalance() + ", numberOfEmployees=" + numberOfEmployees + "}";
    }
}


