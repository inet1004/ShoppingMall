package co.park.shop.shopManager.service;

import org.springframework.stereotype.Component;

@Component("companyMasterVo")
public class CompanyMasterVo {
	private String mRegister; // ����ڹ�ȣ
	private String mAdminId; 
	private String mName; //ȸ���
	private String mCeo;  //��ǥ�ڸ�
	private String mBusinessType;  // ����
	private String mBusinessCategory;  // ����
	private String mAddress;  //ȸ���ּ�
	private String mTel;	//ȸ�翬��ó
	private String mCellphone;  //�޴��� ����ó
	private String mEmail;	  //ȸ���̸����ּ�
	private String mAdminPassword;
	private String mAuthority;  // ������ �̱� or ����
	private int mEmployeeNum;  // ����ڼ�, �⺻ 1��
	
	public CompanyMasterVo() {
		super();
	}

	public String getmRegister() {
		return mRegister;
	}

	public void setmRegister(String mRegister) {
		this.mRegister = mRegister;
	}

	public String getmAdminId() {
		return mAdminId;
	}

	public void setmAdminId(String mAdminId) {
		this.mAdminId = mAdminId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmCeo() {
		return mCeo;
	}

	public void setmCeo(String mCeo) {
		this.mCeo = mCeo;
	}

	public String getmBusinessType() {
		return mBusinessType;
	}

	public void setmBusinessType(String mBusinessType) {
		this.mBusinessType = mBusinessType;
	}

	public String getmBusinessCategory() {
		return mBusinessCategory;
	}

	public void setmBusinessCategory(String mBusinessCategory) {
		this.mBusinessCategory = mBusinessCategory;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public String getmTel() {
		return mTel;
	}

	public void setmTel(String mTel) {
		this.mTel = mTel;
	}

	public String getmCellphone() {
		return mCellphone;
	}

	public void setmCellphone(String mCellphone) {
		this.mCellphone = mCellphone;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public String getmAdminPassword() {
		return mAdminPassword;
	}

	public void setmAdminPassword(String mAdminPassword) {
		this.mAdminPassword = mAdminPassword;
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
	
	
	
}
