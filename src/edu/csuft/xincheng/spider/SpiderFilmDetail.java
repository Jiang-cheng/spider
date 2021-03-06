package edu.csuft.xincheng.spider;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;



/**
 * 抓取影片呢的详细信息
 * @author 心成
 *
 */
public class SpiderFilmDetail implements Runnable{

	/**
	 * 影片的
	 */
	String url;
	
	/**
	 * 影片列表
	 */
	List<Film> list;
	
	
	public SpiderFilmDetail(String url, List<Film> list) {
		super();
		this.url = url;
		this.list = list;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
Document d=Jsoup.connect(url).get();
			
			Element e=d.getElementById("content");
			String name=e.selectFirst("h1 span").text();
			String year=e.selectFirst(".year").text();
			String director=e.select("#info span").get(0).selectFirst(".attrs a").text();
			String script=e.select("#info .attrs").get(1).text();
			String actor=e.selectFirst(".actor attrs").text();
			
			
			System.out.printf("%s,%s,%s,%s\n",name,year,director,script);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
