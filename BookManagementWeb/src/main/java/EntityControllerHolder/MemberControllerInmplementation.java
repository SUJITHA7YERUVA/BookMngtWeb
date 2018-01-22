package EntityControllerHolder;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import DBAControllerHolder.DBAControllerInterface;
import EntityHolder.Member;
import RESTAPIHolder.MemberApi;
@Stateless
public class MemberControllerInmplementation implements MemberContollerInterface {
	@Inject
	private DBAControllerInterface DM;
	

	@Override
	public void createmember(Member member) {
		DM.createmember(member);

	}

	@Override
	public List<Member> getmemeberinformation(){
		// TODO Auto-generated method stub
		return DM.getmemeberinformation();
	}



	
	@Override
	public Member searchmemeber(int memebrid) {
		return DM.searchmemeber(memebrid);

	}

	@Override
	public void updatemember(int memberid, String phonenumber, String adress) {
		 DM.updatemember(memberid, phonenumber, adress);
		
	}

	@Override
	public void deleteemember(int memberid) {
	DM.deletemember(memberid);
		
	}

}
