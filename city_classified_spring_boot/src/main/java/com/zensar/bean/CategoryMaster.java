package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CategoryMaster {
	@Id
	@Column(name="category_id")
	int categoryId;
	@Column(name="category_name")
	String categoryName;

	public CategoryMaster() {

	}

	@Override
	public String toString() {
		return "CategoryMaster [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public CategoryMaster(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

}
