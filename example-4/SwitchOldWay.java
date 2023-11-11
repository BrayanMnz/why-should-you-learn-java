void main(){

	// Calling the function with the old SWITCH 
	System.out.println(switchOldWay("NORTH"));

	
	// Calling the function with the new SWITCH
	System.out.println(switchNewWay("NORTH"));
}


double switchOldWay(String point){

double value = 0; 

switch(point){

	case "NORTH":
		value = 12.12;
		break;
	case "SOUTH": 
		value = 14.14; 
		break;
	case "EAST":
		value = 16.16;
		break;
	case "WEST":
		value = 18.18;
		break;
	
	default:
		value = 0.0;
}

return value; 
}




double switchNewWay(String point){

double value = switch (point) {
    case "NORTH" -> 12.12;
    case "SOUTH" -> 14.14;
    case "EAST" -> 16.16;
    case "WEST" -> 18.18;
    default -> 0.0;    
};

return value; 
}
