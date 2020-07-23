package designpatterns.behavioural_designpatterns;


public class endstate implements state {
	
	public void action(statemanager manage) {
	      System.out.print("End state to be Destroyed");
	      manage.setState(this);	
	   }

	   public String toString(){
	      return " in the End State";
	   }

}
