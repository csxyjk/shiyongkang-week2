package com.bw.vo;

/**
 * @author 作者:SYk
 * @version 创建时间：2020年1月6日 上午9:01:57 类功能说明
 */
public class CompanyVo {
	private String kname;
	private String cdetail;
	private String cname;
	private String caddress;
	private String beginSale;
	private String endSale;
	private String beginTime;
	private String endTime;

	public CompanyVo(String kname, String cdetail, String cname, String caddress, String beginSale, String endSale,
			String beginTime, String endTime) {
		super();
		this.kname = kname;
		this.cdetail = cdetail;
		this.cname = cname;
		this.caddress = caddress;
		this.beginSale = beginSale;
		this.endSale = endSale;
		this.beginTime = beginTime;
		this.endTime = endTime;
	}

	public CompanyVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public String getCdetail() {
		return cdetail;
	}

	public void setCdetail(String cdetail) {
		this.cdetail = cdetail;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getBeginSale() {
		return beginSale;
	}

	public void setBeginSale(String beginSale) {
		this.beginSale = beginSale;
	}

	public String getEndSale() {
		return endSale;
	}

	public void setEndSale(String endSale) {
		this.endSale = endSale;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "CompanyVo [kname=" + kname + ", cdetail=" + cdetail + ", cname=" + cname + ", caddress=" + caddress
				+ ", beginSale=" + beginSale + ", endSale=" + endSale + ", beginTime=" + beginTime + ", endTime="
				+ endTime + "]";
	}

}
