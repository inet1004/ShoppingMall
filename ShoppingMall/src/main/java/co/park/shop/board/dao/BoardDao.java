package co.park.shop.board.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import co.park.shop.board.service.BoardService;
import co.park.shop.board.service.BoardVo;
import co.park.shop.common.Dao;

@Repository("boardDao")
public class BoardDao implements BoardService {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Resource(name="boardVo")
	BoardVo boardVo;
	
	private DateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
	
	private final String SELECT_ALL = "select * from board";
	private final String SELECT = "select * from board where boardid = ?";
	private final String INPUT = "input board values(b_num.nextval,?,?,?,?,0,?)";
	
	public ArrayList<BoardVo> select(){
		ArrayList<BoardVo> list =new ArrayList<BoardVo>();
		try {
			conn = Dao.getConnection();
			psmt = conn.prepareStatement(SELECT_ALL);
			rs = psmt.executeQuery();
			while(rs.next()) {
				boardVo=new BoardVo(); // 싱글톤으로 사용
				boardVo.setBoardId(rs.getInt("boardId"));
				boardVo.setWriter(rs.getString("writer"));
				boardVo.setTitle(rs.getString("title"));
				boardVo.setHit(rs.getInt("hit"));
				boardVo.setFileName(rs.getString("fileName"));
				list.add(boardVo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BoardVo getSelect(int boardid) {
		BoardVo vo = new BoardVo();
		// Date date =  new Date();
		try {
			conn = Dao.getConnection();
			psmt = conn.prepareStatement(SELECT);
			psmt.setInt(1, boardid);
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setBoardId(rs.getInt("boardId"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				//valueOf 로
		/*		vo.setwDate(Date.valueOf(sf.format(rs.getDate("wdate")))); */
				vo.setwDate(sf.format((rs.getDate("wdate"))));  //Date를 String으로 고쳐라~~
				vo.setContents(rs.getString("contents"));
				vo.setHit(rs.getInt("hot"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(BoardVo boardVo) {
		int n = 0;
		try {
			conn = Dao.getConnection();
			psmt = conn.prepareStatement(INPUT);
			psmt.setString(1, boardVo.getWriter());
			// (Date)로
	/*		psmt.setDate(2, Date.valueOf(sf.format(boardVo.getwDate()))); */
			psmt.setString(2, (sf.format(boardVo.getwDate())));
			psmt.setString(3, boardVo.getTitle());
			psmt.setString(4, boardVo.getContents());
			psmt.setString(5, boardVo.getFileName());
			
			n=psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int boardVo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
