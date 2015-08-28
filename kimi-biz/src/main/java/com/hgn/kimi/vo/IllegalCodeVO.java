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
public class IllegalCodeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5990017981384212215L;

	/**
	 * 违章代码
	 */
	private String code;
	
	/**
	 * 违章标题
	 */
	private String title;
	
	/**
	 * 扣几分呢？
	 */
	private Integer score;
	
	/**
	 * 罚款金额
	 */
	private Double fines;
	
	/**
	 * 处罚的内容
	 */
	private String punishment;
	
	private int status;
	
	private Date createTime;
	
	private Date modifyTime;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Double getFines() {
		return fines;
	}

	public void setFines(Double fines) {
		this.fines = fines;
	}

	public String getPunishment() {
		return punishment;
	}

	public void setPunishment(String punishment) {
		this.punishment = punishment;
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
