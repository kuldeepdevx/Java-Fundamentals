package CollectionsandGenerics.Collections;

public class VarArgs {
    public static void main(String[] args){
//        System.out.println(sums(2,3,4));
//        System.out.println(sums());
        for(int i=0;i<1000000000;i++){
            System.out.println(i+1);
        }
    }

    public static int sums(int... var){
        int sum=0;
        for(int num:var){
           sum+=num;
        }
        return sum;
    }
}
