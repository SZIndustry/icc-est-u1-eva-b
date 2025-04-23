package controllers;
import models.Book;

public class LibroController {
    private Book[] books;

    public LibroController(Book[] books) {
        this.books = books;
    }

    public void sortByBubble(Book[] books) {
        boolean condicion;

        for (int i = 0; i < books.length - 1; i++) {
            condicion = false;
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].getName() < books[j + 1].getName()) {
                    Book aux = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = aux;
                    condicion = true;
                    
                }

            }

            if (!condicion) break;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchByName(Book[] libros, String nombre) {
        int inicio = 0;
        int fin = libros.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin  - inicio) / 2;

            if (books[medio].getName().equals(nombre)) {
                return medio;
            }

            if (inicio < nombre) {
                inicio = medio + 1;
            }

            else {
                fin = medio -1;
            }
            
        }


        return null;
    }

    
}
