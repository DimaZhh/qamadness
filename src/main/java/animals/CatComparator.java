package animals;


import com.google.common.collect.ComparisonChain;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return ComparisonChain.start()
                .compare(o1.getName(), o2.getName())
                .compare(o1.getAge(), o2.getAge())
                .result();
    }
}
