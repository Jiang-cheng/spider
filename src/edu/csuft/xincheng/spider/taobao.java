package edu.csuft.xincheng.spider;
/**
  * �Ա�Ůװ
 * @author Administrator
 *
 */
public class taobao implements Comparable<taobao>{
	
	/**
	 * �̵�
	 */
	String shop;
	
	/**
	 * ��Ʒ
	 */
	String goods;
	
	
	/**
	 * �۸�
	 */
	double price;
	
	/**
	 * ��������
	 */
	int people;
	
	/**
	 * ����1
	 */
	double rating1;
	
	/**
	 * ����2
	 */
	double rating2;
	
	/**
	 * ����3
	 */
	double rating3;
	
	/**
	 * ͼƬ
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
