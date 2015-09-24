/**
 * 
 */
package org.kimi.thread;

import java.util.Date;
import java.util.concurrent.Callable;

import com.hgn.kimi.vo.UserInfoVO;

/**
 * @author yinlei
 *
 */
public class CountUser implements Callable<UserInfoVO> {

	
	private Long userId;
	
	
	private String name;
	
	private String userName;
	
	private Date createTime;
	
	private Integer status;
	
	
	public CountUser(Long userId,String name,String userName,Date createTime,Integer status){
		this.userId     = userId;
		this.name       = name;
		this.userName   = userName;
		this.createTime = createTime;
		this.status     = status;
	}
	
	
	
	@Override
	public UserInfoVO call() throws Exception {

		
		
		
		
		
		
		
		
		return null;
	}



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



	public Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}

	
	
	
	
}
