import java.awt.*;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;

public class task25 {
        public static void main (String[]args)
        {
            // Creation of HashMap
            HashMap<Integer, Integer> x_coordinates = new HashMap<>();
            x_coordinates.put(0, 5);

            for (int i =0; i <6 ; i++) {
             if (x_coordinates.containsKey(i))
                 System.out.println(x_coordinates.get(i));
            }
            HashMap<Integer, Integer> y_coordinates = new HashMap<>();
            y_coordinates.put(2,3);
            for (int j = 0; j <7; j++) {
              if (y_coordinates.containsKey(j))
                  System.out.println(y_coordinates.get(j));
        }
            Iterator<Integer> keyIterator = x_coordinates.keySet().iterator();
            Iterator valueIterator = y_coordinates.values().iterator();

            while (keyIterator.hasNext()) {
                System.out.println("key: " + keyIterator.next());
            }

            while (valueIterator.hasNext()) {
                System.out.println("value: " + valueIterator.next());
            }


        }
    }
