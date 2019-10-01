package snackbar;

public class Snack
{
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendmachineId;

    // constructor
    public Snack(String name, int quantity, double cost, int vendmachineId)
    {
        maxId++;
        this.id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendmachineId = vendmachineId;
    }

    // getters and setters
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return cost;
    }

    public void setVendmachineId(int vendmachineId)
    {
        this.vendmachineId = vendmachineId;
    }

    public int getVendmachineId()
    {
        return vendmachineId;
    }

    // other methods
    public void addQuantity(int quantityToAdd)
    {
        this.quantity = this.quantity + quantityToAdd;
    }

    public void buySnack(int numberToBuy)
    {
        this.quantity = this.quantity - numberToBuy;
    }

    public double getTotalCost(int quantityWanted)
    {
        return quantityWanted * this.cost;
    }

    @Override
    public String toString()
    {
        String rtnStr = "Name: " + name + "\n" +
                        "Quantity: " + quantity + "\n" +
                        "Vending Machine ID: " + vendmachineId + "\n" +
                        "Total Cost: " + (quantity * cost);

        return rtnStr;
    }
}