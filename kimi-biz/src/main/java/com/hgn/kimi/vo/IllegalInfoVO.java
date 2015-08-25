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
public class IllegalInfoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2386963224685553258L;
	
	/**
	 * 车牌号
	 */
	private String carNum;
	
	private Long userId;
	
	/**
	 * 违法代码
	 */
	private String code;
	
	/**
	 * 违法的图片列表,多个用“，”分开
	 */
	private List<String> picURL;
	
	/**
	 * 违法的视频地址，多个用“，”分开
	 */
	private List<String> videoURL;
	
	/**
	 * 违法的地址 
	 */
	private String address;
	
	private int status;
	
	private Date createTime;
	
	private Date modifyTime;

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<String> getPicURL() {
		return picURL;
	}

	public void setPicURL(List<String> picURL) {
		this.picURL = picURL;
	}

	public List<String> getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(List<String> videoURL) {
		this.videoURL = videoURL;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	
	
	
	
}
