package chapter13;


public class Book {
	
  private BookType bookType;
  private String author;
  private String title;
  


  public Book(String title, String author, BookType bookType)
   {
    this.title = title;
    this.author = author;
    this.bookType = bookType;
   }


   public void setAuthor(String author){
    this.author= author;
   }

   public String getAuthor(){
    return author;
   }

   public void setTitle(String title){
    this.title= title;
   }

   public String getTitle(){
    return title;
   }

   public void setBookType(BookType bookType){
    this.bookType= bookType;
   }

   public BookType getBookType(){
    return bookType;
   }

}
