/**
 * 
 */
package com.hgn.kimi.dal.dataobject;

/**
 * @author yinlei
 *
 */
public class IllegalCodeDO extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1647445337355847187L;

	
	private String code;
	
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
	
}
