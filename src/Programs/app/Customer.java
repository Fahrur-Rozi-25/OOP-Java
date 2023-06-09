package Programs.app;

import Programs.data.Levels;

public class Customer {

    private String Name;
    private Levels level;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Cendy");
        customer.setLevel(Levels.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());




    }
}
