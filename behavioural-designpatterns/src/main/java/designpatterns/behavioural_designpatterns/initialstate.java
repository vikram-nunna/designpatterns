package designpatterns.behavioural_designpatterns;



public class initialstate implements state {
	public void action(statemanager manage)
	{
		System.out.print("Initial state is instantiated");
		manage.setState(this);
	}
	public String toString(){
	    return (" in the Initial State");
	 }
}
