import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class AlfredBot {
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello " + name + " Lovely to see you.";
    }
    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + " " + name + " Lovely to see you.";
    }
    public String dateAnnouncement() {
        Calendar calendar = Calendar.getInstance(); 
        String date = "It is currently : " + calendar.getTime();
        return date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if(conversation.indexOf("Alfred") != -1){
            return "At your service. As you wish, naturally.";
        }else{
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String wakeUp(String name){
        String txt = "Wake up " + name + " Your gonna be late!!!!!!!";
        return txt.toUpperCase();
    }

    public String guessTheNumber(){
        // Generate a random number 
        Random rand = new Random();
        Integer randomNumber = rand.nextInt(1, 100);
        System.out.println(randomNumber);
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Guess a number between 1 - 100");

        String guess = input.nextLine();
        if(guess == randomNumber.toString()){
            return "Yay! You Got it!";
        }else{
            return "Wrong!";
        }
        // ask the user to guess the number
        // check if the guess is correct print an appropiate response 
        // 
    }
}
