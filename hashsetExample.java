package Mani;

import java.util.HashSet;
import java.util.Set;

public class New {
    public static void main(String[] args) {
       Set<Integer> hashset = new HashSet<Integer>();
       hashset.add(3);
       hashset.add(4);
       hashset.add(3);
       
//       hashset.clear();
//       hashset.removeAll(hashset);
//       hashset.remove(4);
       boolean contain = hashset.contains(5);
       
       
       System.out.println(hashset);
       System.out.println(contain);
       System.out.println(hashset.isEmpty());
    }
}
