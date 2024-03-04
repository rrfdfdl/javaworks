package bookshelf.books;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public void getFullName() {
        System.out.println(name + " " + surname);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}


