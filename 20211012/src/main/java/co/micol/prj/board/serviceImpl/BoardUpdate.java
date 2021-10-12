package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardUpdate implements Command {
	private Scanner scn = new Scanner(System.in);
	private BoardService dao = new BoardServiceImpl();
	
	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("=========================");
		System.out.println("변경할 글 번호를 입력하세요.");
		vo.setBId(scn.nextInt());scn.nextLine();
		System.out.println("변경할 내용을 입력하세요.");
		vo.setBContents(scn.nextLine());
		
		int n = dao.boardUpdate(vo);
		if( n != 0) {
			System.out.println("정상적으로 변경되었습니다.");
		}else {
			System.out.println("글 수정에 실패하였습니다.");
		}
	}

}
