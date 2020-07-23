package designpatterns.creational_designpattern;

public class feautures {
	public String wt;
	public int screen_size;
	public int  front_cam,back_cam;
	public String os;
	int bt;
	int st;
	String processor;
	
	feautures(String wt,int screen_size,int front_cam,int back_cam,String os,int bt,int st,String processor)
	{
		this.wt=wt;
		this.screen_size=screen_size;
		this.front_cam=front_cam;
		this.back_cam=back_cam;
		this.os=os;
		this.bt=bt;
		this.st=st;
		this.processor=processor;	
	}

}
