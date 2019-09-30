package snackbar;

public class Customer
{
    //fields 
    private static int maxId = 0;
    private String name;
    private int cashOnHand;

    //constructor
    public Customer(String name, int cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //getters and setters
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setCashOnHand(int cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }

    public String getCashOnHand()
    {
        return cashOnHand;
    }

    //other methods
    public void addCash(int cashToAdd)
    {
        this.cashOnHand = this.cashOnHand + cashToAdd;
    }
}