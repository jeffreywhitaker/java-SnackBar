package snackbar;

public class Snack
{
    // fields
    private static int maxId = 0;
    private String name;
    private int quantity;
    private int cost;
    private int vendmachineId;
    // constructor
    public Snack(String name, int quantity, int cost, int vendmachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendmachineId = vendmachineId;
    }
    // getters and setters
    public int getId()
    {
        retun id;
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

    public void setCost(int cost)
    {
        this.cost = cost;
    }

    public int getCost()
    {
        return cost;
    }

    public void setVendmachineId(int vendmachineId)
    {
        this.vendmachineId = vendmachineId;
    }

    // other methods
}