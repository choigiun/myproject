package search.image.service;

/**
 * 검색 출력 결과
 * @author liamg
 *
 */
public class ImageResVO {

	private String rss;
	private String channel;
	private String lastBuildDate;
	private String total;
	private String start;
	private String display;
	private String items;
	private String title;
	private String link;
	private String thumbnail;
	private String sizeheight;
	private String sizewidth;
	
	public String getRss() {
		return rss;
	}
	public void setRss(String rss) {
		this.rss = rss;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getLastBuildDate() {
		return lastBuildDate;
	}
	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getSizeheight() {
		return sizeheight;
	}
	public void setSizeheight(String sizeheight) {
		this.sizeheight = sizeheight;
	}
	public String getSizewidth() {
		return sizewidth;
	}
	public void setSizewidth(String sizewidth) {
		this.sizewidth = sizewidth;
	}
	
}
