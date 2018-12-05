package utils;

import java.util.List;

public class Page<T> {
	public int csid;
	public int cid;
	public int totalcount;// �ܲ�ѯ������
	public int limit;// ÿҳ��ʾ���ٸ���
	public int pagecount;// ��ʾ����ҳ
	public int nowpage;// ��ǰ�ڼ�ҳ
	public int begin;// ���Ŀ�ʼ
	public List<T> product;// ÿҳ��ʾ�ļ���

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
