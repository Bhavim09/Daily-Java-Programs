package collections;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Set;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put("Hello",1);
        hs.put("ASD",2);
        hs.put("QWE",3);
        Set<String> hk = hs.keySet();
        Iterator<String> itr = hk.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
         System.out.println(key+" "+hs.get(key));   
        }
    }
}
