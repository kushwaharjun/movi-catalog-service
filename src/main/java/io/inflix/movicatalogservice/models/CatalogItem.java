package io.inflix.movicatalogservice.models;

public class CatalogItem {
	public CatalogItem(String name, String desc, int ratting) {
		super();
		this.name = name;
		this.desc = desc;
		this.ratting = ratting;
	}

	private String name;
	private String desc;
	private int ratting;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRatting() {
		return ratting;
	}

	public void setRatting(int ratting) {
		this.ratting = ratting;
	}

}
