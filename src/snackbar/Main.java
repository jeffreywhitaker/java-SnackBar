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
        performTransaction(c1, s4, 3);
        performTransaction(c1, s3, 1);
        performTransaction(c2, s4, 2);
        c1.addCash(10.00);
        System.out.println(c1.getName() + " has the following cash on hand: " + c1.getCashOnHand());
        performTransaction(c1, s2, 1);
        s3.addQuantity(12);
        System.out.println(s3.getName() + " has quantity: " + s3.getQuantity());
        performTransaction(c2, s3, 3);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        
    }

    public static void performTransaction(Customer customer, Snack snack, int quantity) {
        customer.buySnack(snack.getTotalCost(quantity));
        snack.setQuantity(snack.getQuantity() - quantity);
        System.out.println(customer.getName() + " has the following cash on hand: " + customer.getCashOnHand());
        System.out.println(snack.getName() + " has quantity: " + snack.getQuantity());
    }
}

// commands

// javac snackbar/*.java
// jar cvfe SnackBar.jar snackbar.Main snackbar/*.class
// java -jar SnackBar.jar

