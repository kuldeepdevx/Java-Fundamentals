package CollectionsandGenerics.CollectionsConcepts.Collections;
import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args){

        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(10);
        System.out.println(list.toString());
        list.clear();
        System.out.println(list);
    }
}
