package designpatterns.creational_designpattern;


public class builderdp {
	public static void main(String args[])
	{
		feautures feature=new builderfactory().setfront_cam(16).setback_cam(32).setbt(2000).setst(128).setOs("Android").setProcessor("Snapdragon 845").getall();
		System.out.println(feature);
		System.out.println("Screen_Size Required: "+feature.screen_size);
		System.out.println("bt Required in mAh: "+feature.bt);
		System.out.println("Front camera Required MP: "+feature.front_cam);
		System.out.println("Rear camera Required MP: "+feature.back_cam);
		System.out.println("Required OS: "+feature.os);
		System.out.println("Processor Required: "+feature.processor);
		System.out.println("st Required in GB: "+feature.st);
	}

}
