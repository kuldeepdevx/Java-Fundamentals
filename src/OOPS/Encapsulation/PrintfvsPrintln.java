package OOPS.Encapsulation;

public class PrintfvsPrintln {
    public static void main(String[] args){
        /*
        Println return void
        printf return PrintStream object that why chaining possible
         */
        int x=5;
        System.out.println("Hi i am println "+x+"\nChaining is not possible");
        System.out.printf("Hi i am printf %d",x).printf("\nchaining is possible");
    }
}
