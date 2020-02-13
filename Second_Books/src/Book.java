import java.util.*;

class Sort implements Comparator<Book>{
	public int compare(Book b1,Book b2)
	{
		return (int)b1.price-(int)b2.price;
	}
}
public class Book{
	static Scanner sc=new Scanner(System.in);
	public String title,author,publisher;
	public float price;
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public float getPrice()
	{
		return price;
	}
	public void setTitle()
	{
		System.out.println("Enter title:");
		this.title=sc.nextLine();
		sc.next();
	}
	public void setAuthor()
	{
		System.out.println("Enter author:");
		this.author=sc.nextLine();
		sc.next();
	}
	public void setPublisher()
	{
		System.out.println("Enter publisher:");
		this.publisher=sc.nextLine();
		sc.next();
	}
	public void setPrice()
	{
		System.out.println("Enter price:");
		this.price=sc.nextFloat();
	}
	public String toString() {
		return "Book:"+title+"Author:"+author+"Publisher:"+publisher+"Price:"+price+"\n";
	}
	public static void main(String args[]) {
		List <Book> book=new LinkedList <Book> ();
		while(true)
		{
			System.out.println("Menu\n1.Add book\n2.Display\n3.Exit\nEnter choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				Book b=new Book();
				b.setAuthor();
				b.setTitle();
				b.setPublisher();
				b.setPrice();
				book.add(b);
				break;
			case 2:
				Collections.sort(book,new Sort());
				for(int i=0;i<book.size();i++)
					System.out.println(book.get(i));
				break;
			case 3:System.exit(0);
			default:System.out.println("Invalid choice!");
			
			}
		}
	}
}
		
