package OOPS.Inheritance.Challenge.ARRAYOPERATION;

public class arrayUse {
    public static void main(String[] args) {
        ArrayClass me = new ArrayClass(5);
        int[] protect = new int[]{1,3,5,100};
        me.setValues(protect);

        ArrayClass.arrayOperation test=me.new arrayOperation();

        System.out.println(test.mean(me.getArr()));
        System.out.println(test.median(me.getArr()));
    }
}
