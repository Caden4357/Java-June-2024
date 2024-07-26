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
    // reverse integer array working in place



    // Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.
    // Scores=[12,24,10,24]
    // Count
    // Game  Score  Minimum  Maximum   Min Max
    //  0      12     12       12       0   0
    //  1      24     12       24       0   1
    //  2      10     10       24       1   1
    //  3      24     10       24       1   1

    // write a function called breakingRecords that takes in an int[n] scores 
    // variables for min and max score = scores[0] 
    // variables for min and max count = 0
    // for loop over the scores array start @ idx 1 
    // condtionals: check if the current score < min if it is update min count min score 
    // check if the current score > max if it is update max count and max score 
    // return an array at the end [1,1] do this at the end 
    public int[] breakingRecords(int[] scores){
        int minScore = scores[0];
        int maxScore = scores[0];
        int minCount = 0;
        int maxCount = 0;
        for(int idx = 1; idx < scores.length; idx++){
            int currentScore = scores[idx];
            if(currentScore < minScore){
                minCount++;
                minScore = currentScore;
            }else if(currentScore > maxScore){
                maxCount++;
                maxScore = currentScore;
            }
        }
        int[] result = {maxCount, minCount};
        return result;
    }
}
