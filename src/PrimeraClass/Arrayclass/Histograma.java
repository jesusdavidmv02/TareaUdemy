package PrimeraClass.Arrayclass;

import java.util.HashMap;

public class Histograma {

    public static void main(String[] args) {

        int myArray[] = new int[]{4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};

        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(6, "");
        hash.put(5, "");
        hash.put(4, "");
        hash.put(3, "");
        hash.put(2, "");
        hash.put(1, "");

        for (int i = 0; i < myArray.length; i++){
            hash.put(new Integer(myArray[i]), hash.get(myArray[i])+"*");
        }

        for(Integer key: hash.keySet()){
            System.out.println(key+": "+ hash.get(key));
        }
    }
}
