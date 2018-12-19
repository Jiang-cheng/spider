package edu.csuft.xincheng.spider;
/**
 * ץȡҳ����ӰƬ��Ϣ�����棨����
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
	 * ҳ���·����URL��
	 */
    String url;
    
    /**
        * �洢ץȡ������
     */
    ArrayList<Film> list;
    
    /**
         * ��������
     * @param url  ҳ���·��
     * @param list  �洢���б�
     */ 
    
	public Spider(String url, ArrayList<Film> list) {
		super();
		this.url = url;
		this.list = list;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//���ִ�и�������̵߳�����
		String name=Thread.currentThread().getName();
		System.out.println(name+"�̣߳�����"+url);
		
		//JSOUP
		try {
	    Document doc=Jsoup.connect(url).get();
	    //���ĵ�(��)�в��ҽڵ�
	    Elements es=doc.select(".grid_view .item");
	    
	    //����Ԫ���б�
	    for(Element e:es)
		{
			Film f=new Film();
			//ÿһ��ӰƬ
			
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
	    System.out.println(name+"�̣߳����"+url);
	    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
