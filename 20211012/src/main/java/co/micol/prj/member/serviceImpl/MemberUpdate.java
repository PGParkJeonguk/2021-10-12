package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	private Scanner scn = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();
	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("=========================");
		System.out.println("변경하고싶은 회원의 아이디를 입력하세요.");
		member.setId(scn.nextLine());
		System.out.println("변경할 회원의 이름을 입력하세요");
		member.setName(scn.nextLine());
		System.out.println("변경할 회원의 패스워드를 입력하세요");
		member.setPassword(scn.nextLine());
		System.out.println("변경할 회원의 전화번호를 입력하세요");
		member.setTel(scn.nextLine());
		System.out.println("변경할 회원의 주소를 입력하세요");
		member.setAddresss(scn.nextLine());
		System.out.println("변경할 회원의 권한을 입력하세요");
		member.setAuthor(scn.nextLine());
		
		int n = dao.memberUpdate(member);
		if( n != 0 ) {
			System.out.println("정상적으로 변경되었습니다.");
		}else {
			System.out.println("회원 정보 변경에 실패하였습니다.");
		}
		
	}

}
