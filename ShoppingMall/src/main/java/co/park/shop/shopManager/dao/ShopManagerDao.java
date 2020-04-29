package co.park.shop.shopManager.dao;

import java.sql.SQLException;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.xml.Jdbc4SqlXmlHandler;
import org.springframework.stereotype.Repository;

import co.park.shop.shopManager.service.ShopManagerService;
import co.park.shop.shopManager.service.CompanyRowMapper;
import co.park.shop.shopManager.service.CompanyMasterVo;

@Repository("dao")
public class ShopManagerDao implements ShopManagerService {

	@Autowired
//	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	private String INSERT = "insert into companymaster values(?,?,?,?,?,?,?,?,?,?,?,'단일사용자',1)";
	
	private String SELECT_LIST =
			"select * from companymaster";
	
	private String SELECT = 
			"select * from companymaster where mregister=?";
	
	@Override
	public ArrayList<CompanyMasterVo> selectList() throws SQLException {
		return (ArrayList<CompanyMasterVo>) jdbcTemplate.query(SELECT_LIST, new CompanyRowMapper());
	} //jdbc템플릿을 이용한경우임, 반드시 맵퍼 (new CompanyRowMapper())를 만들어 주어야함.
		// .query 응 여러열 쿼리

	@Override
	public CompanyMasterVo getSelect(String key) throws SQLException {
		// queryForList는 하나의 열 쿼리
		return (CompanyMasterVo) jdbcTemplate.queryForList( SELECT, key, new CompanyRowMapper());
	}

	@Override
	public int insert(CompanyMasterVo vo) throws SQLException {
		int n = jdbcTemplate.update(INSERT, 
				vo.getmRegister(),
				vo.getmAdminId(),
				vo.getmName(),
				vo.getmCeo(),
				vo.getmBusinessType(),
				vo.getmBusinessCategory(),
				vo.getmAddress(),
				vo.getmTel(),
				vo.getmCellphone(),
				vo.getmEmail(),
				vo.getmAdminPassword()
				);
		return n;
	}

	@Override
	public int update(CompanyMasterVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(CompanyMasterVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
