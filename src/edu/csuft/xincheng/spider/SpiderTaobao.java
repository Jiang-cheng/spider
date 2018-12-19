package edu.csuft.xincheng.spider;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class SpiderTaobao implements Runnable{
	
	/**
	 * 页面的路径（URL）
	 */
    String url;
    
    /**
        * 存储抓取的数据
     */
    ArrayList<taobao> list;
    
    /**
         * 创建爬虫
     * @param url  页面的路径
     * @param list  存储的列表
     */ 

	public SpiderTaobao(String url, ArrayList<taobao> list) {
		super();
		this.url = url;
		this.list = list;
	}



	@Override
	public void run() {
		try {
			Document doc=Jsoup.connect(url).get();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
