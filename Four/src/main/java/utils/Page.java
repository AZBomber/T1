package utils;

import java.util.List;

public class Page<T> {
	public int csid;
	public int cid;
	public int totalcount;// 总查询到个数
	public int limit;// 每页显示多少个数
	public int pagecount;// 显示多少页
	public int nowpage;// 当前第几页
	public int begin;// 从哪开始
	public List<T> product;// 每页显示的集合

	public int getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPagecount() {
		return pagecount;
	}

	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}

	public int getNowpage() {
		return nowpage;
	}

	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public List<T> getProduct() {
		return product;
	}

	public void setProduct(List<T> product) {
		this.product = product;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCsid() {
		return csid;
	}

	public void setCsid(int csid) {
		this.csid = csid;
	}

}
