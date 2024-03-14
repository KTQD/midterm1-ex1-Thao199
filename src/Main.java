public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3", "author", "PS50", 61.00f, "4 hours");
        mp3.showInfo();

        Book book = new Book("Java", "DLCS", "OOP1", 27.3f, "Pham Phuong Thao", 11122, "reading");
        book.showInfo();
    }
}
