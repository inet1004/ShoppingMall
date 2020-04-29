package co.park.shop.board.service;

import java.util.Date;

import org.springframework.stereotype.Service;

// @Component("boardVo") 방법1 // root-context.xml에 bean으로 설정 할 경우
@Service("boardVo") // 방법2 (추천하는 방법)--- 구체적으로 해야 하는 일이 있을 경우
public class BoardVo {

	private int boardId;
	private String writer;
	private String wDate;
	private String title;
	private String contents;
	private int hit;
	private String fileName;
	
	public BoardVo() {
		// TODO Auto-generated constructor stub
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getwDate() {
		return wDate;
	}

	public void setwDate(String string) {
		this.wDate = string;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
