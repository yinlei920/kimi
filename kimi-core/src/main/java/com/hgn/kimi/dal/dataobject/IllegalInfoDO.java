/**
 * 
 */
package com.hgn.kimi.dal.dataobject;

/**
 * @author yinlei
 *
 */
public class IllegalInfoDO extends BaseDO {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3750986165532025302L;

	private String carNum;
	
	private Long userId;
	
	/**
	 * 违法代码
	 */
	private String code;
	
	/**
	 * 违法的图片列表,多个用“，”分开
	 */
	private String picURL;
	
	/**
	 * 违法的视频地址，多个用“，”分开
	 */
	private String videoURL;
	
	/**
	 * 违法的地址 
	 */
	private String address;

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

	public String getPicURL() {
		return picURL;
	}

	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}

	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	
}
