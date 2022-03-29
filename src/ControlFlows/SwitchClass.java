package ControlFlows;

public class SwitchClass {

	public static void main(String[] args) {
		
	    String string="";
		int model = 4;

	    //Switch statement  
	    switch(model){
	    //case statements within the switch block  
	    case 1: string = "nokia";  
	    break;    
	    case 2: string = "samsung";  
	    break;    
	    case 3: string="redmi";  
	    break;    
	    case 4: string = "moto";  
	    break;    
	    case 5: string = "realme";  
	    break;  
	    case 6: string  = "iphone";  
	    break;    
	    case 7: string  = "infonix";  
	    break;    
	    case 8: string  = "panasonic";  
	    break;    
	    case 9: string  = "sony";  
	    break;    
	    
	    
	default:System.out.println("Invalid Month!");    
	    }    
	    //Printing month of the given number  
	System.out.println(string );  
	}

}
