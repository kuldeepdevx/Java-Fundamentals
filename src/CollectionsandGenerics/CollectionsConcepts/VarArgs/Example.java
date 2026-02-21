package CollectionsandGenerics.CollectionsConcepts.VarArgs;

public class Example {
    public static void main(String[] args){
        System.out.println(sums(2,3,4));
        System.out.println(sums());
    }

    public static int sums(int... var){
        int sum=0;
        for(int num:var) {
            sum += num;
        }
        return sum;
    }
}
