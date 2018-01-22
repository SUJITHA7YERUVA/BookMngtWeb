package DBAControllerHolder;

import java.util.List;

import javax.ejb.Local;

import EntityHolder.Book;
import EntityHolder.Member;
import RESTAPIHolder.MemberApi;

@Local
public interface DBAControllerInterface {
	
	public void create(Book book);
	public List<Book> getbook();
	public  Book searchbook(int isbn);

	public void updatebook(String isbn,String title);
//	break------------------------------------
	public void createmember(Member member);
	public List<Member> getmemeberinformation();
	public  Member searchmemeber(int memberid);
	public void updatemember(int memberid,String phonenumber,String adress);
	public void deletemember(int memberid);

}
