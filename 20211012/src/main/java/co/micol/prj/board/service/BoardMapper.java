package co.micol.prj.board.service;

import java.util.List;

public interface BoardMapper {		//mybatis에서 사용할 인터페이스
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	int boardHitUpdate(int id);
//5	지금은 똑같음 서비스랑 대동소이함
//6 map xml을 제작	-	mapper interface연결
}
