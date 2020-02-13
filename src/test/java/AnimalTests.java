import org.junit.Assert;
import org.junit.Test;

public class AnimalTests
{
    Dog dog = new Dog();
    Cat cat = new Cat();

    @Test
    public void TestDogSound()
    {
        Assert.assertEquals(dog.sounds(),"Barks");
    }
    @Test
    public void TestDogEats()
    {
        Assert.assertEquals(dog.eat(),"Food");
    }
    @Test
    public void TestCatSound()
    {
        Assert.assertEquals(cat.sounds(),"Meows");
    }
    @Test
    public void TestCatEats()
    {
        Assert.assertEquals(cat.eat(),"Food");
    }
}