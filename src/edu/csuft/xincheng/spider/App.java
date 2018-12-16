package edu.csuft.xincheng.spider;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *@��������
 * @author xincheng
 * @author other
 */
public class App {

//alt+/
	public static void main(String[] args)  {
	
		
		//Ŀ�� URL
		String url="https://movie.douban.com/top250";
		//ʹ��JSOUPץȡ�ĵ�
		try {
			Document doc=Jsoup.connect(url).get();
			
			Elements es=doc.select(".grid_view .item");
			System.out.println(es.size());
			
			for(Element e:es)
			{
				//ÿһ��ӰƬ
				Element t=e.select(".title").first();
				String x=e.select(".star span").last().text();
				System.out.println(t.text()+","+x);
			}
			
			/*String title=doc.title();
		    String html=doc.html();
			String data=doc.data();
			
		    System.out.println(title);
			System.out.println(data);*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
