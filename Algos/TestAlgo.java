import java.util.ArrayList;

public class TestAlgo {
    public static void main(String[] args) {
        Algo algoApp = new Algo();
        // System.out.println(algoApp.greeting("Robert"));
        System.out.println(algoApp.reverseString("iceman"));
        System.out.println(algoApp.reverseString("jacob"));
        System.out.println(algoApp.reverseString("racecar"));
        ArrayList<Integer> candles = new ArrayList<Integer>();
        candles.add(4);
        candles.add(4);
        candles.add(1);
        candles.add(3);
        System.out.println(algoApp.birthdayCakeCandles(candles));
    }
}
