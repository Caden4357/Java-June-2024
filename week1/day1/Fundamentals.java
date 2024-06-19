
public class Fundamentals {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Strongly typed means we define variable types at definition
        Integer age = 26;
        int otherAge = 30;
        char letter = 'A';
        boolean isHuman = false;
        double pi = 3.14;
        long bigNum = 303030003;
        String instructor = "Caden"; // come back to this
        

        // condtionals 
        if(age < otherAge){
            System.out.println("Your younger than the other person");
        }
        else if(otherAge == age){
            System.out.println("Your the same age");
        }
        else{
            System.out.println("Your the older one");
        }

        if(!isHuman){
            System.out.println("Human");
        }
        else{
            System.out.println("Alien!");
        }

        // loops 
        for(int num = 10; num >= 0; num--){
            System.out.println(num);
        }

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }




        // arrays
        // this is where you write all your code for now...
    }
}
