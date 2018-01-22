package EntityHolder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY.AUTO)
	private int isbn;
	private String author;
	private String title;
	private String genre;
	private String shelf;
	
	public Book() {
	
	}
	public Book(String author, String title, String genre, String shelf) {
		super();
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.shelf = shelf;
	}
	
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getShelf() {
		return shelf;
	}
	public void setShelf(String shelf) {
		this.shelf = shelf;
	}
	
	
}
