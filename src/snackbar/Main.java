package snackbar;

public class Main
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendMachine v1 = new VendMachine("Food");
        VendMachine v2 = new VendMachine("Drink");
        VendMachine v3 = new VendMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        System.out.println("*** Processing ***");

    }
}
