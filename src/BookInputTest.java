import java.util.Scanner;

public class BookInputTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Book book1 = new Book();

        System.out.println("Please enter the title of your book");
        book1.title = input.nextLine();
        System.out.println("Please enter the author name");
        book1.author = input.nextLine();
        System.out.println("Please enter the number of pages");
        book1.numberOfPages = input.nextInt();

        System.out.println("The book title is: " + book1.title);
        System.out.println("The book author is: " + book1.author);
        System.out.println("The book has " + book1.numberOfPages + " pages");
    }
}
