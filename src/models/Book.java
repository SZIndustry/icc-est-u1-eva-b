package models;

public class Book {

    private String name;
    private int year;


    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getyear() {
        return year;
    }


    public void setyear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Book [name=" + name + ", year=" + year + "]";
    }


    
}
