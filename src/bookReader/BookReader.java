package bookReader;

interface BookReader {
    Book[] getElectronicLibrary();
    boolean addBook(Book book);
    boolean isDuplicate(Book book);
    boolean validateTitleAndAuthor(Book book);
    boolean removeBook(Book book);
    String[] listAllBooks();
    Book[] findBookByAuthor(String author);
    Book[] findBookByBeginningOfAuthorName(String author);
    Book[] findBookByTitle(String title);
    Book[] findBookByBeginningOfTitle(String title);
    boolean markAsRead(Book book);
    boolean markAsUnread(Book book);
    String[] listAllReadBooks();
    String[] listAllUnreadBooks();
}
