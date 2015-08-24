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
	private long user_id;
	
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
	
	private int mobileNum;
	
	/**
	 * 车辆信息，和car_info 为一对多关系，即一人有可能有多辆车，这里用‘，’分割开，比如 ：100000，1000001
	 */
	private String cars;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
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

	public int getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}

	public int getDriveAge() {
		return driveAge;
	}

	public void setDriveAge(int driveAge) {
		this.driveAge = driveAge;
	}
}
