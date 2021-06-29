<h1>Travel Earth</h1>
<img src="/images/Travel Earth.jpg" alt="Travel Earth Wireframe" width="200" height="200">
<h2>Travel Earth Wireframe</h2>
<p>Image below is the sketched wireframe of my application.</p>
<img src="/images/Travel Earth Wireframe.png" alt="Travel Earth Wireframe">
<h2><a href="https://otago-polytechnic-bit-courses.github.io/mobile-app-dev-s1-21-project-SABISINGH/">Travel Earth Privacy Policy</a></h2>
<h2><a href="https://www.websitepolicies.com/policies/view/qBaLNp64">Travel Earth Terms & Conditions</a></h2>
<h2>Step-by-step user guide detailing each screen.</h2>

<h3>Splash Screen</h3>
<img src="/images/Splash Screen.jpg" alt="Splash Screen" width="150" height="250">
<p>Travel Earth application starts with splash screen. Image above is the splash screen working when user open the Travel Earth app. Splash screen has an ImageView & transition animation. The transition animation is a custom animation XML file. In addition I have added a plane sound to the splash screen with the use of MediaPlayer. So basically when splash screen is running there is a background music playing.</p>

<h3>Home Screen</h3>
<p><img src="/images/Home Page Light Mode.jpg" alt="Home Page Light Mode" width="150" height="250">
<img src="/images/Home Page Dark Mode.jpg" alt="Home Page Dark Mode" width="150" height="250"></p>
<p>Once the splash screen finish the app go to home page. Home page has bottom navigation menu at the bottom (Home, Translator, Quiz, Key phrases and settings) and it also consists five buttons on the main screen. I have added images above of the home screen in light mode and dark mode. </p>

<h3>Bottom Navigation View</h3>
<p><img src="/images/Home Page Light Mode.jpg" alt="Home Page Light Mode" width="150" height="250">
<img src="/images/Home Page Dark Mode.jpg" alt="Home Page Dark Mode" width="150" height="250">
<img src="/images/Quiz Results.jpg" alt="Quiz Results" width="150" height="250">
<img src="/images/Quiz Results Dark.jpg" alt="Quiz Results Dark" width="150" height="250"></p>
<p>At the bottom of the screen is bottom navigation view. User will be able to just press on the view they want to switch with just a click.</p>

<h3>Google Maps Showing Top Tourists Attractions</h3>
<p><img src="/images/Map Showing Tourist Attractions.jpg" alt="Map Showing Tourist Attractions" width="150" height="250">
<img src="/images/Map Showing Tourist Attractions 1.jpg" alt="Map Showing Tourist Attractions" width="150" height="250">
<img src="/images/Map Showing Tourist Attractions 2.jpg" alt="Map Showing Tourist Attractions" width="150" height="250">
<img src="/images/Map Showing Tourist Attractions 3.jpg" alt="Map Showing Tourist Attractions" width="150" height="250"></p>
<p><img src="/images/Map Showing Tourist Attractions 4.jpg" alt="Map Showing Tourist Attractions" width="150" height="250">
<img src="/images/Attraction Details.jpg" alt="Attraction Details" width="150" height="250">
<img src="/images/Change Map Style.jpg" alt="Change Map Style" width="150" height="250">
<img src="/images/Change Map Style New.jpg" alt="Change Map Style New.jpg" width="150" height="250"></p>
<p>When user click on the first button (Maps) the screen will load Google Maps which displays Top Tourists Attraction. As per the project requirements we only need to show 24 attractions (12 countries with 2 attractions each). I have used 66 attractions for my 12 country's to make the it lok better. The Top-rated tourist attraction data is fetched from a JSON file in the raw resource directory. Each data object is represented by a marker on a Google Map. I have added more tourists attractions to display the Cluster of the markers as per image above. The marker's information window then display the attraction's name, city name & coordinates (latitude & longitude). Also I have implemented extra feature of changing the map style. the current map view is Retro but if user click on the three dots on the top right screen the new display message opens (Change Map Style). If user click on it then the new map style Aubergine loads ont he screen. User can chose to click on the change map style if they wish to go to the Retro Style.  </p>

