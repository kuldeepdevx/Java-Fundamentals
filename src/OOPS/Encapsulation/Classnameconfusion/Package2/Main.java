package OOPS.Encapsulation.Classnameconfusion.Package2;
import OOPS.Encapsulation.Classnameconfusion.Package1.*;

public class Main{
    public static void main(String[] args){
        System.out.println("From package 2");
        OOPS.Encapsulation.Classnameconfusion.Package1.Main.main(args);
    }
}
