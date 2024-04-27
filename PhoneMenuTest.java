import java.util.Scanner;
   public class PhoneMenuTest {

   public static void main(String... arges) {

	String prompt = """
	Welcome to your Nokia phone
	Your Nokia menu map

	*List of menu function
	1. -> Phone Book
	2. -> Message 
	3. -> Chat	
	4. -> Call Register
	5. -> Tones 
	6. -> Settings
	7. -> Call divert
	8. -> Games 
	9. -> Calculator
	10. -> Reminders
	11. -> Clock
	12. -> Profiles
	13. -> SIM Services
	""";

	System.out.println(prompt);
	Scanner keyz = new Scanner(System.in);
	int reply = keyz.nextInt();

      switch(reply) {

	 case 1:{
		System.out.println("""
		************************
		* WELCOME TO PHONEBOOK *
		************************
	select option or press # to return back
	1. -> Search
	2. -> Service Nos.
	3. -> Add name
	4. -> Erase
	5. -> Edit
	6. -> Assign tone
	7. -> Send b'card
	8. -> options
	9. -> Speed dials
	10. -> Voice tags 
	""");
	
	Scanner key = new Scanner(System.in);	
	int response = key.nextInt();
	switch(response) {
	
	   case 1 -> {System.out.println("Enter search details ");} 

	   case 2 -> {System.out.println("Enter Service Nos.");}

	   case 3 -> {System.out.println("Add name");}

	   case 4-> {System.out.println("Erase input");}

	   case 5-> {System.out.println("Edit input");}
	
	   case 6-> {System.out.println("Assign tone");} 

	   case 7-> {System.out.println("send b'card");}

	   case 8-> {System.out.println("""
			******************
			* SELECT OPTIONS *
			******************
			1. -> Type of view
			2. -> Memory status
			""");
			Scanner range = new Scanner(System.in);	
			int details = range.nextInt();

			switch(details) {
				case 1-> {System.out.println("Views");}
			         case 2-> {System.out.println("Current Memory Status");}
						
			    default -> {System.out.println("Invalid Input");} 
				         }
		      }	
		      
			     

	   case 9-> {System.out.println("speed dials");}

	   case 10-> {System.out.println("voice tags");}
	     
	    default -> {System.out.println("Syntex Error");}
		            }break;
			
			}   
	



	 case 2:{
		  System.out.println("""
		++++++++++++++++++++++
		+ WELCOME TO MESSAGE +
		++++++++++++++++++++++
		select  an option 
		1. -> Write message
		2. -> Inbox
		3. -> Outbox
		4. -> Picture messages
		5. -> Templates
		6. -> Smileys
		7. -> message settings 
		8. -> info service
		9. -> Voice mailbox number
		10. Service command editor 
		""");

		Scanner keyz2 = new Scanner(System.in);	
	        int reply2 = keyz2.nextInt();
	        switch(reply2) {
			 case 1 -> {System.out.println("Write Messages");} 

	   		 case 2 -> {System.out.println("Inbox.");}

	  		 case 3 -> {System.out.println("Outbox");}

	  		 case 4-> {System.out.println("Picture Messages");}

	  		 case 5-> {System.out.println("Templates");}
	
	  		 case 6-> {System.out.println("Smiley");} 

	  		 case 7-> {System.out.println("""
			       *******************************
			       * WELCOME TO MESSAGE SETTINGS *
			       *******************************
				1. -> Set 1
				2. -> Commons 
			     	  """);
				Scanner key2 = new Scanner(System.in);	
				int response2 = key2.nextInt();
				switch(response2) {
					case 1-> {System.out.println("""
						    :::::::::
						    : SET 1 :
						    :::::::::

					     1.Message  Centre Number
					     2.Message Sent As
					     1.Message Validity
						""");

						Scanner range2 = new Scanner(System.in);	
			  			int details2 = range2.nextInt();
						switch(details2) {
						
								  case 1 -> {System.out.println("08033333333");}
						
								  case 2 -> {System.out.println("message details");}
											       
								   case 3 -> {System.out.println("Messages are valid 40days before Erasure");}
								   default -> {System.out.println("Invalid Input");} 
									}
							}
										        

					

						 case 2-> {System.out.println("""
								**********
								*COMMONS *
								**********
								select option or press # to return back
								1.Delivery Report
								2.Reply Via Same Centre
								3.Character Support
								""");
								Scanner ranger = new Scanner(System.in);	
			  			      		 int input = ranger.nextInt();
								switch(input) {
									   case 1 -> {System.out.println("Reports");}
									   case 2 -> {System.out.println("Replies");}
									   case 3 -> {System.out.println("Character support");}
									    default -> {System.out.println("Invalid Input");} 
								               }
			   		          	    }
						
							}
					}
					
	   		case 8 -> {System.out.println("Info Service");}
			case 9 -> {System.out.println("Voice Mailbox Number");}
			case 10 -> {System.out.println("Service Command Editor");}
			 default -> {System.out.println("Syntex Error");}
				
			
				    }break;
				
				}

	
	               
	 case 3:{System.out.println("Chat");break;}
	default:{System.out.println("Syntex Error");break;} 
 

	case 4:{
		  System.out.println("""
		*****************
		* CALL REGISTER *
		*****************
		select  an option 
		1. -> Missed Calls
		2. -> Received Calls
		3. -> Dailled Numbers
		4. -> Erase Recent Call Lists
		5. -> Show Call Duration
		6. -> Show call Costs
		7. -> Call Cost Settings
		8. -> Prepaid Credit
			""");

		Scanner keyz3 = new Scanner(System.in);	
	        int reply3 = keyz3.nextInt();
	        switch(reply3) {
			case 1 -> {System.out.println("Missed Calls");} 

	   		 case 2 -> {System.out.println("Received Calls");}

	  		 case 3 -> {System.out.println(" Dailled Numbers");}

	  		 case 4-> {System.out.println("Erase Recent Call Lists");}

	  		 case 5-> {System.out.println("""
					::::::::::::::::::::::
					: SHOW CALL DURATION :
					::::::::::::::::::::::
				1. Last Call Duration
				2. All Calls' Duration 
				3. Received Calls' Duration
				4. Dialled Calls' Duration 
				5. Clear Timers
					""");
				
				Scanner key3 = new Scanner(System.in);	
	       		 	int response3= key3.nextInt();

	        		switch(response3) {
					case 1 -> {System.out.println(" 1 hour 30mins 45sec");}
					case 2 -> {System.out.println(" 30mins 45sec");}
					case 3 -> {System.out.println(" 45mins 30sec");}
					case 4 -> {System.out.println(" 15mins 30sec");}
					case 5 -> {System.out.println("confirmation to clear Timers");}

					 default -> {System.out.println("Invalid Input");}
						  }
				     }			
			
			 case 6 -> {System.out.println("""
				      :::::::::::::::::::
				      : SHOW CALL COSTS :
				      :::::::::::::::::::
				1.Last Call Costs
				2.All Calls' Cost
	`			3.Clear Counters
					""");

				Scanner range3 = new Scanner(System.in);	
	       		 	int detail3 =range3.nextInt();

				switch(detail3) {

					   case 1 -> {System.out.println(" Costs");}
					   case 2 -> {System.out.println(" Total Cost");}
					   case 3 -> {System.out.println(" Confirmation To Clear Counters");}
		
					    default -> {System.out.println("Invalid Input");}	
						 }

				      }
					

			case 7 -> {System.out.println("""
				     ::::::::::::::::::::::
				     : CALL COST SETTINGS :
				     ::::::::::::::::::::::
				1.Call Cost Limit
				2.Show Costs In
					"""); 

				Scanner ranger3 = new Scanner(System.in);	
	       		 	int input3 =ranger3.nextInt();

				switch(input3) {
					
				 case 1 -> {System.out.println("Cost Limit");}
				 case 2 -> {System.out.println("Costs In");}
				
				 default -> {System.out.println("Invalid Input");}
						}

				  }
				
			case 8 -> {System.out.print("Prepaid Credit");}

			 default -> {System.out.println("Syntex Error");}	
			
		  	}break;

		 }


	case 5:{
		 System.out.println("""
		*********
		* TONES *
		*********
		select  an option 
		1. -> Ringing Tone
		2. -> Ringing Volume
		3. -> Incoming Call Alert
		4. -> Composer
		5. -> Message Alert Tone
		6. -> Keypad Tone
		7. -> Warning And Game Tone
		8. -> Vibrating Alert
		9. -> Screen Saver
			""");

		Scanner keyz4 = new Scanner(System.in);	
	        int reply4 = keyz4.nextInt();
		switch(reply4) {
			case 1 -> {System.out.println("Bold tone");}

			case 2 -> {System.out.println(" Level 5");}

			case 3 -> {System.out.println(" Destiny tone");}

			case 4 -> {System.out.println("Default composer");}

			case 5 -> {System.out.println("Sample tone");} 

			case 6 -> {System.out.println("Beep tone");} 

	   		 case 7 -> {System.out.println("Bell & Super Mirro");}

	  		 case 8 -> {System.out.println("Vibrate");}

	  		 case 9-> {System.out.println("ON");}

			default -> {System.out.println("Syntex Error");}
				}break;
		
			}


	
	case 6:{
		 System.out.println("""
		************
		* SETTINGS *
		************
		select  an option 
		1. -> Call Settings
		2. -> Phone Settings
		3. -> Security Settings
		4. -> Restore Factory Setings
			""");

		Scanner key4 = new Scanner(System.in);	
	        int response4 = key4.nextInt();
		switch(response4) {
		      case 1 -> {System.out.println("""
				#################		
				# CALL-SETTINGS #
				#################
			1. Automatic Redial
			2. Speed Dailling 
			3. Call Waiting Options
			4. Own Number Sending
			5. Phone Line In Use 
			6. Automatic Answer
				""");

		Scanner range4 = new Scanner(System.in);	
	        int details4 = range4.nextInt();
		switch(details4) {
			case 1 -> {System.out.println("Automatic Redial");}
			case 2 -> {System.out.println(" Speed Dailling ");}
			case 3 -> {System.out.println("  Call Waiting Options");}
			case 4 -> {System.out.println(" Own Number Sending");}
			case 5 -> {System.out.println("Phone Line In Use ");}
			case 6 -> {System.out.println("Automatic Answer");}

			 default -> {System.out.println("Invalid Input");}
				  }
				}		
			
		    case 2 -> {System.out.println("""
				##################
				# PHONE SETTINGS #
				##################
			1. Language
			2. Cell Info Display
			3. Welcome Note
			4. Network Selection
			5. Lights
			6. Confirm SIM Service Actions
				""");

		Scanner ranger4 = new Scanner(System.in);	
	        int input4 = ranger4.nextInt();
		switch(input4) {
			   case 1 -> {System.out.println("Select  Language");}
			   case 2 -> {System.out.println("Cell Phone Info");}
			   case 3 -> {System.out.println("Welcome Note");}
			   case 4 -> {System.out.println("Network Selection");}
			   case 5 -> {System.out.println("Phone Lights ");}
			   case 6 -> {System.out.println("SIM Service Actions");}

			   default -> {System.out.println("Invalid Input");}
			       }
			  }

		    case 3 -> {System.out.println("""
				#####################
				# SECURITY SETTINGS #
				#####################
			1. PIN Code Request
			2. Call Barring Service
			3. Fixed Dialling
			4. Closed User Group
			5. Phone Security
			6. Changed Access Codes
				""");

			Scanner keyz5 = new Scanner(System.in);	
	        int reply5 = keyz5.nextInt();
		switch(reply5) {
			   case 1 -> {System.out.println("PIN Code Request");}
			   case 2 -> {System.out.println("Call Barring Service");}
			   case 3 -> {System.out.println("Fixed Dialling");}
			   case 4 -> {System.out.println("Closed User Group");}
			   case 5 -> {System.out.println(" Phone Security ");}
			   case 6 -> {System.out.println(" Changed Access Codes");}

			   default -> {System.out.println("Invalid Input");}
				}
			     }

		   case 4 -> {System.out.println("Restore Factory Settings");}

		     default -> {System.out.println("Syntex Error");}

		  }break;
	   }


	case 7:{System.out.println("Call Divert");break;}
	
	
	case 8:{System.out.println("Games");break;}
	  
	case 9:{System.out.println("Calculator");break;}
 	
	case 10:{System.out.println("Reminders");break;}
	  
		
	case 11:{System.out.println("""
		:::::::::::
		:: CLOCK ::
		:::::::::::
	1. Alarm Clock
	2. Clock Settings
	3. Date Setting
	4. Stopwatch
	5. Counterdown Timer
	6. Auto Update of Date And Time
		""");

	Scanner keyz7 = new Scanner(System.in);	
	int reply7 = keyz7.nextInt();
	switch(reply7) {
		case 1 -> {System.out.println(" Alarm Clock");}
		case 2 -> {System.out.println("Set Clock");}
		case 3 -> {System.out.println("Set Date");}
		case 4 -> {System.out.println("Set Stopwatch");}
		case 5 -> {System.out.println("Counterdown Timer");}
		case 6 -> {System.out.println("Auto Update of Date And Time");}

			 default -> {System.out.println("Invalid Input");}

	            }break;

               }
	   

	case 12:{System.out.println("Profiles");break;}

	case 13:{System.out.println("SIM Services");break;}
	  
	  

	    }




       }






 }

