package Java.Core.Collections;

import java.util.*;

public class Practise {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(56);
        s1.add(56);
        s1.add(56);
        s1.add(67);
        s1.add(78);
        s1.add(89);
        s1.remove(89);

        System.out.println(s1);

        List<Integer> a1 = new ArrayList<Integer>();
        a1.add(56);
        a1.add(56);
        a1.add(56);
        a1.add(67);
        a1.add(78);
        a1.add(89);
        a1.remove(2);
        System.out.println(a1);

        ListIterator<Integer> itr = a1.listIterator();
        while (itr.hasNext()) {
            Integer integer = itr.next();
            if (integer == 78) {
                itr.remove();
                itr.add(5);
            }
        }
        System.out.println(a1);

        for (Integer integer : a1) {
            if (integer == 78) {
                a1.add(5);
            }
        }
        System.out.println(a1);
    }
}

/*
 * our purpose into creating a iterator is cuz an loop used for like looping
 * through the collection is with enhanced we cannot like loop with a normal
 * loop
 * but internally an enhanced loop stores or loops via the iterator thus add
 * functions or even read works as it affects directly to the collection
 * but when we try to modify the collection and call a method like remove(index)
 * it does not work as iterator has a method that is remove() without the index
 * parameter
 * thus modifying is not allowed in an normal loop thus we use a iterator mostly
 * it is recommended to a iterator regardless. for a list type use listIterator
 * and for set type or other type use more generalized version of Iterator
 */