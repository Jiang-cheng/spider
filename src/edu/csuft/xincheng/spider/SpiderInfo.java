package edu.csuft.xincheng.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * ��ϸ��Ϣ
 * @author �ĳ�
 *
 */
     public class SpiderInfo implements Runnable {
    	 /**
    		 * ҳ���·����URL��
    		 */
    	    String url;
    	    
    	    /**
    	        * �洢ץȡ������
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
		 //���ִ�и�������̵߳�����
		String name=Thread.currentThread().getName();
		/*System.out.println(name+"�̣߳�����"+url);*/
		
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
