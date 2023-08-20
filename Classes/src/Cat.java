public class Cat implements CanSpeak {
    public  String petName;
    private   int age;


    public Cat()
    {
        System.out.println("A new instance od Cat created");
    }

    public void speak()
    {
        System.out.println(petName + " says  , \"Meow!\"");
    }

    public int getAge()
    {
        return age;
    }
}
