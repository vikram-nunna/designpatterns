package designpatterns.creational_designpattern;



public class builderfactory {
	public String wt;
	public int screen_size;
	public int  front_cam,back_cam;
	public String os;
	int bt;
	int st;
	String processor;
		public builderfactory setwt(String wt) {
		this.wt = wt;
		return(this);
	}
	public builderfactory setScreen_size(int screen_size) {
		this.screen_size = screen_size;
		return(this);
	}
	public builderfactory setfront_cam(int front_cam) {
		this.front_cam = front_cam;
		return(this);
	}
	public builderfactory setback_cam(int back_cam) {
		this.back_cam = back_cam;
		return(this);
	}
	public builderfactory setOs(String os) {
		this.os = os;
		return(this);
	}
	public builderfactory setbt(int bt) {
		this.bt = bt;
		return(this);
	}
	
	public builderfactory setst(int st) {
		this.st = st;
		return(this);
	}
		public builderfactory setProcessor(String processor) {
		this.processor = processor;
		return(this);
	}
	public feautures getall()
	{
		return  new feautures(wt, screen_size,front_cam,back_cam,os,bt,st,processor);
		
	}

}
