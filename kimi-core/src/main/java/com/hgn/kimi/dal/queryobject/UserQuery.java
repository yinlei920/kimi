/**
 * 
 */
package com.hgn.kimi.dal.queryobject;

import java.io.Serializable;
import java.util.List;

/**
 * @author yinlei
 *
 */
public class UserQuery implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7180037380101786593L;

	private Long userId;
	
	private String userName;
	
	private String email;
	
	private String phone;
	
	private Integer sex;
	
	private List<Integer> carIds;
	
	private Integer status;
	
	private Integer driveAge;
	
	private Integer pageSize;
	
	private Integer pageNo;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public List<Integer> getCarIds() {
		return carIds;
	}

	public void setCarIds(List<Integer> carIds) {
		this.carIds = carIds;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDriveAge() {
		return driveAge;
	}

	public void setDriveAge(Integer driveAge) {
		this.driveAge = driveAge;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

}
