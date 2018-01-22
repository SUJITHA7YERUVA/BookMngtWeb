package RESTAPIHolder;



import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import EntityControllerHolder.BookControllerInterface;
import EntityHolder.Book;
import EntityHolder.Member;

@Stateless
@Path("/books")
public class BookAPI {

	@Inject
	private BookControllerInterface bc;

	@POST
	@Consumes({"application/XML"})
	public void createBook(Book book) {
		bc.create(book);
	}

	@GET
	@Produces({"application/XML"})
	public List<Book> showallbooks() {
		return bc.getbook();

	}
	@GET
	@Produces({"application/XML"})
	@Path("{isbn}")
		public Book searchbook(@PathParam("isbn")int isbn) {
		return bc.searchbook(isbn);
	}
}
