package co.park.shop.shopManager.service;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CompanyRowMapper implements RowMapper<CompanyMasterVo> {

	@Override
	public CompanyMasterVo mapRow (ResultSet rs, int rowNum) throws SQLException {
		CompanyMasterVo vo = new CompanyMasterVo();
		vo.setmRegister(rs.getString("mregister"));
		vo.setmAdminId(rs.getString("madminId"));
		vo.setmName(rs.getString("mname"));
		vo.setmCeo(rs.getString("mceo"));
		vo.setmBusinessType(rs.getString("mbusinessType"));
		vo.setmBusinessCategory(rs.getString("mbusinessCategory"));
		vo.setmAddress(rs.getString("maddress"));
		vo.setmTel(rs.getString("mtel"));
		vo.setmCellphone(rs.getString("mcellphone"));
		vo.setmEmail(rs.getString("memail"));
		vo.setmAuthority(rs.getString("mauthority"));
		vo.setmEmployeeNum(rs.getInt("memployeenum"));
		return vo;
	}

	
	
}
