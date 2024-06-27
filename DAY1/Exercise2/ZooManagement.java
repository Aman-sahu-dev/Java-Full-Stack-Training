package DAY1.Exercise2;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("Animal [Name: " + name + ", Age: " + age + "]");
    }
}

class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Mammal [Has Fur: " + hasFur + "]");
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bird [Can Fly: " + canFly + "]");
    }
}

class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(String name, int age, boolean isVenomous) {
        super(name, age);
        this.isVenomous = isVenomous;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Reptile [Is Venomous: " + isVenomous + "]");
    }
}

public class ZooManagement {
    public static void main(String[] args) {
        Animal mammal = new Mammal("Elephant", 25, true);
        Animal bird = new Bird("Parrot", 3, true);
        Animal reptile = new Reptile("Snake", 5, true);

        mammal.displayDetails();
        bird.displayDetails();
        reptile.displayDetails();
    }
}

