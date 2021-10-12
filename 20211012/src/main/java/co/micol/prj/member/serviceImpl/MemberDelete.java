package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private Scanner scn = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();
	
	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("=========================");
		System.out.println("삭제할 회원 아이디를 입력하세요.");
		member.setId(scn.nextLine());
		int n = dao.memberDelete(member);
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("회원 삭제에 실패하였습니다.");
		}
	}

}
