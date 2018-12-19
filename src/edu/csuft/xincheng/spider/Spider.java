package edu.csuft.xincheng.spider;
/**
 * 抓取页面中影片信息的爬虫（任务）
 * @author xincheng
 *
 */

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Spider implements Runnable {
	/**
	 * 页面的路径（URL）
	 */
    String url;
    
    /**
        * 存储抓取的数据
     */
    ArrayList<Film> list;
    
    /**
         * 创建爬虫
     * @param url  页面的路径
     * @param list  存储的列表
     */ 
    
	public Spider(String url, ArrayList<Film> list) {
		super();
		this.url = url;
		this.list = list;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//获得执行该任务的线程的名称
		String name=Thread.currentThread().getName();
		System.out.println(name+"线程，处理"+url);
		
		//JSOUP
		try {
	    Document doc=Jsoup.connect(url).get();
	    //从文档(树)中查找节点
	    Elements es=doc.select(".grid_view .item");
	    
	    //遍历元素列表
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
//			System.out.println(name+":"+f);
		}
	    System.out.println(name+"线程，完成"+url);
	    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
