package de.homework44;

public class PaperBook extends Book {
    private int pages;

    public PaperBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public String getDescription() {
        return "";
    }

    public int getPages() {
        return pages;
    }
}

