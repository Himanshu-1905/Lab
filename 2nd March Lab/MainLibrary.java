
public class MainLibrary {
public static void main(String[] args) {
	
	Library l = new Library();
	
	l.setBookId1(284345L);
	l.setBookName1("Rich Dad Poor Dad");
	l.setBookAuthor1("Robert Kiyosaki");
	
	System.out.println("Book Id is:"+l.getBookId1());
	System.out.println("Book Name:"+l.getBookName1());
	System.out.println("BookAuthor:"+l.getBookAuthor1());
	
	l.setBookId2(1185345L);
	l.setBookName2("The Psycology of money");
	l.setBookAthor2("Morgan Housel");
	
	System.out.println("Book Id is:"+l.getBookId2());
	System.out.println("Book Name:"+l.getBookName2());
	System.out.println("BookAuthor:"+l.getBookAthor2());
}
}
