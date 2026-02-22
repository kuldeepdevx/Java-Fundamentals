package CollectionsandGenerics.CollectionsConcepts.Collections;
import java.util.*;

public class ListClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(11);
        list.add(13);
        list.add(1,14);
        System.out.println(list.indexOf(14));
        list.set(0,1);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
