/**
 * 
 */
package com.hgn.kimi.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author yinlei
 *
 */
public class CarInfoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8503166243319177130L;

	private String carNum;
	
	private int carId;
	
	private String picURL;
	
	private long	userId;
	
	private int status;
	
	private Date createTime;
	
	private Date modifyTime;
	
	/**
	 * 违法列表
	 */
	private List<IllegalInfoVO> illegalList;
	

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getPicURL() {
		return picURL;
	}

	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
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

	public List<IllegalInfoVO> getIllegalList() {
		return illegalList;
	}

	public void setIllegalList(List<IllegalInfoVO> illegalList) {
		this.illegalList = illegalList;
	}
	
}