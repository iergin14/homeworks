package chapter13;

enum BookType {

	FICTION,
    NON_FICTION,
    SCIENTIFIC,
    ACTION,
    HORROR,
    CLASSICS;
		    
    private String description;
  
	   
   public void setDescription(String description){
	    this.description= description;
   }
	
   public String getDescription(){
	    return description;
   }
		    
	
}
