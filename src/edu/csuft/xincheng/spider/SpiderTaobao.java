package edu.csuft.xincheng.spider;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class SpiderTaobao implements Runnable{
	
	/**
	 * ҳ���·����URL��
	 */
    String url;
    
    /**
        * �洢ץȡ������
     */
    ArrayList<taobao> list;
    
    /**
         * ��������
     * @param url  ҳ���·��
     * @param list  �洢���б�
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