<h3>Interactive Quiz</h3>
<p><img src="/images/Quiz.jpg" alt="Quiz" width="150" height="250">
<img src="/images/Quiz Dark.jpg" alt="Quiz Dark" width="150" height="250">
<img src="/images/Quiz Start.jpg" alt="Quiz Start" width="150" height="250">
<img src="/images/Quiz Start Dark.jpg" alt="Quiz Start Dark" width="150" height="250">
<img src="/images/Quiz Right Answer.jpg" alt="Quiz Right Answer" width="150" height="250"></p>
<p><img src="/images/Quiz Right Answer Dark.jpg" alt="Quiz Right Answer Dark" width="150" height="250">
<img src="/images/Quiz Wrong Answer.jpg" alt="Quiz Wrong Answer" width="150" height="250">
<img src="/images/Quiz Wrong Answer Dark.jpg" alt="Quiz Wrong Answer Dark" width="150" height="250">
<img src="/images/Quiz Results.jpg" alt="Quiz Results" width="150" height="250">
<img src="/images/Quiz Results Dark.jpg" alt="Quiz Results Dark" width="150" height="250"></p>
<p><img src="/images/Quiz Highest Score.jpg" alt="Quiz Highest Score" width="150" height="250">
<img src="/images/Quiz Highest Score Dark.jpg" alt="Quiz Highest Score Dark" width="150" height="250"></p>
<p>When user click on the Quiz button the screen will load an Interactive Quiz. Again, I am displaying the dark theme and light theme image. The recycler view displays the 12 countries which user can scroll up and down to chose the country they prefer for the quiz. Each country has its own quiz questions. In each country's details I have added a country's name, map and its official language. Once user click on the country they want to play the quiz for the new screen will load with the first question. Quiz data is fetched from a API file from the GitHub. Quiz questions include animals, culture, food, drink, geography & sport for the specific country. Each quiz have six questions. Five multi-choice &  one true or false. Multi-choice questions have four answers and each question have an image. I have also added a timer to each question. User must answer each question  within a 30 second time limit. If the answer is correct then a Toast message display the answer is correct and if its wrong then Toast message displays that the answer you clicked was wrong and also tell them the correct answer. Images provided above. If user do not answer within thirty seconds time limit the next question loads and user loose 1 from the score. Once quiz is complete the new page will congratulate the user and display their total score for the quiz. On this page user have a choice to click on finish button which will route the user back to home page or they click on highest score which takes the user to highest score page. The highest scores are stored in a Room Database table and it display the highest score in a TextView. </p>

<h3>Translator Screen</h3>
<p><img src="/images/Translator.jpg" alt="Translator" width="150" height="250">
<img src="/images/Translator Dark.jpg" alt="Translator Dark" width="150" height="250"></p>
<p>When user click on the Translator button the screen will load the translator page. User need to write there text input in the top EditText. The user will need to chose a language from the spinner at the bottom left and press translate button. The new translated result will then display in the TextView which is at the bottom of the screen. A custom ProgressDialog is displayed while the text is being translated. if the EditText is blank the app will show a Toast message saying please enter the text to translate. There is also text to speech support. User click on the speech button and the translated text will be said ina voice with the help of Text-To-Speech feature. </p>

<h3>Country Phrases Screen</h3>
<p><img src="/images/Key Phrases.jpg" alt="Key Phrases" width="150" height="250">
<img src="/images/Key Phrases Dark.jpg" alt="Key Phrases Dark" width="150" height="250">
<img src="/images/Each Country Key Phrase.jpg" alt="Each Country Key Phrase" width="150" height="250" >
<img src="/images/Each Country Key Phrase Dark.jpg" alt="Each Country Key Phrase Dark" width="150" height="250"></p>
<p>When user click on the Key Phrases button the screen will load the Country phrases. The recycler view displays the 12 countries which user can scroll up and down to chose the country they prefer for the phrases. Each country has its own key phrases. In each country's details I have added a country's name, map and its official language. Once user click on the country they want to view the phrases for the new screen will load the key phrases for that country.</p>

