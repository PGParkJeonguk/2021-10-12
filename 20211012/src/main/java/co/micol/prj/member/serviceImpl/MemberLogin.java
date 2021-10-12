package co.micol.prj.member.serviceImpl;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberLogin implements Command {

	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		member.setId("jeonguk");
		member.setPassword("1234");
		System.out.println(member.getId() + " :  " + member.getPassword());
		
		member = memberService.loginCheck(member);
		System.out.println(member.getName() + " :  " + member.getAuthor());
		System.out.println(member.getId() + " :  " + member.getPassword());
	}

}
