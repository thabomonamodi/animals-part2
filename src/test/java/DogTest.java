import org.junit.Assert;
import org.junit.Test;

public class DogTest
{
    Dog dog = new Dog();
    @Test
    public void TestCatSound()
    {
        Assert.assertEquals(dog.sounds(),"Barks");
    }
    @Test
    public void TestCatEats()
    {
        Assert.assertEquals(dog.eat(),"Food");
    }
}