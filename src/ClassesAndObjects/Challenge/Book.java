package ClassesAndObjects.Challenge;
public class Book{
    public static void main(String[] args) {
        Library myBook1 = new Library("123abc");
        myBook1.title = "the lion";
        myBook1.author = "kuldeep";
        myBook1.isbnNo = "123abc";
        System.out.println(myBook1.title);

        Library myBook2 = new Library("456def");
        myBook2.title = "Codebreaker";
        myBook2.author = "Aarav Mehta";
        myBook2.isbnNo = "456def";

        Library myBook3 = new Library("789ghi");
        myBook3.title = "Threads of Time";
        myBook3.author = "Riya Sen";
        myBook3.isbnNo = "789ghi";

        Library myBook4 = new Library("321xyz");
        myBook4.title = "The Quantum Trail";
        myBook4.author = "Devansh Rao";
        myBook4.isbnNo = "321xyz";
        myBook1.borrowBook();
        myBook1.borrowBook();
        myBook1.returnBook();
        System.out.println(Library.getTotalBooks());
    }
}

