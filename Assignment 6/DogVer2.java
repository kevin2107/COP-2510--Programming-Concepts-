public class DogVer2
{
    //instance data
    private String name;
    private int age;
    private String quirks;
    private static int count = 0; //static variable
    
    //Constructor #1 - accept values
    public DogVer2 (String n, int a, String q)//(name, age, quirk)
    {
        name = n;
        age = a;
        quirks = q;
        count++;
    }
    //Constructor #2 - while not accept Values
    public DogVer2 ()//(name, age, quirk)
    {
        name = " ";
        age = 0;
        quirks = " ";
        count++;
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
    
    public static int getCount()
    {
      return count;
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