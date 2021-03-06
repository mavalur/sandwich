# sudo_make_me_sandwich
sudo_make_me_sandwich

####Planned Feature set
- Single page chat acts the central point of incident management.
- Persist all incident details and chat log into BSON documents into Mongo DB.
- Page has a integration with twilio for initiaitng a conference bridge.
- Ability to add a group or a particular user from the group the bridge. 
- Ability to initiate screen share from the chatpage.
- Predefined hashtags that serve the purpose of indicating special statments.
- Add a #RootCause to the chat statement- the statement goes into the executive summary and also to the incident summary at the top
- Add #Resolution to the chat statement - statemet gets added to the exec summary under resolution.
- Other hashtags such as #Sev1, #Sev2 will be parsed and then associated actions are run.
- Ability to add  passive followers to the incident. (Passive followers get a text message with an ask to reply. Once they reply to the SMS, any hashtag(ged) statements are sent to them via text/email
- Hashtagged statements+application profile (tech stack, vpc, servernames) used for collaborative filteriing.

####Technology Stack
- Spring Boot running on Jetty
- Twilio for Telephony, Bridge and Conference
- Mongo DB for persistence hosted on AWS
- Angular for UI
- ngrok for secure tunnels to localhost 
- screenleap for screen sharing.
- Gradle for build
- Node, NPM, Bower for javascript pkg management

####UI Libs
- "angular": "~1.4.8",
- "angular-material": "~2.0",
- "angular-ui-router": "~0.2.15",

####Runtime details

####Contact Details
Spring, Mongo : Satish Terala
Angular, NodeJS, Bower: Harikumar
Twilio, ngrok : Zuber Sayed
Screenleap : Sitaram Guruswamy