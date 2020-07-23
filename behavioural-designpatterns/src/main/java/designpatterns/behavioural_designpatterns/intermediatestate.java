package designpatterns.behavioural_designpatterns;



public class intermediatestate implements state{
	public void action(statemanager manage) {
		
	      System.out.print("intermediate state is Confirmed");
	      manage.setState(this);	
	   }

	   public String toString(){
		   
	      return " in the intermediate state";
	   }

}
