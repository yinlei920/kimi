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
	private long id;
	
	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 性别
	 */
	private int sex;
	
	private String mobileType;
	
	private int mobileNum;
	
	/**
	 * 车型：车牌号;
	 */
	private String cars;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getCars() {
		return cars;
	}

	public void setCars(String cars) {
		this.cars = cars;
	}

	public String getMobileType() {
		return mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public int getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}
	
}
