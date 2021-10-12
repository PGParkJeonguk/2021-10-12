package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberInsert implements Command {
	private Scanner scn = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();
	@Override
	public void execute() {
		
		MemberVO member = new MemberVO();
		System.out.println("====================");
		System.out.println("아이디를 입력하세요");
		member.setId(scn.nextLine());
		System.out.println("이름을 입력하세요");
		member.setName(scn.nextLine());
		System.out.println("패스워드를 입력하세요");
		member.setPassword(scn.nextLine());
		System.out.println("전화번호를 입력하세요(선택사항)");
		member.setTel(scn.nextLine());
		System.out.println("주소를 입력하세요(선택사항)");
		member.setAddresss(scn.nextLine());
		int n = dao.memberInsert(member);
		if( n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		}else {
			System.out.println("등록에 실패하였습니다.");
		}
		
	}

}
