package bookshelf.books;

public class Book {
    private String title;
    private int pageCount;
    private Author author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(int count) {
        if (count < 10) {
            throw new IllegalArgumentException("Значение не может быть меньше 10");
        }
        pageCount = count;
    }

    public void setAuthor(Author author) {
        if (author == null){
            throw new IllegalArgumentException("Автор не может быть null");
        }
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Author getAuthor() {
        return author;
    }
}
