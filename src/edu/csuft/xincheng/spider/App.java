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
				
				String id=e.select(".pic em").text();
				String t=e.select(".title").first().text();
				String info=e.select(".info").text();
				String rating=e.select(".rating_num").text();
				String num=e.select(".star span").last().text();
				String quote=e.select(".inq").text();
				Element img=e.select(".pic img").first();
				
				f.id=Integer.parseInt(id);
				f.title=t;
				f.info=info;
				f.rating=Double.parseDouble(rating);
				f.num=Integer.parseInt(num.substring(0,num.length()-3));
				f.quote=quote;
				f.poster=img.attr("src");
				list.add(f);	
				 
				 System.out.println("Id:"+f.id+"\n"+"Title:"+f.title+"\n"+"Information:"+f.info+"\n"
						 +"Rate:"+f.rating+"\n"+"People:"+f.num+"\n"+"Quote:"+f.quote+"\n"+
						 "Image:"+f.poster+"\n");
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
