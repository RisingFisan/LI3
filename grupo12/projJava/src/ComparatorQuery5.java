import java.util.*;
public class ComparatorQuery5 implements Comparator<Map.Entry<String,Integer>>
{
    public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
        if (o1.getValue()==o2.getValue()) return o1.getKey().compareTo(o2.getKey());
        else if (o1.getValue()> o2.getValue()) return -1;
        return 1;
    }
}
