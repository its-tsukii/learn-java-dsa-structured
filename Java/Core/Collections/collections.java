package Java.Core.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class collections {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(45);
        arr.add(56);
        arr.add(78);
        arr.add(89);
        System.out.println(arr);
        arr.remove(56);
        System.out.println(arr);

        Collections.sort(arr);
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(arr, com);

        Collection<Integer> ll = new LinkedList<Integer>();
        // or we can use LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(45);
        ll.add(56);
        ll.add(78);
        ll.add(89);
        System.out.println(ll);

        Set<Integer> set = new HashSet<Integer>();
        set.add(45);
        set.add(56);
        set.add(78);
        set.add(89);
        System.out.println(set);

        TreeSet<Integer> treeset = new TreeSet<Integer>();
        treeset.add(45);
        treeset.add(56);
        treeset.add(78);
        treeset.add(89);

        System.out.println(treeset);

        for (Integer integer : treeset) {
            System.out.println(integer);
        }
        Iterator<Integer> values = treeset.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        HashMap<String, Integer> map = new HashMap<>();

        map.put("yes", 56);
        map.put("no", 78);
        map.put("yep", 90);
        map.put("nope", 67); // keys are a set and values are a list sort of thats why we cannot use
                             // duplicates in keys
        map.put("nope", 745);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        for (var condition : map.values()) {
            System.out.println(condition);
        }
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        Hashtable<String, Integer> table = new Hashtable<>();

        table.put("yes", 56);
        table.put("no", 78);
        table.put("yep", 90);
        table.put("nope", 67); // keys are a set and values are a list sort of thats why we cannot use
                               // duplicates in keys
        table.put("nope", 745);
        System.out.println(table);
        System.out.println(table.keySet());
        System.out.println(table.values());

        for (String key : table.keySet()) {
            System.out.println(key + " : " + table.get(key));
        }
        for (var condition : table.values()) {
            System.out.println(condition);
        }
        for (String key : table.keySet()) {
            System.out.println(key);
        }

    }

}

// both the hashmap and the hashtable are similar but the main diff is if we
// want to work with multiple threads then we better use hashtable as it works
// in synchronization