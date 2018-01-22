package EntityControllerHolder;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;


import DBAControllerHolder.DBAControllerInterface;
import EntityHolder.Book;
@Stateless
public class BookContollerImplementation implements BookControllerInterface{
	
@Inject
private DBAControllerInterface dbcontrol;
	@Override
	public void create(Book book) {

		dbcontrol.create(book);
	}

	@Override
	public List<Book> getbook() {
		
		return dbcontrol.getbook();
	}

	@Override
	public Book searchbook(int isbn) {
		// TODO Auto-generated method stub
		return dbcontrol.searchbook(isbn);
	}

	@Override
	public void updatebook(String isbn, String title) {
		// TODO Auto-generated method stub
		
	}


}
