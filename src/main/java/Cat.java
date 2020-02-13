public class Cat extends Animal
{
    private static String name="Stormy";

    public Cat()
    {
        super(name);

    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public String sounds()
    {
        //System.out.println("Meows");
        return "Meows";
    }

}