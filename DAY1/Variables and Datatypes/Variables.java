public class Variables {
    static int employeeId = 101;  //instance variable

    int age=25;     //static variable

    void method(){
        int n=90;
        System.out.println("Value of n: "+ n);  //local variable
    }
    public static void main(String[] args) {
        System.out.println("Employee ID: "+employeeId);
        // System.out.println("Age: "+ age);
        Variables var = new Variables();
        System.out.println("Age: "+ var.age);  // using object we can access instance variables

        // System.out.println("Local Variables n: "+ n);
        var.method();
    }
}
