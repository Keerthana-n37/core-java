class Book{
	
	static void readPage(String bookName) {
        System.out.println("Reading a page of " + bookName);
        addBookmark(bookName); 
    }
    static void bookmarkPage(String bookName) {
        System.out.println("Bookmarking a page in " + bookName);
    }
    static void addBookmark(String bookName) {
        System.out.println("Added a bookmark in " + bookName);
    }
    static void removePage(String bookName) {
        System.out.println("Removing a page from " + bookName);
        removeBookmark(bookName);
    }
    static void cleanBookmark(String bookName) {
        System.out.println("Cleaning bookmarks in " + bookName);
    }
    static void removeBookmark(String bookName) {
        System.out.println("Removed a bookmark from " + bookName);
    }
}