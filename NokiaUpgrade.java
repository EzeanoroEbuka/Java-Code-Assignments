import java.util.Scanner;
public class NokiaUpgrade {

  static Scanner scan = new Scanner(System.in);
      public static void menu() {
 	
	String prompt = """
	Welcome to your Nokia phone
	Your Nokia menu map

	*List of menu function
	1. -> PhoneBook
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
	0. -> Back
	""";
	System.out.println(prompt);
	int menuInput = scan.nextInt();
	switch(menuInput) {
	case 1: phoneBook();
	case 2: message();
	//case 3: chat();
	//case 4: callRegister();
	//case 5: tones();
	//case 6: settings();
	//case 7: callDivert();
	//case 8: games();
	//case 9: calculator() ;
	//case 10: reminders();
	//case 11: clock();
	//case 12: profiles();
	//case 13: simService();
	default:  menu();
	case 0: menu();				         
      }
  }
public static void phoneBook() {
	System.out.println("""
		************************
		* WELCOME TO PHONEBOOK *
		************************
	select option or press [0] to return back
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
	0. -> Back 
	""");
	
	int phoneBookInput = scan.nextInt();
	switch(phoneBookInput) {
	case 1: search();
	case 2: serviceNos();
	case 3: addName();
	case 4: erase();
	case 5: edit();
	case 6: assignTone();
	case 7: sendBCard();
	case 8: option();
	case 9: speedDails();
	case 10: voiceTags();
	default:  phoneBook();
	case 0: menu();
	
	}
   }
public static void search() {
	System.out.println("""
		:::::::::::::
		::  SEARCH ::
		:::::::::::::
	Search is Empty!!!!
	0. -> Back
		""");
	
	int searchInput = scan.nextInt();
	switch(searchInput) {
	default: search();
	case 0: phoneBook();
	}
   }
public static void serviceNos() {
	System.out.println("""
		::::::::::::::::::
		:: SERVICE NOS. ::
		::::::::::::::::::
	Service Nos. is Empty!!!!
	0. -> Back
		""");

	int serviceInput = scan.nextInt();
	switch(serviceInput) {
	default: serviceNos();
	case 0: phoneBook();
	}
}
public static void addName() {
	System.out.println("""
		::::::::::::::
		:: ADD NAME ::
		::::::::::::::
	Add Name is Empty!!!!
	0. -> Back
		""");
	
	int nameInput = scan.nextInt();
	switch(nameInput) {
	default: addName();
	case 0: phoneBook();
	} 
  }
public static void erase() {
	System.out.println("""
		:::::::::::
		:: ERASE ::
		:::::::::::
	Erase is Empty!!!!
	0. -> Back
		""");
	
	int eraseInput = scan.nextInt();
	switch(eraseInput) {
	default: erase();
	case 0: phoneBook();
	}
}
public static void edit() {
	System.out.println("""
		::::::::::
		:: EDIT	::
		::::::::::
	Edit is Empty!!!!
	0. -> Back
		""");
	
	int edithInput = scan.nextInt();
	switch(edithInput) {
	default: edit();
	case 0: phoneBook();
	}
}
public static void assignTone() {
	System.out.println("""
		:::::::::::::::::
		:: ASSIGN TONE ::
		:::::::::::::::::
	Assign Tone is Empty!!!!
	0. -> Back
		""");
	
	int toneInput = scan.nextInt();
	switch(toneInput) {
	default: assignTone();
	case 0: phoneBook();
	}
}
public static void sendBCard() {
	System.out.println("""
		::::::::::::::::::
		:: SEND B' CARD ::
		::::::::::::::::::
	Send b' card is Empty!!!!
	0. -> Back
		""");
	
	int bcardInput = scan.nextInt();
	switch(bcardInput) {
	default: sendBCard();
	case 0: phoneBook();
	}
}
public static void option() {
	System.out.println("""
		::::::::::::::::::::
		:: SELECT OPTIONS ::
		::::::::::::::::::::
		1. -> Type of view
		2. -> Memory status
		0. -> Back
		""");
	
	int optionInput = scan.nextInt();
	switch(optionInput) {
	case 1: typeOfViews();
	case 2: memoryStatus();
	default: option();
	case 0: phoneBook();
	}
}
public static void typeOfViews() {
	System.out.println("""
		::::::::::::::::::: 
		:: TYPE OF VIEWS ::
		::::::::::::::::::::
	Erase is Empty!!!!
	0. -> Back
		""");
	
	int viewsInput = scan.nextInt();
	switch(viewsInput) {
	default: typeOfViews();
	case 0: option();
	}
}
public static void memoryStatus() {
	System.out.println("""
		:::::::::::::::::::
		:: MEMORY STATUS ::
		:::::::::::::::::::
		Current Memory Status is Empty !!!!
		0. -> Back
		""");
	
	int memoryInput = scan.nextInt();
	switch(memoryInput) {
	default: memoryStatus();
	case 0: option();
	}
}
public static void speedDails() {
	System.out.println("""
		:::::::::::::::::
		:: SPEED DAILS ::
		:::::::::::::::::
	Speed Dailer is Empty!!!!
	0. -> Back
		""");
	
	int speedInput = scan.nextInt();
	switch(speedInput) {
	case 0: phoneBook();
	default: speedDails();
	}
}
public static void voiceTags() {
	System.out.println("""
		::::::::::::::::
		:: VOICE TAGS ::
		::::::::::::::::
	Voice Tags is Empty!!!!
	0. -> Back
		""");
	
	int speedInput = scan.nextInt();
	switch(speedInput) {
	case 0: phoneBook();
	default: voiceTags();
	}
}
public static void message() {
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
		0. Back
		""");
	
	int messageInput = scan.nextInt();
	switch(messageInput) {
	case 1: writeMessage();
	case 2: inbox();
	case 3: outbox();
	case 4: pictureMeassages();
	case 5: template();
	case 6: smiley();
	case 7: messageSetting();
	case 8: infoService();
	case 9: voiceMail();
	case 10: serviceCommand();
	case 0: menu();
	default: message();
	}
}
public static void writeMessage() {
	System.out.println("""
		:::::::::::::::::::
		:: WRITE MESSAGES::
		:::::::::::::::::::
		Write message is Empty !!!!
		0. -> Back
		""");
	
	int writeInput = scan.nextInt();
	switch(writeInput) {
	case 0: message();
	default: writeMessage();
	}
 }
public static void inbox() {
	System.out.println("""
		:::::::::
		::INBOX::
		:::::::::
		Inbox is Empty !!!!
		0. -> Back
		""");
	Scanner scan = new Scanner(System.in);
	int inboxInput = scan.nextInt();
	switch(inboxInput) {
	case 0: message();
	default: inbox();
	}
}
public static void outbox() {
	System.out.println("""
		::::::::::
		::OUTBOX::
		::::::::::
		Outbox is Empty !!!!
		0. -> Back
		""");
	
	int outboxInput = scan.nextInt();
	switch(outboxInput) {
	case 0: message();
	default: outbox();
	}
}
public static void pictureMeassages() {
	System.out.println("""
		::::::::::::::::::::
		::PICTURE MESSAGES::
		::::::::::::::::::::
		Picture Message is Empty !!!!
		0. -> Back
		""");
	
	int picsMessage = scan.nextInt();
	switch(picsMessage) {
	case 0: message();
	default: pictureMeassages();
	}
}
public static void template() {
	System.out.println("""
		::::::::::::::
		:: TEMPLATE ::
		::::::::::::::
		Template is Empty !!!!
		0. -> Back
		""");
	
	int templates = scan.nextInt();
	switch(templates) {
	case 0: message();
	default: template();
	}
}
public static void smiley() {
	System.out.println("""
		:::::::::::::
		:: SMILEYS ::
		:::::::::::::
		Smiley is Empty !!!!
		0. -> Back
		""");
	
	int smileyInput = scan.nextInt();
	switch(smileyInput) {
	case 0: message();
	default: smiley();
	}
}
public static void messageSetting() {
	System.out.println("""
		:::::::::::::::::::::::::::::::::
		:: WELCOME TO MESSAGE SETTINGS ::
		:::::::::::::::::::::::::::::::::
		1. -> Set 1
		2. -> Commons
		0. -> Back
		""");
	
	int messageSet = scan.nextInt();
	switch(messageSet) {
	case 1: setOne();
	case 2: commons();
	case 0: message();
	default: messageSetting();
	}
}
public static void setOne() {
	System.out.println("""
		:::::::::
		::SET 1::
		:::::::::
		1. -> Message Centre Number
		2. -> Message Sent As 
		3. -> Message Validity
		0. -> Back
		""");
	
	int messageSet = scan.nextInt();
	switch(messageSet) {
	case 1: messageCN();
	case 2: sentAs();
	case 3: validity();
	case 0: messageSetting();
	default: setOne();
	}
}
public static void messageCN() {
	System.out.println("""
		:::::::::::::::::::::::::::
		:: MESSAGE CENTRE NUMBER ::
		:::::::::::::::::::::::::::
		+234800000000000.
		0. -> Back
		""");
	
	int Messagenuber = scan.nextInt();
	switch(Messagenuber) {
	case 0: setOne();
	default: messageCN();
	}
}
public static void sentAs() {
	System.out.println("""
		:::::::::::::::::::::
		:: Message SENT AS ::
		:::::::::::::::::::::
		Sent as an Outbox		
		0. -> Back
		""");
	
	int sent = scan.nextInt();
	switch(sent) {
	case 0: setOne();
	default: sentAs();
	}
}
public static void validity() {
	System.out.println("""
		::::::::::::::::::::::
		:: MESSAGE VALIDITY ::
		::::::::::::::::::::::
		Valid messages are Saved !!!!
		0. -> Back
		""");
	
	int valid = scan.nextInt();
	switch(valid) {
	case 0: setOne();
	default: validity();
	}
}
public static void commons() {
	System.out.println("""
		:::::::::::::
		:: COMMONS ::
		:::::::::::::
		1.Delivery Report
		2.Reply Via Same Centre
		3.Character Support
		0. -> Back
		""");
	
	int common = scan.nextInt();
	switch(common) {
	case 1: reports();
	case 2: reply();
	case 3: character();
	case 0: messageSetting();
	default: commons();	
	}
}
public static void reports() {
	System.out.println("""
		:::::::::::::::::::::
		:: DELIVERY REPORT ::
		:::::::::::::::::::::
		No Reports are Saved !!!!
		0. -> Back
		""");
	
	int repo = scan.nextInt();
	switch(repo) {
	case 0: commons();
	default: reports();
	}
}
public static void reply() {
	System.out.println("""
		:::::::::::::::::::::::::::
		:: REPLY VIA SAME CENTRE ::
		:::::::::::::::::::::::::::
		No Replies are Saved !!!!
		0. -> Back
		""");
	
	int response = scan.nextInt();
	switch(response) {
	case 0: commons();
	default: reply();
	}
}
public static void character() {
	System.out.println("""
		:::::::::::::::::::::::
		:: CHARACTER SUPPORT ::
		:::::::::::::::::::::::
		Character Support Missing !!!!
		0. -> Back
		""");
	
	int characters = scan.nextInt();
	switch(characters) {
	case 0: commons();
	default: character();
	}
}
public static void infoService() {
	System.out.println("""
		::::::::::::::::::
		:: INFO SERVICE ::
		::::::::::::::::::
		EMPTY !!!!
		0. -> Back
		""");
	
	int info = scan.nextInt();
	switch(info) {
	case 0: message();
	default:infoService();
	}
}
public static void voiceMail() {
	System.out.println("""
		::::::::::::::::::::::::::				
		:: VOICE MAILBOX NUMBER ::
		::::::::::::::::::::::::::
		Voice Mailbox is Empty !!!!
		0. -> Back
		""");
	
	int voiceInput = scan.nextInt();
	switch(voiceInput) {
	case 0: message();
	default: voiceMail();
	}
}
public static void serviceCommand() {
	System.out.println("""
		::::::::::::::::::::::::::::
		:: SERVICE COMMAND EDITOR ::
		::::::::::::::::::::::::::::
		All Commands has Successfully been Edited and Saved !!!!
		0. -> Back
		""");
	
	int commandInput = scan.nextInt();
	switch(commandInput) {
	case 0: message();
	default: serviceCommand();
	}
}
	
public static void main(String... args) {
  	
	menu();
	

   }


}	









