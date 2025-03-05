package de.homework44;

public class LibraryApp {
    public static void main(String[] args) {
        Library<PaperBook> paperLibrary = new Library<>();
        paperLibrary.addBook(new PaperBook("Alien", "Radley Scott ", 500));
        paperLibrary.addBook(new PaperBook("Hiroshima", " John Hersey", 311));

        System.out.println("Paper Books in Library:");
        paperLibrary.listBooks();

        System.out.println("\n---------------------\n");

        // Создаем библиотеку для электронных книг
        Library<EBook> eBookLibrary = new Library<>();
        eBookLibrary.addBook(new EBook("The Hobbit", "J.R.R. Tolkien", 5.5));
        eBookLibrary.addBook(new EBook("Dune", "Frank Herbert", 20.0));

        System.out.println("E-Books in Library:");
        eBookLibrary.listBooks();

        System.out.println("\nRemoving 'Dune' from eBookLibrary...\n");
        eBookLibrary.removeBook("Dune");

        System.out.println("E-Books after removal:");
        eBookLibrary.listBooks();
    }
}

