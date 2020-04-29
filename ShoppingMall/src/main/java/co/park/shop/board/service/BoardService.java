package co.park.shop.board.service;

import java.util.ArrayList;

public interface BoardService {
	public ArrayList<BoardVo> select();
	public BoardVo getSelect(int boardid);
	public int update(BoardVo boardVo);
	public int insert(BoardVo boardVo);
	public int delete(int boardVo);
}
