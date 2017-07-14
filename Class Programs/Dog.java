public class Dog
{
    //instance data
    private String name;
    private int age;
    private String quirks;
    
    //Constructor #1 - accept values
    public Dog (String n, int a, String q)//(name, age, quirk)
    {
        name = n;
        age = a;
        quirks = q;
    }
    //Constructor #2 - while not accept Values
    public Dog ()//(name, age, quirk)
    {
        name = " ";
        age = 0;
        quirks = " ";
    }
    
    //Accessors (aka getters)
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getQuirks()
    {
        return quirks;
    }    
    
    //Mutators (aka setters)
    public void setName(String nameUp)
    {
        name = nameUp;
    }
    
    public void setAge(int ageUp)
    {
        age = ageUp;
    }
    
    public void setQuirks(String quirksUp)
    {
        quirks = quirksUp;
    }
    
    //Return methods
    public int peopleYears()
    {
        return age * 7;
    }
    
    public String toString()
    {
        return "Dog: " + name + "\t\tAge: " + age + "\tPerson-Years: " + peopleYears() + "\tQuirks: " + quirks;
    }
}