<h3>Settings Screen</h3>
<p><img src="/images/Settings Light Mode.jpg" alt="Settings Light Mode" width="150" height="250">
<img src="/images/Settings Dark Mode.jpg" alt="Settings Dark Mode" width="150" height="250">
<img src="/images/Facebook.jpg" alt="Facebook" width="150" height="250">
<img src="/images/Github.jpg" alt="Github" width="150" height="250">
<img src="/images/Privacy Policy.jpg" alt="Privacy Policy" width="150" height="250"></p>
<p><img src="/images/Terms & Conditions.jpg" alt="Terms & Conditions" width="150" height="250"></p>
<p>When user click on the Settings button the screen will load the settings page which has a toggle switch which controls the light mode and dark mode feature. On the settings page user will be able to switch between the light mode and dark mode. When user chose the dark mode and then exit the application, when they open the application again the same theme will be applicable until user change it back. I have provided four buttons under the toggle switch. First button is Facebook. When user click on the button it will load the facebook webpage. Second button is GitHub. When user click on the button it will load the GitHub webpage. Third button is for Travel Earth's Privacy Policy. When user click on the privacy policy button it will load the webpage displaying the policy. It is hosted on the GitHub Project. The link to policy is provided in the start of this documentation. Fourth button is for Travel Earth's Terms & Conditions. When user click on the Terms & Conditions button it will load the webpage displaying the conditions. It is hosted on the Website policies webpage. The link to Terms & Conditions is provided in the start of this documentation.</p>

<h3>Exit Dialog Fragment</h3>
<p><img src="/images/Exit Dialogue Message.jpg" alt="Exit Dialogue Message"width="150" height="250">
<img src="/images/Exit Dialogue Message Dark.jpg" alt="Exit Dialogue Message Dark"width="150" height="250">
<img src="/images/Exit Dialogue.jpg" alt="Exit Dialogue" width="150" height="250">
<img src="/images/Exit Dialogue Dark.jpg" alt="Exit Dialogue Dark" width="150" height="250"></p>
<p>The Travel Earth Application can be exited via a DialogFragment. If the user press the back button once the Toast message ask the user if they want to exit the app then press twice. If user press the back button twice within certain time then the exit DialogFragment. The DialogFragment prompts the user when the user double taps the mobile device's back button. It ask the user if they are sure to exit the app. If user click NO it will take them back to the screen they were on but if they press YES then the Travel Earth's App will close. </p>

<h3>Adaptive Launcher</h3>
<p><img src="/images/Adaptive Launcher.jpg" alt="Adaptive Launcher" width="150" height="250">
<img src="/images/Exit Dialogue.jpg" alt="Exit Dialogue" width="150" height="250">
<img src="/images/Exit Dialogue Dark.jpg" alt="Exit Dialogue Dark" width="150" height="250"></p>
<p>The DialogFragment prompts the user when the user double taps the mobile device's back button to exit the app.. </p>

<h3>Localization</h3>
<p><img src="/images/Localization English.jpg" alt="Localization English"width="150" height="250">
<img src="/images/Localization Hindi.jpg" alt="Localization Hindi" width="150" height="250">
<img src="/images/Localization Hindi 1.jpg" alt="Localization Hindi" width="150" height="250">
<img src="/images/Localization Hindi 2.jpg" alt="Localization Hindi" width="150" height="250">
<img src="/images/Localization Hindi 3.jpg" alt="Localization Hindi"width="150" height="250"></p>
<p><img src="/images/Localization Hindi 4.jpg" alt="Localization Hindi"width="150" height="250">
<img src="/images/Localization Hindi 5.jpg" alt="Localization Hindi"width="150" height="250">
<img src="/images/Localization Portugese.jpg" alt="Localization Potugese"width="150" height="250">
<img src="/images/Localization Potugese 1.jpg" alt= "Localization Potugese" width="150" height="250">
<img src="/images/Localization Potugese 2.jpg" alt= "Localization Potugese" width="150" height="250"></p>
<p><img src="/images/Localization Potugese 3.jpg" alt= "Localization Potugese" width="150" height="250">
<img src="/images/Localization Potugese 4.jpg" alt= "Localization Potugese" width="150" height="250">
<img src="/images/Localization Potugese 5.jpg" alt= "Localization Potugese" width="150" height="250"></p>
<p>Localization support is provided for each country. When user changes the language of there mobile then Travel Earth application also changes its language. The images above shows first to change the language to Hindi (India's Official language) then the Travel Earth app also changes to hindi. Then the language is changed to Portuguese (Brazil's Official Language) then the Travel Earth app also changes to Portuguese.</p>

