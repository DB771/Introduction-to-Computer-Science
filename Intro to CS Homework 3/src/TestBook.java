// ************************************************************
// TestBook.java
//
// Instantiates two Book objects and updates the titles and pages
// with data from the user. Prints information about the two objects.
// ************************************************************

import java.util.Scanner;  // Imports the Scanner class

public class TestBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book book1 = new Book("The Great Gatsby", 153);
        Book book2 = new Book("The Old Man and the Sea", 120);

        //-----------------------------------------------------------------
        // Updates book1 and book2 variables
        //-----------------------------------------------------------------

        // Book 1 ---------------------------------------------------------

        // Title input
        System.out.println("Enter Book 1's title: ");
        String title1 = new String(input.nextLine());
        book1.setTitle(title1);

        // Number of pages input
        System.out.println("Enter Book 1's number of pages: ");
        int pages1 = input.nextInt();
        input.nextLine(); // consumes the newline character left in the buffer from the previous input
        book1.setPages(pages1);

        // Prints title, pages, and full book description
        System.out.println(book1.getTitle());
        System.out.println(book1.getPages());
        System.out.println(book1.toString() +"\n");

        // Book 2 ---------------------------------------------------------

        // Title input
        System.out.println("Enter Book 2's title: ");
        String title2 = new String(input.nextLine());
        book2.setTitle(title2);

        // Number of pages input
        System.out.println("Enter Book 2's number of pages: ");
        int pages2 = input.nextInt();
        input.nextLine(); // consumes the newline character left in the buffer from the previous input
        book2.setPages(pages2);

        // Prints title, pages, and full book description
        System.out.println(book2.getTitle());
        System.out.println(book2.getPages());
        System.out.println(book2.toString() +"\n");

        // Book 1 and 2 ---------------------------------------------------
        System.out.println("The average number of pages between the two books is " +
                ((double) (book1.getPages() + book2.getPages())/2));
    }
}