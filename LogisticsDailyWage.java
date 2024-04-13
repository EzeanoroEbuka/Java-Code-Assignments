public class LogisticsDailyWage { 
 public static int ReturnWages(int input) {
   
   int basePay = 5000;	
   int result = 0;

   int rate1 = 50;
   int rate2 = 59;
   int rate3 = 60;
   int rate4 = 69;
   int rate5 = 70;

	if(input < rate1) {
		 result = (input * 160) + basePay;}
	else{
	if(input >= 50 && input <= 59) {
		 result = (input * 200) + basePay;}

	else{
	if(input >=60 && input <= 69) {
		 result =(input * 250) + basePay;} 

	else{
	if(input >=70 && input <=100) {
		 result = (input * 500) + basePay;}

	else{
	 	result = 0;}
	    }
	  }
	}	

	return result;
   }

}	
	