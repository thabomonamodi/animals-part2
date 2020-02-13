import java.util.ArrayList;

public class Home
{
    ArrayList<Animal> list = new ArrayList<>();
    public Home()
    {
    }
    public void adoptPet(Animal pet)
    {
        list.add(pet);
    }
    public void makeAllSounds()
    {
        for (Animal pet : list)
        {
            pet.sounds();
        }
    }
}