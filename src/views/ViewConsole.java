package views;

import models.Book;

public class ViewConsole {
    public void showMessage(String message) {
        System.out.println(message);
    }

    public void printArray(Book[] libros) {
        for (Book book : libros) {
            System.out.println(book);
        }
    }
    
}
