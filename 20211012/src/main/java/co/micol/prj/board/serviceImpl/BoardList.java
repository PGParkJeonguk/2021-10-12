package co.micol.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardList implements Command {
	private BoardService boardService = new BoardServiceImpl();
	
	
	@Override
	public void execute() {
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = boardService.boardSelectList();
		
		System.out.println("===========================");
		for(BoardVO vo : boards) {
			System.out.print(vo.getBId() + " : ");
			System.out.print(vo.getBWriter() + " : ");
			System.out.print(vo.getBWritedate() + " : ");
			System.out.print(vo.getBTitle() + " : ");
			System.out.print(vo.getBHit() + " : \n");
			System.out.println("===========================");
		}
		
	}

}
