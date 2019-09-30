package snackbar;

public class VendMachine
{
    // fields
    private static int maxId = 0;
    private String name;

    // constructor
    public VendMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
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
}