class LibraryRunner {
    public static void main(String[] args) {

        String book = "Python Basics";
        String member = "Ananya";
        int days = 10;
        int fine = 0;

        Library.issueBook(book);
        Library.issueBook(book, member);
        Library.issueBook(book, member, days);

        book = "Algorithms Unlocked";
        member = "Rohit";
        days = 15;
        fine = 20;

        Library.issueBook(book);
        Library.issueBook(book, member);
        Library.issueBook(book, member, days);

        book = "Data Science Essentials";
        member = "Sneha";
        days = 7;
        fine = 10;

        Library.issueBook(book);
        Library.issueBook(book, member);
        Library.issueBook(book, member, days);

        book = "Python Basics";
        member = "Ananya";
        fine = 5;

        Library.returnBook(book);
        Library.returnBook(book, member);
        Library.returnBook(book, member, fine);

        book = "Algorithms Unlocked";
        member = "Rohit";
        fine = 0;

        Library.returnBook(book);
        Library.returnBook(book, member);
        Library.returnBook(book, member, fine);

        book = "Data Science Essentials";
        member = "Sneha";
        fine = 15;

        Library.returnBook(book);
        Library.returnBook(book, member);
        Library.returnBook(book, member, fine);

        book = "Machine Learning 101";
        member = "Vikram";
        days = 12;
        fine = 0;

        Library.issueBook(book);
        Library.issueBook(book, member);
        Library.issueBook(book, member, days);

        Library.returnBook(book);
        Library.returnBook(book, member);
        Library.returnBook(book, member, fine);

        book = "Artificial Intelligence";
        member = "Megha";
        days = 8;
        fine = 5;

        Library.issueBook(book);
        Library.issueBook(book, member);
        Library.issueBook(book, member, days);

        Library.returnBook(book);
        Library.returnBook(book, member);
        Library.returnBook(book, member, fine);
    }
}
