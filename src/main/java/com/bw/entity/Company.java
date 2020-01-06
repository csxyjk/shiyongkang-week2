package com.bw.entity;
/** 
* @author 作者:SYk
* @version 创建时间：2020年1月6日 上午8:48:23 
* 类功能说明 
*/

import java.math.BigInteger;
import java.util.Date;

public class Company {
	private BigInteger cid;
	private String keyname;
	private String detail;
	private String cname;
	private String caddress;
	private String product;
	private String sales;
	private Date ctime;
	private Date checktime;
	private String csaying;
	private String cstatus;

	public BigInteger getCid() {
		return cid;
	}

	public void setCid(BigInteger cid) {
		this.cid = cid;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public Company(BigInteger cid, String keyname, String detail, String cname, String caddress, String product,
			String sales, Date ctime, Date checktime, String csaying, String cstatus) {
		super();
		this.cid = cid;
		this.keyname = keyname;
		this.detail = detail;
		this.cname = cname;
		this.caddress = caddress;
		this.product = product;
		this.sales = sales;
		this.ctime = ctime;
		this.checktime = checktime;
		this.csaying = csaying;
		this.cstatus = cstatus;
	}

	public Company(BigInteger cid, String keyname, String detail, String cname, String product, String sales,
			Date ctime, Date checktime, String csaying, String cstatus) {
		super();
		this.cid = cid;
		this.keyname = keyname;
		this.detail = detail;
		this.cname = cname;
		this.product = product;
		this.sales = sales;
		this.ctime = ctime;
		this.checktime = checktime;
		this.csaying = csaying;
		this.cstatus = cstatus;
	}

	public String getKeyname() {
		return keyname;
	}

	public void setKeyname(String keyname) {
		this.keyname = keyname;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Date getChecktime() {
		return checktime;
	}

	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}

	public String getCsaying() {
		return csaying;
	}

	public void setCsaying(String csaying) {
		this.csaying = csaying;
	}

	public String getCstatus() {
		return cstatus;
	}

	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", keyname=" + keyname + ", detail=" + detail + ", cname=" + cname
				+ ", caddress=" + caddress + ", product=" + product + ", sales=" + sales + ", ctime=" + ctime
				+ ", checktime=" + checktime + ", csaying=" + csaying + ", cstatus=" + cstatus + "]";
	}

}
