package designpatterns.creational_designpattern;

	public class phonecostfactory {
		public features getData(String phoneName)
		{
			if(phoneName.equalsIgnoreCase("mi"))
			{
				return new mi();
			}
			return null;
			
			
		}
	}

