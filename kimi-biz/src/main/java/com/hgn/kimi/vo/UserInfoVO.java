/**
 * 
 */
package com.hgn.kimi.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yinlei
 *
 */
public class UserInfoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1144018255376733706L;
	
	
	private Long userId;
	
	private String name;
	
	private String userName;
	
	private Integer sex;
	
	private String avatarUrl;
	
	private Integer status;
	
	private Date createTime;
	
	private Date modifyTime;
	
	
	

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	
}
