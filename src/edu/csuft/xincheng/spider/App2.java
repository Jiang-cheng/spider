package edu.csuft.xincheng.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * exercise
 * @author xincheng
 *
 */

public class App2 {
	public static void main(String[] args) {
		
		String url="http://re.taobao.com/search_ou?"
				+ "spm=a231k.8165028.0782702702.205.411d"
				+ "2e63mul3rB&prepvid=300_11."
				+ "1.226.95_22556_1545416010837"
				+ "&extra=&refpid=mm_26632323_13476"
				+ "194_53296945&keyword=%E7%A7%8B%E5%86"
				+ "%AC%E5%A4%96%E5%A5%97%E5%A5%B3&page=2";
		try {
			
			Document doc=Jsoup.connect(url).get();
			System.out.println(doc);
			for(int i=0;i<=20;i++)
			{
			Element e=doc.select(".view .item").get(i);
			
			String t=e.select(".shopNick").text();
			String n=e.select(".title").text();
			String p=e.select(".pricedetail strong").text();
			String pay=e.select(".payNum").text();
			
//			String  rate1=e.select(".dsr-info-num").text();
			String rate1=e.select(".dsr-info-list b").get(0).text();
			String rate2=e.select(".dsr-info-list b").get(1).text();
			String rate3=e.select(".dsr-info-list b").get(2).text();
			String a=e.select("a").first().attr("href");
		String  img=e.select(".imgLink img").attr("data-ks-lazyload");
		String b=e.select(".postalicon").text();
		if(b.equals("°üÓÊ"))
		    System.out.println(b);
		else System.out.println("²»°üÓÊ");
			/*for(int i=0;i<=2;i++)
			{
				System.out.println(e.select(".dsr-info-list  b").get(i));
			}*/
			}
			/*for(int i=1;i<=30;i++)
			{
	    	Element e=doc.select(".f-list .f-list-item").get(i);
	    	

			f.name=e.select(".area span").text();
    	    
    	    f.area=e.select(".area a").first().text();
    	    
    	    String p=e.select(".num").text();
    	    f.price=Integer.parseInt(p);
    	    
    	    f.layout=e.select(".size").text();

    	    f.describe=e.select(".js-title").text();
    	    
    		System.out.println(f.toString());
			}
			*/
			
			
			/*for(int i=1;i<=10;i++)
			{
			Element e=doc.select(".ranking li").get(i);
			
    		String id=e.select("span").get(0).text();
    		int rank=Integer.parseInt(id);
 
    		

    		
    		
    		String area=e.select("span").get(2).text();
    		
    		String info=e.select("span a").get(1).attr("href");
    		String Chinese_name=e.select("span a").get(1).text();
    			
    		
    		String Other_name=e.select("h1").text();
			System.out.println(Other_name);
			}
		*/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
