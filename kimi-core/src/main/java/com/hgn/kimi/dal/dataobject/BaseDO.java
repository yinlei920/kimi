/**
 * 
 */
package com.hgn.kimi.dal.dataobject;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yinlei
 *
 */
public class BaseDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5611984221303874606L;
	
	
	/**
     * 是否删除
     */
    private int status;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;

    public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	/**
     * @return gmtCreate
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate the gmtCreate to set
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified the gmtModified to set
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

	

}
