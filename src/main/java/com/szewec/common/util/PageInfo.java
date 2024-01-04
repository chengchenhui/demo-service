package com.szewec.common.util;

import java.util.Collections;
import java.util.List;

/**
 * 分页列表数据封装类
 * @author zhujindan
 *
 * @param <T>
 */
public class PageInfo<T> {

	/* 状态 */
	private String code;

	/* 返回信息描述 */
	private String message;

	/* 查询数据列表*/
	private List<T> data = Collections.emptyList();

	/* 总数 */
	private long total;

	/* 每页显示条数 */
	private int size;

	/* 总页数 */
	private long pages;

	/* 当前页 */
	private int current = 1;

	private String error;

	public PageInfo(List<T> data,long total,int size,long pages,int current){
		this.data    = data;
		this.total   = total;
		this.size    = size;
		this.pages   = pages;
		this.current = current;
	}
	public PageInfo(String code, String message){
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public long getPages() {
		return pages;
	}

	public void setPages(long pages) {
		this.pages = pages;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}





}
