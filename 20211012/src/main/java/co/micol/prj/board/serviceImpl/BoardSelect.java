package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardSelect implements Command {
private Scanner scn = new Scanner(System.in);
private BoardService dao = new BoardServiceImpl();

	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("=========================");
		System.out.println("조회할 공지사항 번호를 입력하세요.");
		board.setBId(scn.nextInt());
		board = dao.boardSelect(board);
		
		System.out.println("번호 : " + board.getBId() + "      ");
		System.out.println("작성자 : " +board.getBWriter() + "      ");
		System.out.println("작성날짜 : " +board.getBWritedate() + "      ");
		System.out.println("제목 : " +board.getBTitle() + "      ");
		System.out.println("내용 : " +board.getBContents() + "      " );
		System.out.println("조회수 : " +board.getBHit() + "      "); 
	}

}
