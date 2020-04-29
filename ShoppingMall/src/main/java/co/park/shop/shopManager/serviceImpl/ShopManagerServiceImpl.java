package co.park.shop.shopManager.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.park.shop.shopManager.dao.ShopManagerDao;
import co.park.shop.shopManager.service.ShopManagerService;
import co.park.shop.shopManager.service.CompanyMasterVo;

@Service("shop")  // shop이라는 이름으로 컨테이너에 들어감
public class ShopManagerServiceImpl implements ShopManagerService {
	
	@Autowired
	ShopManagerDao dao;
	
	@Override
	public ArrayList<CompanyMasterVo> selectList() throws SQLException {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	@Override
	public CompanyMasterVo getSelect(String key) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getSelect(key);
	}

	@Override
	public int insert(CompanyMasterVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return dao.insert(vo);
	}

	@Override
	public int update(CompanyMasterVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return dao.update(vo);
	}

	@Override
	public int delete(CompanyMasterVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return dao.delete(vo);
	}

}
