public class Dog {
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    public Dog(String name, String breed, int age,String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public String getColor() { return color; }

    public static void main(String[] args)
    {
        // Creating Object using paramerterized constructor
        Dog dog1 = new Dog("Tuffy", "papillon", 5, "white");
        System.out.println("Name:"+ dog1.getName());
        System.out.println("Dog Age: "+ dog1.age);
        System.out.println("Breed: "+ dog1.getBreed());
        System.out.println("Dog Color: "+ dog1.color);
    }
}
