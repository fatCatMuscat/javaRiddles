package CollectionsLearning;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);







    }





}
