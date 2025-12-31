package ClassesAndObjects.Challenge;

public class Library{
    static int totalBooks;
    String title;
    String author;
    String isbnNo;
    boolean isBorrowed;
    static{
        totalBooks=0;
    }
    {
        totalBooks++;
        isBorrowed=false;
    }

    Library(String title,String author,String isbnNo){
        this.title=title;
        this.author=author;
        this.isbnNo=isbnNo;
    }

    Library(String isbnNo){
        this("Unknown","Unknown",isbnNo);
    }

    public static  int getTotalBooks(){
        return totalBooks;
    }

    public void borrowBook(){
        if(!isBorrowed) {
            System.out.println("You borrowed "+title+" by "+author);
            totalBooks--;
            isBorrowed=true;
        }else{
            System.out.println("Sorry "+title+" by "+author+" is already borrowed");
        }
    }

    public void returnBook(){
        if(isBorrowed) {
            System.out.println("You returned "+title+" by "+author);
            totalBooks++;
            isBorrowed=false;
        }else{
            System.out.println("Sorry "+title+" by "+author+" is not borrowed by anyone");
        }
    }
}