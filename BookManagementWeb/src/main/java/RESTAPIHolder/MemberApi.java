package RESTAPIHolder;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

import EntityControllerHolder.MemberContollerInterface;

import EntityHolder.Member;

@Stateless
@Path("/members")
public class MemberApi {
	@Inject
	private MemberContollerInterface bm; 
	
	
	@POST
	@Consumes({"application/XML"})
	public void createmember(Member member){
		bm.createmember(member);
	}
	
	
	@GET
	@Produces({"application/XML"})
	@Consumes({"application/XML"})
	public List<Member> getmemeberinformation() {
		return bm.getmemeberinformation();
	}
	
	@GET
	@Produces({"application/XML"})
	@Path("{memberid}")
	public Member getmemeber(@PathParam("memberid")int memberid) {
		return bm.searchmemeber(memberid);
	}
	
	
@DELETE
@Consumes({"application/XML"})
@Path("{memberid}")
public void deletemember(@PathParam("memberid")int memberid) {
	bm.deleteemember(memberid);
}
@PUT
@Consumes({"application/XML"})
@Path("{memberid}")
public void updatemember(@PathParam("memberid")int memberid,Member m) {
	String adress=m.getAdress();
	String phonenumber=m.getPhonemumber();
	bm.updatemember(memberid, phonenumber, adress);
}
}
