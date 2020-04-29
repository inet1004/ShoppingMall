package co.park.shop.shopManager.service;

import org.springframework.stereotype.Component;

@Component("companyMasterVo")
public class CompanyMasterVo {
	private String mRegister; // 사업자번호
	private String mAdminId; 
	private String mName; //회사명
	private String mCeo;  //대표자명
	private String mBusinessType;  // 업태
	private String mBusinessCategory;  // 업태
	private String mAddress;  //회사주소
	private String mTel;	//회사연락처
	private String mCellphone;  //휴대폰 연락처
	private String mEmail;	  //회사이메일주소
	private String mAdminPassword;
	private String mAuthority;  // 사용권한 싱글 or 다중
	private int mEmployeeNum;  // 사용자수, 기본 1명
	
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
