package bookshelf.books;
import java.util.Arrays;

public class Shelf {
    private String color = "белый";
    private Book[] books;
    public Shelf(int count, String color){
        this.books = new Book[count];
        this.color = color;
    }

    public void addBook(Book book){
        for (int i = 0; i < books.length; i+= 1) { // перебираем массив книг на полке
            if (books[i] == null) { // если элемент равен null,
                books[i] = book; // значит в массив можно передать ссылку на книгу
                return; // и прервать метод, чтобы ссылка не заполнила весь массив
            }
        }
        System.out.println("Книге автора " + book.getAuthor() + " не хватило места на полке ");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "color='" + color + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
