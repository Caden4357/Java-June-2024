import java.util.ArrayList;
import java.util.HashMap;

public class FundamentalsTwo {
    public static void main(String[] args) {
        // type casting
        // implicit casting
        // Implicit Casting (Widening):
        // Implicit casting occurs when converting a smaller data type to a larger data
        // type.
        // Java automatically performs implicit casting without the need for explicit
        // syntax, as it involves no loss of data.
        // For example, converting an int to a double is an implicit cast because a
        // double can hold a wider range of values than an int.
        int age = 33;
        double ageDouble = age;
        System.out.println(age);
        System.out.println(ageDouble);

        // explicit casting
        // Explicit Casting (Narrowing):
        // Explicit casting occurs when converting a larger data type to a smaller data
        // type.
        // Since this process can potentially result in data loss or truncation,
        // explicit casting requires manual intervention.
        // To perform explicit casting, we use syntax (dataType) original value, where dataType
        // is the target data type, and value is the value to be cast.
        // For example, converting a double to an int requires explicit casting because
        // an int cannot hold decimal values.
        double myDouble = 3.14;
        int myInt = (int) myDouble;
        System.out.println(myInt);

        // Arrays 

        // 2 types of arrays fixed arrays and dynamic arrays (ArrayLists)
        // fixed arrays means fixed size
        int[] numArr = new int[5];
        numArr[0] = 1;
        numArr[1] = 2;
        numArr[2] = 3;

        int[] myArr = {1,2,3,4,5,6,5,4,8};

        System.out.println(myArr); // Guess output 
        for(int idx = 0; idx < myArr.length; idx++){
            System.out.println(myArr[idx]);
        }

        // ArraysLists
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Ford");
        System.out.println(cars);

        for(int idx = 0; idx < cars.size(); idx++){
            String car = cars.get(idx);
            System.out.println(car);
        }

        // enhanced for loop
        for(String car : cars){
            System.out.println(car);
        }

        // remove an item
        cars.remove(0);
        System.out.println(cars.get(0));
        // remove all items
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars);

        // HashMaps (Object)
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("name", "Caden");
        userMap.put("age", "26");
        userMap.put("role", "Instructor");
        userMap.put("yearsEmployed", "3");

        System.out.println(userMap);

        // Doing the above all in one line 
        // HashMap<String, String> userMap2 = new HashMap<String, String>();
        // {
        //     userMap.put("name", "Caden");
        //     userMap.put("age", "30");
        //     userMap.put("location", "San Francisco");
        // };

        // Itterate over a hashmap 
        for(String key : userMap.keySet()){
            System.out.println(key + ": " + userMap.get(key));
        }

        
    }
}
