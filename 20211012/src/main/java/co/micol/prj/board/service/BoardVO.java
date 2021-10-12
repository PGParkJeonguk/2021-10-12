package co.micol.prj.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
	private int bId;
	private String bWriter;
	private Date bWritedate;
	private String bTitle;
	private String bContents;
	private int bHit;
	//1	BoardVO 만들기
	//2 db.properties 생성
	//3.mybatis-config 생성
}
