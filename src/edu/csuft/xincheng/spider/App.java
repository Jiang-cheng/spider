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
				
				f.id=Integer.parseInt(e.select(".pic em").text());
				f.title=e.select(".title").first().text();
				f.info=e.select(".info").text();
				f.rating=Double.parseDouble(e.select(".rating_num").text());
				f.num=Integer.parseInt(e.select(".star span").last().text().substring(0,e.select(".star span").last().text().length()-3));
				f.quote=e.select(".inq").text();
				f.poster=e.select(".pic img").first().attr("src");
				list.add(f);	
				System.out.println(f);
			}
			
        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

private static Double valueof(String rating) {
	// TODO Auto-generated method stub
	return null;
}
}
