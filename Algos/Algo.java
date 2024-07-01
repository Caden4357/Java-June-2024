import java.util.ArrayList;

public class Algo {
    public String greeting(String name){
        return "Hello " + name;
    }

    // reverse a string 
    // given a string as an input return that string reversed (you may create a new string to do so)
    public String reverseString(String input){
        String reversedString = "";
        for(int idx = input.length() - 1; idx >= 0; idx--){
            reversedString += input.charAt(idx);
        }
        return reversedString;
    }
    //birthdayCakeCandles 
    //You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
    // ex input: [4,4,1,5,6,4] return 2 because 4 is the tallest candle and theres 2 of them 
    //
    public int birthdayCakeCandles(ArrayList<Integer> candles){
        if(candles.size() == 0){
            return 0;
        }
        int maxNum = candles.get(0); // 4 -> 5 -> 6
        int count = 1; // -> 2 -> 1 -> 1
        // for loop to go through and find the largest number 
        for(int idx = 1; idx < candles.size(); idx++){
            // find the largest number 
            if(candles.get(idx) > maxNum){
                maxNum = candles.get(idx);
                // when we find a new higher number reset the count to 1 
                count = 1;
            }
            // when we find a duplicate higher number increment count 
            else if(candles.get(idx) == maxNum){
                count++;
            }
        }
        return count;
    }

}
