public class Book {

    private String name;
    private String author;
    private String text;

//    public String addPrefixToBookAuthor (String prefix, String author) {
//        return prefix + " " + author;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
