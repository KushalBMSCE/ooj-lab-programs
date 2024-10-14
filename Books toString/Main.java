import java.util.Scanner;
class Books{
	String name;
	String author;
	int price;
	int numPages;
	Books(String name, String author, int price, int numPages)
	{
		this.name = name; 
		this.author = author; 
		this.price = price;
		this.numPages = numPages;
	}
	public String toString()
	{
		String name,author,price,numPages;
		name = "Book name: " + this.name + "\n";
		author = "Author name: " + this.author + "\n";
		price = "Price: " + this.price + "\n";
		numPages = "Number of pages: " + this.numPages + "\n";
		return name + author + price + numPages;
	}
}
public class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n, price, numPages;
		String name, author;
		System.out.println("Enter number of Books : \n");
		n = s.nextInt();
		Books b[];
		b=new Books[n];
		for(int i=0;i<n;i++){
			System.out.println("\n Enter Book "+(i+1)+" Details");
			System.out.println("Enter book name :");
			name = s.next();
			System.out.println("Enter book author :");
			author = s.next();
			System.out.println("Enter book price :");
			price = s.nextInt();
			System.out.println("Enter number of pages :");
			numPages = s.nextInt();
			b[i]=new Books(name,author,price,numPages);
		}
		for(int j=0;j<n;j++){
			System.out.println("\n Book "+(j+1)+" Details");
			System.out.println(b[j].toString());

		}
		System.out.println("Kushal Naidu N \n 24BECS408");
	}
}