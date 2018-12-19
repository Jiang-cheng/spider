package edu.csuft.xincheng.spider;
/**
  * 淘宝女装
 * @author Administrator
 *
 */
public class taobao implements Comparable<taobao>{
	
	/**
	 * 商店
	 */
	String shop;
	
	/**
	 * 商品
	 */
	String goods;
	
	
	/**
	 * 价格
	 */
	double price;
	
	/**
	 * 付款人数
	 */
	int people;
	
	/**
	 * 评分1
	 */
	double rating1;
	
	/**
	 * 评分2
	 */
	double rating2;
	
	/**
	 * 评分3
	 */
	double rating3;
	
	/**
	 * 图片
	 */
	String img;
	
	
	
	

	@Override
	public String toString() {
		return "taobao [shop=" + shop + ", goods=" + goods + ", price=" + price + ", people=" + people + ", rating1="
				+ rating1 + ", rating2=" + rating2 + ", rating3=" + rating3 + "]";
	}





	@Override
	public int compareTo(taobao o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
