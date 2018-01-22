package EntityControllerHolder;

import java.util.List;

import javax.ejb.Local;

import EntityHolder.Member;
import RESTAPIHolder.MemberApi;

@Local
public interface MemberContollerInterface {


	public void createmember(Member member);
	public List<Member> getmemeberinformation();
	public  Member searchmemeber(int memberid);
	public void updatemember(int memberid,String phonenumber,String adress);
	public void deleteemember(int memberid);
	
}
