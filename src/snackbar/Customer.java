package snackbar;

public class Customer
{
    //fields 
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //getters and setters
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

    public void setCashOnHand(double cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    //other methods
    public void addCash(double cashToAdd)
    {
        this.cashOnHand = this.cashOnHand + cashToAdd;
    }

    public void buySnack(double cashSpent)
    {
        this.cashOnHand = this.cashOnHand - cashSpent;
    }
}