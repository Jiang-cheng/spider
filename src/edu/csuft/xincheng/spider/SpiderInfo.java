package edu.csuft.xincheng.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * 详细信息
 * @author 心成
 *
 */
     public class SpiderInfo implements Runnable {
    	 /**
    		 * 页面的路径（URL）
    		 */
    	    String url;
    	    
    	    /**
    	        * 存储抓取的数据
    	     */
    	    ArrayList<Information> list;
    	    
    	    

	public SpiderInfo(String url, ArrayList<Information> list) {
				super();
				this.url = url;
				this.list = list;
			}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		 //获得执行该任务的线程的名称
		String name=Thread.currentThread().getName();
		/*System.out.println(name+"线程，处理"+url);*/
		
		try {
			Document doc=Jsoup.connect(url).get();
	
			System.out.println(doc);
			/*if(!doc.select(".tb-deliverAdd").text().equals(null))
			{
				System.out.println(doc.select(".tb-deliverAdd").text());
			}
			if(!doc.select("#J-From").text().equals(null))
			{
				System.out.println(doc.select("#J-From").text());
			}*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
