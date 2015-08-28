/**
 * 
 */
package com.hgn.kimi.biz;

import java.util.List;

import com.hgn.kimi.vo.CarInfoVO;

/**
 * @author yinlei
 *
 */
public interface ICarInfoService {

	
	
	public CarInfoVO getCarInfoVOByCarNum(String carNum);
	
	public List<CarInfoVO> getCarInfoListByUserId(Long userId);
}
