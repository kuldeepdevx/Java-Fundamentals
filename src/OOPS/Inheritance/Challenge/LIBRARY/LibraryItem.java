package OOPS.Inheritance.Challenge.LIBRARY;

public class LibraryItem {
    private String itemID;
    private String titleID;
    private String authorName;

    public void checkOut(){
        System.out.println("Checkout Successfully");
    }

    public void returnItem(){
        System.out.println("Return Successfully");
    }
}
