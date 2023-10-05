// ************************************************************
// Book.java
//
// Contains instance data that represents the book’s title and number
// of pages. Contains a default constructor and a getter and setter
// for each instance data.
// ************************************************************

public class Book {
    private String title;

    private int pages;

    //-----------------------------------------------------------------
    // Constructor: Sets the initial title and pages value.
    //-----------------------------------------------------------------
    public Book(String title, int pages) {
        title = new String("Java Programming");
        pages = 200;
    }

    //-----------------------------------------------------------------
    // Title mutator/setter.
    //-----------------------------------------------------------------
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    //-----------------------------------------------------------------
    // Pages mutator/setter.
    //-----------------------------------------------------------------
    public void setPages(int newPages) {
        pages = newPages;
    }

    //-----------------------------------------------------------------
    // Title accessor/getter.
    //-----------------------------------------------------------------
    public String getTitle() {
        return title;
    }

    //-----------------------------------------------------------------
    // Pages accessor/getter.
    //-----------------------------------------------------------------
    public int getPages() {
        return pages;
    }

    //-----------------------------------------------------------------
    // Returns a string representation of this book.
    //-----------------------------------------------------------------
    public String toString() {
        String resultPages = Integer.toString(pages);
        return "This book is called " + title + " and it has " + resultPages + " pages.";
    }
}
