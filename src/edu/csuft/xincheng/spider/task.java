package edu.csuft.xincheng.spider;


/**
 * 定义一个可以交给线程执行的任务
 * @author xincheng
 *
 */

public class task implements Runnable {

	//任务的编号
	int n;
	
	
	
	public task(int n) {
		super();
		this.n = n;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread .currentThread().getName();
		System.out.println(name+"开始:"+n);
		
		//延时
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+"结束:"+n);
		
	}
	
	

}
