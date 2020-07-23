package designpatterns.behavioural_designpatterns;


public class statedp {

	public static void main(String [] args)
	{
		statemanager manager=new statemanager();	
		
		initialstate is = new initialstate();
		is.action(manager);
		System.out.println(manager.getState().toString());
		
		intermediatestate ms = new intermediatestate();
		ms.action(manager);
		System.out.println(manager.getState().toString());
		
		endstate finalState = new endstate();
		finalState.action(manager);
		System.out.println(manager.getState().toString());
	}
}
