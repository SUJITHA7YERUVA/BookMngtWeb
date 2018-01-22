package DBAControllerHolder;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import EntityHolder.Book;
import EntityHolder.Member;
import RESTAPIHolder.MemberApi;

@Stateless
public class DBAControllerImplementation implements DBAControllerInterface{
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public void create(Book book) {
		em.persist(book);
		
	}

	@Override
	public List<Book> getbook() {
		Query q = em.createQuery("Select book from Book book");
		return q.getResultList();
	}

	@Override
	public Book searchbook(int isbn) {
		Query qb = em.createQuery("select book from Book AS book WHERE book.isbn = :isbn");
		qb.setParameter("isbn", isbn);
		return (Book) qb.getSingleResult();
	}

	@Override
	public void updatebook(String isbn, String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createmember(Member member) {
		em.persist(member);
		
	}

	@Override
	public List<Member> getmemeberinformation() {
		Query q = em.createQuery("Select mem from Member mem");
		return q.getResultList();
	}
	

	@Override
	public Member searchmemeber(int memberid) {
	Query q1 = em.createQuery("select mem from Member AS mem WHERE mem.memberid = :memberid");
	q1.setParameter("memberid", memberid);
	return (Member) q1.getSingleResult();
		
	}

	

	@Override
	public void deletemember(int memberid) {
		Member member=searchmemeber(memberid);
		em.remove(memberid);
		
	}

	@Override
	public void updatemember(int memberid, String phonenumber, String adress) {
		Member member=searchmemeber(memberid);
		member.setAdress(phonenumber);
		member.setPhonemumber(adress);
	}


}
