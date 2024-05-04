import java.util.Scanner;
public class NokiaUpgrade {
static Scanner scan = new Scanner(System.in);
	public static void main(String... args) {
  	
		menu();
		
	   }
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
	case 3: chat();
	case 4: callRegister();
	case 5: tones();
	case 6: settings();
	case 7: callDivert();
	case 8: games();
	case 9: calculator() ;
	case 10: reminders();
	case 11: clock();
	case 12: profiles();
	case 13: simService();
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
public static void chat() { 
	System.out.println("CHAT");
	System.out.println("0. -> Back");
	 int chatInput = scan.nextInt();
	switch(chatInput) {
	case 0: menu();
	default: chat();
	}
}
public static void callRegister() { 
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
		0. -> Back
			""");
	 int reInput = scan.nextInt();
	switch(reInput) {
	case 1: missedCalls();
	case 2: receivedCalls();
	case 3: dailledNumbers();
	case 4: eraseRecentCallLists();
	case 5: showCallDuration();
	case 6: showCallCost();
	case 7: callCostSetting();
	case 8: prepaidcredit();
	case 0: menu();
	default: callRegister();
	}
}		
public static void missedCalls() {
	System.out.println("Missed Calls");
	System.out.println("0. -> Back");
	 int misInput = scan.nextInt();
	switch(misInput) {
	case 0: callRegister();
	default: missedCalls();
	}

}
public static void receivedCalls(){
	System.out.println("Received Calls");
	System.out.println("0. -> Back");
	 int receiveInput = scan.nextInt();
	switch(receiveInput) {
	case 0: callRegister();
	default: receivedCalls();
	}
}
public static void dailledNumbers() {
	System.out.println("Dailled Numbers");
	System.out.println("0. -> Back");
	 int dailedInput = scan.nextInt();
	switch(dailedInput) {
	case 0: callRegister();
	default: dailledNumbers();
	}
}
public static void eraseRecentCallLists() {
	System.out.println("Erase Recent Call Lists");
	System.out.println("0. -> Back");
	 int eraseInput = scan.nextInt();
	switch(eraseInput) {
	case 0: callRegister();
	default: eraseRecentCallLists();
	}
}
public static void showCallDuration() {
	System.out.println("""
				::::::::::::::::::::::
				: SHOW CALL DURATION :
				::::::::::::::::::::::
				1. Last Call Duration
				2. All Calls' Duration 
				3. Received Calls' Duration
				4. Dialled Calls' Duration 
				5. Clear Timers
				0. Back
					""");
	int showDurationInput = scan.nextInt();
	switch(showDurationInput) {
	case 1: lastCallDuration();
	case 2: allCAllDuration();
	case 3: receivedCallDuration();
	case 4: dailedCallDuration();
	case 5: clearTimer();
	case 0: callRegister();
	default: showCallDuration();
	}
}
public static void lastCallDuration() {
	System.out.println("LAST CALL DURATION");
	System.out.println("0. -> Back");
	 int lastCallInput = scan.nextInt();
	switch(lastCallInput) {
	case 0: showCallDuration();
	default: lastCallDuration();
	}
}
public static void allCAllDuration() {
	System.out.println("ALL CALL DURATION");
	System.out.println("0. -> Back");
	 int allCallInput = scan.nextInt();
	switch(allCallInput) {
	case 0: showCallDuration();
	default: allCAllDuration();
	}
}
public static void receivedCallDuration() {
	System.out.println("RECEIVEED CALL DURATION");
	System.out.println("0. -> Back");
	 int receiveInput = scan.nextInt();
	switch(receiveInput) {
	case 0: showCallDuration();
	default: receivedCallDuration();
	}
}
public static void dailedCallDuration() {
	System.out.println("DAILLED CALL DURATION");
	System.out.println("0. -> Back");
	 int dailedInput = scan.nextInt();
	switch(dailedInput) {
	case 0:showCallDuration();
	default: dailedCallDuration();
	}
}
public static void clearTimer() {
	System.out.println("CLEAR TIMER");
	System.out.println("0. -> Back");
	 int clearTimerInput = scan.nextInt();
	switch(clearTimerInput) {
	case 0: showCallDuration();
	default: clearTimer();
	}
}
public static void showCallCost() {
	System.out.println("""
		:::::::::::::::::::
		: SHOW CALL COSTS :
		:::::::::::::::::::
		1.Last Call Costs
		2.All Calls' Cost
		3.Clear Counters
		0.Back

		""");			
	 int showInput = scan.nextInt();
	switch(showInput) {
	case 1: lastCallCost();
	case 2: allCallCost();
	case 3: clearCounters();
	case 0: callRegister();
	default: showCallCost();
	}
}
public static void lastCallCost() {
	System.out.println("LAST CALL COST");
	System.out.println("0. -> Back");
	 int lastInput = scan.nextInt();
	switch(lastInput) {
	case 0: showCallCost();
	default: lastCallCost();
	}
}
public static void allCallCost() {
	System.out.println("ALL CALL'S COST");
	System.out.println("0. -> Back");
	 int allInput = scan.nextInt();
	switch(allInput) {
	case 0: showCallCost();
	default: allCallCost();
	}
}
public static void  clearCounters() {
	System.out.println("CLEAR COUNTERS");
	System.out.println("0. -> Back");
	 int clearInput = scan.nextInt();
	switch(clearInput) {
	case 0: showCallCost();
	default: clearCounters();
	}
}
public static void callCostSetting() {
	System.out.println("""
			::::::::::::::::::::::
			: CALL COST SETTINGS :
			::::::::::::::::::::::
			1.Call Cost Limit
			2.Show Costs In
			0.Back
			"""); 
	 int callCostInput = scan.nextInt();
	switch(callCostInput) {
	case 1: callCostLimit();
	case 2:	showCostIn();
	case 0: callRegister();
	default: callCostSetting();
	}
}
public static void callCostLimit() {
	System.out.println("Call Cost Limit");
	System.out.println("0. -> Back");
	 int clearInput = scan.nextInt();
	switch(clearInput) {
	case 0:callCostSetting();
	default: callCostLimit();
	}
}
public static void 	showCostIn() {
	System.out.println("Show Costs In");
	System.out.println("0. -> Back");
	 int clearInput = scan.nextInt();
	switch(clearInput) {
	case 0: callCostSetting();
	default: showCostIn();
	}
}
public static void prepaidcredit() {
	System.out.println("PREPAID CREDIT");
	System.out.println("0. -> Back");
	 int preInput = scan.nextInt();
	switch(preInput) {
	case 0: callRegister();
	default:prepaidcredit();
	}
}
public static void tones() {
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
		0. -> Back
			""");
	int toneInput = scan.nextInt();
	switch(toneInput) {
	case 1: ringingTone();
	case 2: ringingVolume();
	case 3: incomingCallAlert();
	case 4: composer();
	case 5: messageAlertTone();
	case 6: keypadTone();
	case 7: warningAndGameTone();
	case 8: vibratingAlert();
	case 9: screenSaver();	
	case 0: menu();
	default:tones();
	}
}		
public static void  ringingTone() {
	System.out.println("Bold tone");
	System.out.println("0. -> Back");
	 int ringToneInput = scan.nextInt();
	switch(ringToneInput) {
	case 0: tones();
	default: ringingTone();
	}
}
public static void  ringingVolume() {
	System.out.println(" Level 5");
	System.out.println("0. -> Back");
	 int ringVolumeInput = scan.nextInt();
	switch(ringVolumeInput) {
	case 0: tones();
	default: ringingVolume();
	}
}
public static void incomingCallAlert() {
	System.out.println("Destiny tone");
	System.out.println("0. -> Back");
	 int incomingInput = scan.nextInt();
	switch(incomingInput) {
	case 0: tones();
	default: incomingCallAlert();
	}
}
public static void  composer() {
	System.out.println("Default composer");
	System.out.println("0. -> Back");
	 int composerInput = scan.nextInt();
	switch(composerInput) {
	case 0: tones();
	default: composer();
	}
}
public static void  messageAlertTone() {
	System.out.println("Sample tone");
	System.out.println("0. -> Back");
	 int messageToneInput = scan.nextInt();
	switch(messageToneInput) {
	case 0: tones();
	default: messageAlertTone();
	}
}
public static void keypadTone() {
	System.out.println("Beep tone");
	System.out.println("0. -> Back");
	 int keypadInput = scan.nextInt();
	switch(keypadInput) {
	case 0: tones();
	default: keypadTone();
	}
}
public static void warningAndGameTone() {
	System.out.println("Bell & Super Mirro");
	System.out.println("0. -> Back");
	 int gameInput = scan.nextInt();
	switch(gameInput) {
	case 0: tones();
	default: warningAndGameTone();
	}
}
public static void vibratingAlert() {
	System.out.println("Vibrate");
	System.out.println("0. -> Back");
	 int alertInput = scan.nextInt();
	switch(alertInput) {
	case 0: tones();
	default: vibratingAlert();
	}
}
public static void screenSaver() {
	System.out.println("ON");
	System.out.println("0. -> Back");
	 int saverInput = scan.nextInt();
	switch(saverInput) {
	case 0: tones();
	default: screenSaver();
	}
}
public static void settings() {
	System.out.println("""
		************
		* SETTINGS *
		************
		select  an option 
		1. -> Call Settings
		2. -> Phone Settings
		3. -> Security Settings
		4. -> Restore Factory Setings
		0. -> Back
			""");
	int settingInput = scan.nextInt();
	switch(settingInput) {
	case 1: callSetting();
	case 2: phoneSetting();
	case 3: securitySetting();
	case 4: restoreFactorySetting();
	case 0: menu();
	default: settings();
	}
}
public static void  callSetting() {
	System.out.println("""
		#################		
		# CALL-SETTINGS #
		#################
	1. Automatic Redial
	2. Speed Dailling 
	3. Call Waiting Options
	4. Own Number Sending
	5. Phone Line In Use 
	6. Automatic Answer
	0. Back
		""");
	 int callSetInput = scan.nextInt();
	switch(callSetInput) {
	case 0: settings();
	case 1: automaticRedial();
	case 2: speedDailling();
	case 3: callWaiting();
	case 4: ownNumberSending();
	case 5: phoneLine();
	case 6: automaticAnswer();
	default: callSetting();
	}
}
public static void automaticRedial() {
	System.out.println("Automatic Redial");
	System.out.println("0. -> Back");
	 int rediaInput = scan.nextInt();
	switch(rediaInput) {
	case 0: callSetting();
	default: automaticRedial();
	}
}
public static void speedDailling() {
	System.out.println(" Speed Dailling ");
	System.out.println("0. -> Back");
	 int speedInput = scan.nextInt();
	switch(speedInput) {
	case 0: callSetting();
	default: speedDailling();
	}
}
public static void callWaiting() {
	System.out.println("Call Waiting Options");
	System.out.println("0. -> Back");
	 int waitInput = scan.nextInt();
	switch(waitInput) {
	case 0: callSetting();
	default: callWaiting();
	}
}
public static void ownNumberSending() {
	System.out.println(" Own Number Sending");
	System.out.println("0. -> Back");
	 int ownInput = scan.nextInt();
	switch(ownInput) {
	case 0: callSetting();
	default: ownNumberSending();
	}
}
public static void phoneLine() {
	System.out.println("Phone Line In Use");
	System.out.println("0. -> Back");
	 int lineInput = scan.nextInt();
	switch(lineInput) {
	case 0: callSetting();
	default: phoneLine();
	}
}
public static void automaticAnswer() {
	System.out.println("Automatic Answer");
	System.out.println("0. -> Back");
	 int answerInput = scan.nextInt();
	switch(answerInput) {
	case 0: callSetting();
	default: automaticAnswer();
	}
}
public static void phoneSetting() {
	System.out.println("""
		##################
		# PHONE SETTINGS #
		##################
		1. Language
		2. Cell Info Display
		3. Welcome Note
		4. Network Selection
		5. Lights
		6. Confirm SIM Service Actions
		0. Back
			""");
	 int phoneSetInput = scan.nextInt();
	switch(phoneSetInput) {
	case 1: language();
	case 2: cellInfoDisplay();
	case 3: welcomeNote();
	case 4: networkSelection();
	case 5: lights();
	case 6: confirmSimserviceAction();
	case 0: settings();
	default: phoneSetting();
	}
}
public static void language() {
	System.out.println("Select  Language");
	System.out.println("0. -> Back");
	 int langInput = scan.nextInt();
	switch(langInput) {
	case 0: phoneSetting();
	default: language();
	}
}
public static void cellInfoDisplay() {
	System.out.println("Cell Phone Info");
	System.out.println("0. -> Back");
	 int displayInput = scan.nextInt();
	switch(displayInput) {
	case 0: phoneSetting();
	default: cellInfoDisplay();
	}
}
public static void welcomeNote() {
	System.out.println("Welcome Note");
	System.out.println("0. -> Back");
	 int noteInput = scan.nextInt();
	switch(noteInput) {
	case 0: phoneSetting();
	default: welcomeNote();
	}
}
public static void networkSelection() {
	System.out.println("Network Selection");
	System.out.println("0. -> Back");
	 int netInput = scan.nextInt();
	switch(netInput) {
	case 0: phoneSetting();
	default: networkSelection();
	}
}
public static void lights() {
	System.out.println("Phone Lights Settings");
	System.out.println("0. -> Back");
	 int lightInput = scan.nextInt();
	switch(lightInput) {
	case 0: phoneSetting();
	default: lights();
	}
}
public static void confirmSimserviceAction() {
	System.out.println("SIM Service Actions");
	System.out.println("0. -> Back");
	 int ssActionInput = scan.nextInt();
	switch(ssActionInput) {
	case 0: phoneSetting();
	default: confirmSimserviceAction();
	}
}
public static void  securitySetting() {
	System.out.println("""
		#####################
		# SECURITY SETTINGS #
		#####################
		1. PIN Code Request
		2. Call Barring Service
		3. Fixed Dialling
		4. Closed User Group
		5. Phone Security
		6. Changed Access Codes
		0. Back
			""");
	 int securityInput = scan.nextInt();
	switch(securityInput) {
	case 1: pinCodeRequest();
	case 2: callBarringService();
	case 3: fixedDialling();
	case 4: closedUserGroup();
	case 5: phoneSecurity();
	case 6: changedaccessCode();	
	case 0: settings();
	default: securitySetting();
	}
}
public static void pinCodeRequest() {
	System.out.println("PIN Code Request");
	System.out.println("0. -> Back");
	 int pinInput = scan.nextInt();
	switch(pinInput) {
	case 0: securitySetting();
	default: pinCodeRequest();
	}
}
public static void callBarringService() {
	System.out.println("Call Barring Service");
	System.out.println("0. -> Back");
	 int barrInput = scan.nextInt();
	switch(barrInput) {
	case 0: securitySetting();
	default: callBarringService();
	}
}
public static void fixedDialling() {
	System.out.println("Fixed Dialling");
	System.out.println("0. -> Back");
	 int fixInput = scan.nextInt();
	switch(fixInput) {
	case 0: securitySetting();
	default: fixedDialling();
	}
}
public static void closedUserGroup() {
	System.out.println("SIM Service Actions");
	System.out.println("0. -> Back");
	 int userInput = scan.nextInt();
	switch(userInput) {
	case 0: securitySetting();
	default: closedUserGroup();
	}
}
public static void  phoneSecurity() {
	System.out.println("Phone Security");
	System.out.println("0. -> Back");
	 int psecureInput = scan.nextInt();
	switch(psecureInput) {
	case 0: securitySetting();
	default:  phoneSecurity();
	}
}
public static void changedaccessCode() {
	System.out.println("Changed Access Codes");
	System.out.println("0. -> Back");
	 int accessCodeInput = scan.nextInt();
	switch(accessCodeInput) {
	case 0: securitySetting();
	default: changedaccessCode();
	}
}
public static void  restoreFactorySetting() {
	System.out.println("Default composer");
	System.out.println("0. -> Back");
	 int restoreInput = scan.nextInt();
	switch(restoreInput) {
	case 0: settings();
	default: restoreFactorySetting();
	}
}
public static void callDivert() {
	System.out.println("Call Divert");
	System.out.println("0. -> Back");
	 int divertInput = scan.nextInt();
	switch(divertInput) {
	case 0: menu();
	default: callDivert();
	}
}
public static void games() {
	System.out.println("Games");
	System.out.println("0. -> Back");
	 int gameInput = scan.nextInt();
	switch(gameInput) {
	case 0: menu();
	default: games();
	}
}
public static void calculator() {
	System.out.println("Calculator");
	System.out.println("0. -> Back");
	 int calInput = scan.nextInt();
	switch(calInput) {
	case 0: menu();
	default: calculator();
	}
}
public static void reminders() {
	System.out.println("Reminders");
	System.out.println("0. -> Back");
	 int remindInput = scan.nextInt();
	switch(remindInput) {
	case 0: menu();
	default: reminders();
	}
}
public static void clock() {
	System.out.println("""
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
	System.out.println("0. -> Back");
	 int clockInput = scan.nextInt();
	switch(clockInput) {
	case 1: alertClock();
	case 2: clockSettings();
	case 3: dateSetting();
	case 4: stopwatch();
	case 5: counterdownTimer();
	case 6: autoUpdateOfDateAndTime();
	case 0: menu();
	default: clock();
	}
}
public static void alertClock() {
	System.out.println("Alarm Clock");
	System.out.println("0. -> Back");
	 int alertInput = scan.nextInt();
	switch(alertInput) {
	case 0: clock();
	default: alertClock();
	}
}
public static void clockSettings() {
	System.out.println("Clock Settings");
	System.out.println("0. -> Back");
	 int clocksetInput = scan.nextInt();
	switch(clocksetInput) {
	case 0: clock();
	default: clockSettings();
	}
}
public static void dateSetting() {
	System.out.println("Date Setting");
	System.out.println("0. -> Back");
	 int datesetInput = scan.nextInt();
	switch(datesetInput) {
	case 0: clock();
	default: dateSetting();
	}
}
public static void stopwatch() {
	System.out.println("Stopwatch");
	System.out.println("0. -> Back");
	 int stopInput = scan.nextInt();
	switch(stopInput) {
	case 0:clock();
	default: stopwatch();
	}
}
public static void counterdownTimer() {
	System.out.println("Counterdown Timer");
	System.out.println("0. -> Back");
	 int timerInput = scan.nextInt();
	switch(timerInput) {
	case 0:clock();
	default: counterdownTimer();
	}
}
public static void autoUpdateOfDateAndTime() {
	System.out.println("Auto Update of Date And Time");
	System.out.println("0. -> Back");
	 int autoInput = scan.nextInt();
	switch(autoInput) {
	case 0:clock();
	default: autoUpdateOfDateAndTime();
	}
}
public static void profiles() {
	System.out.println("Profiles");
	System.out.println("0. -> Back");
	 int profInput = scan.nextInt();
	switch(profInput) {
	case 0: menu();
	default: profiles();
	}
}
public static void simService() {
	System.out.println("SIM Services");
	System.out.println("0. -> Back");
	 int simInput = scan.nextInt();
	switch(simInput) {
	case 0: menu();
	default: simService();
	}
}

}	









