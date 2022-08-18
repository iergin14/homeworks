package chapter2;

public class Hello {
		private String world = "People";
		public String sayHello(String who) {
			String sentence;
			if (who != "")
	
				sentence = "Hello " + who + " :)";
				else
					sentence = "Hello " + world + " :)";
				
				return sentence;
		
		}	

}
