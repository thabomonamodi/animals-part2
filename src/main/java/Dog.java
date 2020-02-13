public class Dog extends Animal
{
    private static String name="Rax";
    public Dog()
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
        //System.out.println("Barks");
        return "Barks";
    }

}