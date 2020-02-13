import org.junit.Assert;
import org.junit.Test;
public class CatTest
{
    Cat cat = new Cat();
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