package de.homework44;

public class EBook extends Book{
    private double fileSizeMb;

    public EBook(String title, String author, double fileSizeMb) {
        super(title, author);
        this.fileSizeMb = fileSizeMb;
    }

    @Override
    public String getDescription() {
        return "";
    }

    public double getFileSizeMb() {
        return fileSizeMb;
    }
}
