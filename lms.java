package Week_5;
import java.util.Scanner;
import java.util.ArrayList;
class lms {
class Book{
    Scanner sc=new Scanner(System.in);
    private int book_id;
    private String author;
    private String title;
    private String genre;
    private boolean Avail;
    public void Setbook()
    {
        System.out.println("enter the book_id: ");
        book_id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the author_name: ");
        author=sc.nextLine();
        System.out.println("enter the book_title: ");
        title=sc.nextLine();
        System.out.println("enter the genre: ");
        genre=sc.nextLine();
        System.out.println("enter the Availability: ");
        Avail=sc.nextBoolean();
    }
    public void display()
    {
        System.out.println("------------details--------------------");
        System.out.println("book_id= "+book_id);
        System.out.println("author= "+author);
        System.out.println("title= "+title);
        System.out.println("genre= "+genre);
        System.out.println("Availability= "+Avail);
        System.out.println("-------------End------------------------");
    }
    public boolean isavailaible()
    {
        return Avail;
    }
    public void setavailaible(boolean status)
    {
        Avail=status;
    }

    public int getBook_id() {
        return book_id;
    }
}
class user {
    Scanner sc=new Scanner(System.in);
    private int user_id;
    private String user_name;
    private int borrow_book_id;
    private int return_book_id;
    ArrayList<Integer> borrow=new ArrayList<Integer>();
    public void setuser(Catalog cat)
    {
        System.out.println("enter user_name: ");
        user_name=sc.nextLine();
        System.out.println("enter user_id: ");
        user_id=sc.nextInt();
        sc.nextLine();
        String choice;
        System.out.println("enter choice='b'(borrow) and choice='r'(return) ");
        System.out.print("choice= ");
        choice=sc.nextLine();
       // Catalog cat=new Catalog();
        if(choice.equals("b"))
        {
            System.out.println("enter the book_id for borrow : ");
            borrow_book_id= sc.nextInt();
            Book b=cat.findbook(borrow_book_id);
            if(b!=null&& b.isavailaible())
            {
                borrow.add(borrow_book_id);
                b.setavailaible(false);
                System.out.println("book borrowed");
            }
            else
            {
                System.out.println("book is not avalaible ");
            }
        }
        else if (choice.equals("r")) {
            System.out.println("enter the book_id for return : ");
            return_book_id= sc.nextInt();
            Book b=cat.findbook(return_book_id);
            if(b!=null&& b.isavailaible())
            {
                borrow.remove(Integer.valueOf(return_book_id));
                b.setavailaible(true);
                System.out.println("book returned ");
            }
            else
            {
                System.out.println("you didn't borrow this book");
            }
        }
        else
        {
            System.out.println("wrong choice");
        }
    }
    public void dp()
    {
        System.out.println("------------details--------------------");
        System.out.println("user_id= "+user_id);
        System.out.println("name= "+user_name);
        System.out.println("borrowed books: "+borrow);
        System.out.println("-------------End------------------------");
    }

}
class Catalog
{
    ArrayList<Book>cata=new ArrayList<>();
    public void setcatalog(Book books)
    {
        cata.add(books);
    }
    public void c_disp()
    {
        System.out.println("catalog: ");
        for(Book b:cata)
        {
            b.display();
        }
    }
    public Book findbook(int id)
    {
        for(Book b:cata)
        {
            if(b.getBook_id()==id)
            {
                return b;
            }
        }
        return null;
    }
}
class fiction extends Book{
    @Override
    public void display()
    {
        super.display();
        System.out.println("type=fiction.");
    }
}
class non_fiction extends Book{
   @Override
    public void display()
    {
        super.display();
        System.out.println("type=non-fiction.");
    }
}
public static void main(String[] args) {
    lms ob = new lms();

    Book b1 = ob.new Book();
    Book b2 = ob.new Book();

    Catalog cat = ob.new Catalog();
    user u = ob.new user();

    // Set first book
    b1.Setbook();
    cat.setcatalog(b1);

    // Set second book
    b2.Setbook();
    cat.setcatalog(b2);

    // Display catalog
    cat.c_disp();

    // User actions
    u.setuser(cat);
    u.dp();
    b1.display();
}
}
