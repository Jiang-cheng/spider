package edu.csuft.xincheng.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 *@程序的入口
 * @author xincheng
 * @author other
 */
public class App {

//alt+/
	public static void main(String[] args)  {
	
		
		//目标 URL
		String url="https://movie.douban.com/top250";
		//使用JSOUP抓取文档
		try {
			Document doc=Jsoup.connect(url).get();
			
			Elements es=doc.select(".grid_view .item");
			System.out.println(es.size());
			
			//创建一个影片的列表
			ArrayList<Film> list=new ArrayList<>();
			for(Element e:es)
			{
				Film f=new Film();
				//每一部影片
				Element t=e.select(".title").first();
				String x=e.select(".star span").last().text();
				System.out.println(t.text()+","+x);
				
				//f.id
				//f.title
				list.add(f);			
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
