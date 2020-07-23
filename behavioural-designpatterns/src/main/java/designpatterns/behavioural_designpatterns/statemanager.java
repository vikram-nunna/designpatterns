package designpatterns.behavioural_designpatterns;


public class statemanager {

	private state st;

	statemanager()
	{
		st=null;
	}
	public void setState(state state){
	    this.st = state;		
	 }

	 public state getState(){
	    return st;
	 }
}
