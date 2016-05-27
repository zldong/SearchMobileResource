package io.vov.vitamio.demo.bean;

public class ImageBean {
	public String _id;
	public String display_name;
	public String description;
	public String data;
	public String title;
	public String mime_type;
	public String size;
	public String width;
	public String height;
	public ImageBean(String _id, String display_name, String description,
			String data, String title, String mime_type, String size,
			String width, String height) {
		super();
		this._id = _id;
		this.display_name = display_name;
		this.description = description;
		this.data = data;
		this.title = title;
		this.mime_type = mime_type;
		this.size = size;
		this.width = width;
		this.height = height;
	}
	public ImageBean() {
		super();
	}
	
	
}
