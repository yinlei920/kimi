/**
 * 
 */
package com.hgn.kimi.dal.dataobject;


/**
 * @author yinlei
 *
 */
public class UserDO extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4589765544839868329L;
	
	/**
	 * ID
	 */
	private long userId;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 性别：会显示性别
	 */
	private int sex;
	
	/**
	 * 驾龄
	 */
	private int driveAge;
	
	private String mobileNum;
	
	/**
	 * 头像
	 */
	private String avatarUrl;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	
	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public int getDriveAge() {
		return driveAge;
	}

	public void setDriveAge(int driveAge) {
		this.driveAge = driveAge;
	}
}
