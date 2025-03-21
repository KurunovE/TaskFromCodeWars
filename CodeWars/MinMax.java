package CodeWars;

import java.util.List;
import java.util.Optional;

public class MinMax {
    public int[] getMinMax(List<Integer> list){
        int size = list.size();
        if (size == 1) {
            return new int[] {list.get(0)};
        } else {
            int[] minMax = new int[size];
            List<Integer> newList = list.stream().sorted().toList();
            int min = newList.get(0);
            int max = newList.get(size-1);
            int indexMin = list.indexOf(min);
            int indexMax = list.indexOf(max);
            if (indexMax > indexMin) {
                minMax[0] = min;
                minMax[1] = max;
            } else {
                minMax[0] = max;
                minMax[1] = min;
            }
            return minMax;
        }

    }
}
