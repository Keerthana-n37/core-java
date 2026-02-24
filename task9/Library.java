class Library {

    static void issueBook(String bookName) {
        System.out.println("Executing issueBook method with bookName");
        System.out.println("Book Name: " + bookName);

        if(bookName == null){
            System.out.println("Invalid data: Book name cannot be null");
            return;
        }

        System.out.println("Book issued successfully");
        System.out.println("----------------------");
    }

    static void issueBook(String bookName, String memberName) {
        System.out.println("Executing overloaded issueBook method with bookName and memberName");
        System.out.println("Book Name: " + bookName);
        System.out.println("Member Name: " + memberName);
        
		if(bookName == null){
            System.out.println("Invalid data: Book name cannot be null");
            return;
        }
		
        if(memberName == null){
            System.out.println("Invalid data:Member name cannot be null");
            return;
        }

        System.out.println("Book issued to member successfully");
        System.out.println("----------------------");
    }

    static void issueBook(String bookName, String memberName, int days) {
        System.out.println("Executing overloaded issueBook method with bookName, memberName and days");
        System.out.println("Book Name: " + bookName);
        System.out.println("Member Name: " + memberName);
        System.out.println("Days: " + days);
        
		if(bookName == null){
            System.out.println("Invalid data: Book name cannot be null");
            return;
        }
		
        if(memberName == null){
            System.out.println("Invalid data:Member name cannot be null");
            return;
        }
		
        if(days <= 0){
            System.out.println("Invalid data: Check number of Days");
            return;
        }

        System.out.println("Book issued for " + days + " days");
        System.out.println("----------------------");
    }

    static void returnBook(String bookName) {
        System.out.println("Executing returnBook method with bookName");
        System.out.println("Book Name: " + bookName);

        if(bookName == null){
            System.out.println("Invalid data: Book name cannot be null");
            return;
        }

        System.out.println("Book returned successfully");
        System.out.println("----------------------");
    }

    static void returnBook(String bookName, String memberName) {
        System.out.println("Executing overloaded returnBook method with bookName and memberName");
        System.out.println("Book Name: " + bookName);
        System.out.println("Member Name: " + memberName);

        if(bookName == null || memberName == null){
            System.out.println("Invalid data: Book name or Member name cannot be null");
            return;
        }

        System.out.println("Book returned by member successfully");
        System.out.println("----------------------");
    }

    static void returnBook(String bookName, String memberName, int fine) {
        System.out.println("Executing overloaded returnBook method with bookName, memberName, fine");
        System.out.println("Book Name: " + bookName);
        System.out.println("Member Name: " + memberName);
        System.out.println("Fine: " + fine);

        if(bookName == null){
            System.out.println("Invalid data: Book name cannot be null");
            return;
        }
		
        if(memberName == null){
            System.out.println("Invalid data:Member name cannot be null");
            return;
        }
		
        if(fine <= 0){
            System.out.println("Invalid data:Fine should not be zero,member should pay the fine");
            return;
        }

        System.out.println("Book returned by member. Fine: " + fine);
        System.out.println("----------------------");
    }
}
