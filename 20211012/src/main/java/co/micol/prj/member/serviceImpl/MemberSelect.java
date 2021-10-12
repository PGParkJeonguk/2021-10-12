package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberSelect implements Command {
private Scanner scn = new Scanner(System.in);
private MemberService dao = new MemberServiceImpl();
	@Override
	public void execute() {
		
		MemberVO member = new MemberVO();
		System.out.println("=========================");
		System.out.println("조회할 회원을 입력하세요.");
		member.setId(scn.nextLine());
		member = dao.memberSelect(member);
		
		System.out.println("ID : " + member.getId());
		System.out.println("이름 : " + member.getName());
		System.out.println("password :  " + member.getPassword() );
		System.out.println("전화번호 : " + member.getTel());
		System.out.println("주소 : " + member.getAddresss());
		System.out.println("권한 : " + member.getAuthor());
		
	}

}
