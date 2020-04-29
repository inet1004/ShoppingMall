package co.park.shop.shopManager.service;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("sysAdminVo")
public class SysAdminVo {
	
		private int sNum;	//�Ϸù�ȣ
		private String mRegister;	// ȸ�� ����ڵ�Ϲ�ȣ
		private String mAuthority;	// ȸ������ (���� Ȥ�� �̱�)
		private int mEmployeeNum;	// ����ڼ� (�⺻��1)
		private Date startDate;	// ��������
		private Date endDate;	// Ż������
		
		private Date sysUpdate; 	//��������
		private String upDateType; 	//���汸��(����, ����ڼ�)
		
		public SysAdminVo() {
			super();
		}

		public int getsNum() {
			return sNum;
		}

		public void setsNum(int sNum) {
			this.sNum = sNum;
		}

		public String getmRegister() {
			return mRegister;
		}

		public void setmRegister(String mRegister) {
			this.mRegister = mRegister;
		}

		public String getmAuthority() {
			return mAuthority;
		}

		public void setmAuthority(String mAuthority) {
			this.mAuthority = mAuthority;
		}

		public int getmEmployeeNum() {
			return mEmployeeNum;
		}

		public void setmEmployeeNum(int mEmployeeNum) {
			this.mEmployeeNum = mEmployeeNum;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public Date getSysUpdate() {
			return sysUpdate;
		}

		public void setSysUpdate(Date sysUpdate) {
			this.sysUpdate = sysUpdate;
		}

		public String getUpDateType() {
			return upDateType;
		}

		public void setUpDateType(String upDateType) {
			this.upDateType = upDateType;
		}
		
		
		
}
