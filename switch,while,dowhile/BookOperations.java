class BookOperations {

    public static void main(String[] args) {
        System.out.println("Book operations"); 
        int i = 1,n=7;
		int j = 5;
        while (i <= 5) {
            Book.readPage("Book" + i);
            Book.bookmarkPage("Book" + i);
            i++;
        }
		while(n>5){
			Book.bookmarkPage("Book"+n);
			n++	
		}
		do{
			Book.readPage("Book"+i);
			i++
		}while(i<3);
        
        do {
            Book.removePage("Book" + j);
            Book.cleanBookmark("Book" + j);
            j--;
        } while (j >= 1);
    }
}
