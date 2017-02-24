/**
 * 
 */
package com.hgn.kimi.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hgn.kimi.biz.ICarInfoService;
import com.hgn.kimi.dal.dao.ICarInfoDAO;
import com.hgn.kimi.dal.dao.IIllegalInfoDAO;
import com.hgn.kimi.dal.dataobject.CarInfoDO;
import com.hgn.kimi.dal.dataobject.IllegalInfoDO;
import com.hgn.kimi.exception.DAOException;
import com.hgn.kimi.vo.CarInfoVO;
import com.hgn.kimi.vo.IllegalInfoVO;
import com.hgn.kimi.vo.transfer.CarInfoTransfer;
import com.hgn.kimi.vo.transfer.IllegalInfoTransfer;

/**
 * @author yinlei
 *
 */
public class CarInfoServiceImpl implements ICarInfoService {
	public static final Logger log = LoggerFactory.getLogger(CarInfoServiceImpl.class);
	
	@Resource
	private ICarInfoDAO carInfoDAO;
	
	@Resource
	private IIllegalInfoDAO illegalInfoDAO;
	
	/* (non-Javadoc)
	 * @see com.hgn.kimi.biz.ICarInfoService#getCarInfoVOByCarNum(java.lang.String)
	 */
	@Override
	public CarInfoVO getCarInfoVOByCarNum(String carNum) {
		CarInfoVO carVO = null; 
		log.info("获取汽车信息，车牌号为："+carNum);
		try {
			CarInfoDO carDO = carInfoDAO.getCarInfo(carNum);
			List<IllegalInfoVO> infoVO = new ArrayList<IllegalInfoVO>();
			if(carDO!=null){
				List<IllegalInfoDO> listillegalDO = illegalInfoDAO.queryIllegalInfo(carNum);
				if(null!=listillegalDO && listillegalDO.size()>0){
					for(IllegalInfoDO info : listillegalDO){
						infoVO.add(IllegalInfoTransfer.doTOvo(info));
					}
				}
				carVO = CarInfoTransfer.doTOvo(carDO);
				if(carVO!=null){
					carVO.setIllegalList(infoVO);
				}
			}
		} catch (DAOException e) {
			log.error(e.getMessage());
		}
		return carVO;
	}

	/* (non-Javadoc)
	 * @see com.hgn.kimi.biz.ICarInfoService#getCarInfoListByUserId(java.lang.Long)
	 */
	@Override
	public List<CarInfoVO> getCarInfoListByUserId(Long userId) {
		List<CarInfoVO> cars = new ArrayList<CarInfoVO>();
		try {
			List<CarInfoDO> carList =  carInfoDAO.getCarList(userId);
			if(null!=carList && carList.size()>0){
				for(CarInfoDO carDO:carList){
					CarInfoVO vo = CarInfoTransfer.doTOvo(carDO);
					cars.add(vo);
				}
			}
		} catch (DAOException e) {
			log.error(e.getMessage());
		}
		return cars;
	}

}
