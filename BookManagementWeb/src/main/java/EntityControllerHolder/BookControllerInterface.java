package EntityControllerHolder;

import java.util.List;

import javax.ejb.Stateless;

import EntityHolder.Book;

@Stateless
public interface BookControllerInterface {
	
	public void create(Book book);
	public List<Book> getbook();
	public Book searchbook(int isbn);
	public void updatebook(String isbn, String title);


}
