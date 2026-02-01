package Exception_FileHandling;

public class Test {
    public static void main(String[] args) {
        run();
    }


    static int run(){
        try{
            int result=1/0;
        }catch(IllegalArgumentException e){
            System.out.println("good");
        }finally{
            return 0;
        }
    }
}