<br><br><br><br>
<h2>Resources</h2>
<h4><a href="https://www.flaticon.com/free-icon/travelling_1748778?term=travelling&page=2&position=47&page=2&position=47&related_id=1748778&origin=search">Flaticon - For icons</a></h4>
<h4>For Free Images - <a href="https://www.pexels.com">Pexels</a> and <a href="https://pixabay.com">Pixabay</a></h4>
<h4><a href="https://audiojungle.net/">Splash Screen Audio</a></h4>
<h4>Media Player - <a href="https://stackoverflow.com/questions/32844746/playing-sounds-on-splash-screen-start-up">Playing sounds on splash screen start up</a> and <a href="https://stackoverflow.com/questions/3370211/how-to-play-audio-in-splash-screen-in-android/3373150">How to play audio in splash screen in android</a></h4>
<h4><a href="https://www.youtube.com/watch?v=V-gKDt-sIlM">How to change action bar text color in android studio</a></h4>
<h4><a href="https://developers.google.com/maps/documentation/android-sdk/styling#raw-resource">Adding a Styled Google Map</a></h4>
<h4><a href="https://www.materialpalette.com/brown/grey">Material Design Palette - Travel Earth App Theme Color</a></h4>
<h4><a href="https://mapstyle.withgoogle.com/">Create Google Map Style</a></h4>
<h4><a href="https://www.youtube.com/watch?v=6OlONE8Lb_4">Open an Android fragment from another fragment using a button click</a></h4>
<h4><a href="https://stackoverflow.com/questions/51672231/kotlin-button-onclicklistener-event-inside-a-fragment">Kotlin button onClickListener event inside a fragment</a></h4>
<h4><a href="https://developer.android.com/codelabs/basic-android-kotlin-training-affirmations-app#0">Key Phrases - Use RecyclerView to display a scrollable list</a></h4>
<h4><a href="https://www.youtube.com/watch?v=sFfP5qZojHQ Followed this video">How to Use Exit Alert Dialog in Android using Kotlin Language</a></h4>
<h4><a href="https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html#foreground.type=clipart&foreground.clipart=android&foreground.space.trim=1&foreground.space.pad=0.25&foreColor=rgba(96%2C%20125%2C%20139%2C%200)&backColor=rgb(68%2C%20138%2C%20255)&crop=0&backgroundShape=square&effects=none&name=ic_launcher">Adaptive Launcher icon generator</a></h4>
<h4><a href="https://github.com/Kotlin/dokka">Dokka</a></h4>
<h4><a href="https://github.com/otago-polytechnic-bit-courses/IN721-mobile-application-development/blob/master/code-resources/build_pull_request.yml">Github actions and Workflow</a></h4>
<h4><a href="https://www.websitepolicies.com/">Terms & Conditions</a></h4>
<h4><a href="https://www.freeprivacypolicy.com/">Free Privacy Policy Generator</a></h4>
<h4><a href="https://www.youtube.com/watch?v=b21fiIyOW4A&t=4168s">Build a Complete Quiz App for Android from Scratch Using Kotlin and Android Studio</a></h4>
<h4>Room Database - <a href="https://www.youtube.com/watch?v=lwAvI3WDXBY&t=1s">Room Database - Create Database Schema</a> and <a href="https://www.youtube.com/watch?v=UBCAWfztTrQ&t=29s">Room Database - Insert Data</a> and <a href="https://www.youtube.com/watch?v=3USvr1Lz8g8&t=38s">ROOM Database - Read Data</a></h4>
<h4><a href="https://www.youtube.com/watch?v=bLUXfWkZMD8">Countdown Timer - Multiple Choice Quiz App</a></h4>
<h4><a href="https://www.youtube.com/watch?v=zmjfAcnosS0">Simple Countdown Timer - Android Studio</a></h4>