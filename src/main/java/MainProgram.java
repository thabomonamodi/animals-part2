public class MainProgram
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();

        System.out.println(dog.eat());
        System.out.println(dog.sounds());

        Cat cat = new Cat();

        System.out.println(cat.eat());
        System.out.println(cat.sounds());


        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        //Cat cat = new Cat();

        home.makeAllSounds();
        home.adoptPet(dog1);
        home.makeAllSounds();

        home.adoptPet(cat);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();
    }
}