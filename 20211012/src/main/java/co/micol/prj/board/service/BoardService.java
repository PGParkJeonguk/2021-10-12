package co.micol.prj.board.service;

import java.util.List;

public interface BoardService {		//서비스 인터페이스
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	//4
}
