/**
 * 
 */
package com.hgn.kimi.dal.dataobject;

/**
 * @author yinlei
 *
 */
public class CarInfoDO extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4203900777177186790L;
	
	private String carNum;
	
	private Integer carId;
	
	private String carPic;
	
	private Long	userId;

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

	public String getCarPic() {
		return carPic;
	}

	public void setCarPic(String carPic) {
		this.carPic = carPic;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
