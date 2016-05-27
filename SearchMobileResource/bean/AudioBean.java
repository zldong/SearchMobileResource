package io.vov.vitamio.demo.bean;

public class AudioBean {
	public String _id;
	public String display_name;
	public String duration;
	public String data;
	public String title;
	public String album;
	public String mime_type;
	public String artist;
	public String composer;
	
	public AudioBean() {
		super();
	}

	public AudioBean(String _id, String display_name, String duration,
			String data, String title, String album, String mime_type,
			String artist, String composer) {
		super();
		this._id = _id;
		this.display_name = display_name;
		this.duration = duration;
		this.data = data;
		this.title = title;
		this.album = album;
		this.mime_type = mime_type;
		this.artist = artist;
		this.composer = composer;
	}
	
	
}
