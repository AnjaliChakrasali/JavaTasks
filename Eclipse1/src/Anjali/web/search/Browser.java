package Anjali.web.search;

public class Browser {
		public Internet internet=new Internet();
		 public void retrieve() {
			 System.out.println("invoking retrieve in browser");
			 
			 if(internet!=null)
			 {
				this.internet.accessibility();
			 }
		 }
		 public void scripting() {
			 System.out.println("invoking scripting in browser ");
			 if(internet!=null)
			 {
				 this.internet.security();
			 }
		 }

}
