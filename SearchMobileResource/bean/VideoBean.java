package io.vov.vitamio.demo.bean;

public class VideoBean {
	public String _id;
	public String album;
	public String artist;
	public String data;
	public String description;
	public String display_name;
	public String duration;
	public VideoBean(String _id, String album, String artist, String data,
			String description, String display_name, String duration) {
		super();
		this._id = _id;
		this.album = album;
		this.artist = artist;
		this.data = data;
		this.description = description;
		this.display_name = display_name;
		this.duration = duration;
	}
	public VideoBean() {
		super();
	}
	
	
}
