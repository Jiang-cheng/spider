package edu.csuft.xincheng.spider;

public class bilibili {
	/**
	 * 排名
	 */
	int id;
	
	/**
	 * 名称
	 */
	String title;
	
	/**
	 * 弹幕
	 */
	String danmu;

	/**
	 * 收藏
	 */
	String like;
	
	/**
	 * 得分
	 */
	double score;
	
	/**
	 * 更新状态
	 */
	String stage;
	
	/**
	 * 图片
	 */
	String image;

	@Override
	public String toString() {
		return "bilibili [id=" + id + ", title=" + title + ", danmu=" + danmu + ", like=" + like + ", score=" + score
				+ ", stage=" + stage + ", image=" + image + "]";
	}
	
	
	
	
}
