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

<h3>Commented code is documented using KDoc & generated to Markdown using Dokka.</h3>
<p>


### All Types

| Name | Summary |
|---|---|
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.ArgentinaActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-argentina-activity/index.md) | Argentina Activity. Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.AustraliaActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-australia-activity/index.md) | Australia Activity Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.BrazilActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-brazil-activity/index.md) | Brazil Activity Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.CanadaActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-canada-activity/index.md) | Canada Activity Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.ChinaActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-china-activity/index.md) | China Activity Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.maps.Company](../op.mobile.app.dev.singhs2.travelling.ui.maps/-company/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.maps.CompanyJSONReader](../op.mobile.app.dev.singhs2.travelling.ui.maps/-company-j-s-o-n-reader/index.md) | Class CompanyJSONReader - Reading JSON encoded values. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.maps.CompanyJSONResponse](../op.mobile.app.dev.singhs2.travelling.ui.maps/-company-j-s-o-n-response/index.md) | Class CompanyJSONResponse - JsonResponse is an HttpResponse subclass that helps to create a JSON-encoded response. Reading the name, city and location response. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.maps.CompanyMarkerCluster](../op.mobile.app.dev.singhs2.travelling.ui.maps/-company-marker-cluster/index.md) | CompanyMarkerCluster - The company (countries) marker clustering class helps to manage multiple markers at different zoom levels. This class helps us to put markers for all the tourists attractions. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DataSourceIndia](../op.mobile.app.dev.singhs2.travelling.data/-data-source-india/index.md) | Loading key phrases data in List for India. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceArgentina](../op.mobile.app.dev.singhs2.travelling.data/-datasource-argentina/index.md) | Loading key phrases data in List for Argentina. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceAustralia](../op.mobile.app.dev.singhs2.travelling.data/-datasource-australia/index.md) | Loading key phrases data in List for Australia. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceBrazil](../op.mobile.app.dev.singhs2.travelling.data/-datasource-brazil/index.md) | Loading key phrases data in List for Brazil. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceCanada](../op.mobile.app.dev.singhs2.travelling.data/-datasource-canada/index.md) | Loading key phrases data in List for Canada. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceChina](../op.mobile.app.dev.singhs2.travelling.data/-datasource-china/index.md) | Loading key phrases data in List for China. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceFrance](../op.mobile.app.dev.singhs2.travelling.data/-datasource-france/index.md) | Loading key phrases data in List for France. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceGermany](../op.mobile.app.dev.singhs2.travelling.data/-datasource-germany/index.md) | Loading key phrases data in List for Germany. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceMexico](../op.mobile.app.dev.singhs2.travelling.data/-datasource-mexico/index.md) | Loading key phrases data in List for Mexico. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceNewZealand](../op.mobile.app.dev.singhs2.travelling.data/-datasource-new-zealand/index.md) | Loading key phrases data in List for New Zealand. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceNigeria](../op.mobile.app.dev.singhs2.travelling.data/-datasource-nigeria/index.md) | Loading key phrases data in List for Nigeria. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.data.DatasourceSouthAfrica](../op.mobile.app.dev.singhs2.travelling.data/-datasource-south-africa/index.md) | Loading key phrases data in List for South Africa. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.FranceActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-france-activity/index.md) | France Activity Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.GermanyActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-germany-activity/index.md) | Germany Activity Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.model.GitHubCountries](../op.mobile.app.dev.singhs2.travelling.model/-git-hub-countries/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.home.HomeFragment](../op.mobile.app.dev.singhs2.travelling.ui.home/-home-fragment/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.home.HomeViewModel](../op.mobile.app.dev.singhs2.travelling.ui.home/-home-view-model/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.service.IGitHubCountries](../op.mobile.app.dev.singhs2.travelling.service/-i-git-hub-countries/index.md) | Interface to load API for GitHub. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.quiz.IOnClickListener](../op.mobile.app.dev.singhs2.travelling.ui.quiz/-i-on-click-listener/index.md) | Interface IOnClickListener for Quiz. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.IndiaActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-india-activity/index.md) | India Activity Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.adapter.ItemAdapter](../op.mobile.app.dev.singhs2.travelling.adapter/-item-adapter/index.md) | Adapter for the RecyclerView in MainActivity. Displays KeyPhrasesTest data object. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.model.KeyPhrasesTest](../op.mobile.app.dev.singhs2.travelling.model/-key-phrases-test/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.roomdatabase.ListAdapter](../op.mobile.app.dev.singhs2.travelling.ui.roomdatabase/-list-adapter/index.md) | Class ListAdapter - RecyclerView Adapter. Function onCreateViewHolder - returns the view of the highest score. Function onBindViewHolder - positions the userList to get the current item. Displays the score on the custom raw page(highest score). function getItemCount - Return the size of the list. Function setData - Set the text view text with the current item, set the user list with the value passed through parameter. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.roomdatabase.ListFragment](../op.mobile.app.dev.singhs2.travelling.ui.roomdatabase/-list-fragment/index.md) | Class ListFragment - Initialize Variables. Inflate the layout for this fragment. Recyclerview created with adaptor. initialize userViewModel - adapter set the data to the new value if there is a data change. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.mainActivity.MainActivity](../op.mobile.app.dev.singhs2.travelling.ui.main-activity/-main-activity/index.md) | MainActivity - This is the main page of the app. Usr have bottom screen navigation and also 5 buttons (Maps, Quiz, Translation, Key Phrases and Settings) to chose from. Then Calling dark mode check using shared preferences. onBackPressed - This is exit method for the app. If user click on the back button a toast message will advise user to click twice if they would like to exit. If user click twice within the (pressTime + 1000) a toast message will ask the user if they want to exit or not. If pressed yes the app will close but is pressed no it will take the user to the screen they were on. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.maps.MapsActivity](../op.mobile.app.dev.singhs2.travelling.ui.maps/-maps-activity/index.md) | MapsActivity is to load the maps. It has function to load map data(creating cluster, and marking cluster). Function that changes the map style. Function to check (if - else) the map style (map_style_retro &amp; map_style_dark). Also displaying Toast message if something went wrong. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.maps.MapsFragment](../op.mobile.app.dev.singhs2.travelling.ui.maps/-maps-fragment/index.md) | MapsFragment - Initializing the map and creating the map fragment. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.maps.MapsViewModel](../op.mobile.app.dev.singhs2.travelling.ui.maps/-maps-view-model/index.md) | View Model to capture data for Map. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.MexicoActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-mexico-activity/index.md) | Mexico Activity Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.NewZealandActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-new-zealand-activity/index.md) | Declaring shared preferences for night mode and checking the theme style checked. Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.NigeriaActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-nigeria-activity/index.md) | Declaring shared preferences for night mode and checking the theme style checked. Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.phrases.PhrasesFragment](../op.mobile.app.dev.singhs2.travelling.ui.phrases/-phrases-fragment/index.md) | PhrasesFragment class to display the country's key phrases. onItemClick function - Here whichever country is selected by the use this function will load the phrases for that given country. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.phrases.PhrasesViewModel](../op.mobile.app.dev.singhs2.travelling.ui.phrases/-phrases-view-model/index.md) | PhrasesViewModel class - Responsible for preparing and managing the data for an Activity or a Fragment and also handles the communication of the Activity/Fragment with the rest of the application. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.model.Quiz](../op.mobile.app.dev.singhs2.travelling.model/-quiz/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.quiz.QuizFragment](../op.mobile.app.dev.singhs2.travelling.ui.quiz/-quiz-fragment/index.md) | Class QuizFragment is loading the quiz. Fun onItemClick - to bind the value to quiz_fragment.xml |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.quiz.QuizGameFragment](../op.mobile.app.dev.singhs2.travelling.ui.quiz/-quiz-game-fragment/index.md) | Class QuizGameFragment - Here we are going to load quiz for each country. Then we assign the first answer as the correct answer when we get the input of the data. If the selected answer is correct/incorrect toast message displays to the UI of the outcome.  With addQuestionIdx we load to the next question and also check if the user actually selected an answer and that not skipping to next question with toast message again. Assigning the first answer to be correct and then checking what is selected by the user. Also adding up score. Displaying correct/incorrect answer. set question and add the score. Also checking the selection. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.quiz.QuizGameViewModel](../op.mobile.app.dev.singhs2.travelling.ui.quiz/-quiz-game-view-model/index.md) | Class QuizGameViewModel - responsible for the quiz functionality. Function startTimer - setting the time of thirty seconds for each question. Function onFinish - adding the question and then loading the new question. Then resetting the timer back to thirty seconds. Then the method will be called when this ViewModel is no longer used and will be destroyed. Timer will also be cancelled. Assigning the value to the timer. Each answer the user is allowed only thirty seconds. Fun addQuestionIdx - Adding questions value. Once user submitted the answer we will then load new question and image for the question. Timer is cancelled. Adds the score of the particular quiz. The we are setting up new question with new answer values. The answers will be shuffles every time the new quiz gets loaded and also the start the timer with thirty seconds limit. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.quiz.QuizGameViewModelFactory](../op.mobile.app.dev.singhs2.travelling.ui.quiz/-quiz-game-view-model-factory/index.md) | Adding suppress annotation. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.quiz.QuizViewModel](../op.mobile.app.dev.singhs2.travelling.ui.quiz/-quiz-view-model/index.md) | QuizViewModel class - Responsible for preparing and managing the data for an Activity or a Fragment and also handles the communication of the Activity/Fragment with the rest of the application. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.result.ResultFragment](../op.mobile.app.dev.singhs2.travelling.ui.result/-result-fragment/index.md) | Class ResultFragment - Initialize variables. Loads the score to the result view. By clicking Finish button user will be directed to home page. User will be taken to the highest score page which will display the highest scores stored in the room database. Function insertDataToDatabase - Adds final score to the room database on the Highest score page. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.result.ResultViewModel](../op.mobile.app.dev.singhs2.travelling.ui.result/-result-view-model/index.md) | ResultViewModel - Assign the score to the final score. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.result.ResultsViewModelFactory](../op.mobile.app.dev.singhs2.travelling.ui.result/-results-view-model-factory/index.md) | Adding suppress annotation. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.service.ServiceAdapter](../op.mobile.app.dev.singhs2.travelling.service/-service-adapter/index.md) | Service adapter class loading functions areItemsTheSame, areContentsTheSame, onCreateViewHolder, onBindViewHolder, onClick and inner class ServiceViewHolder. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.service.ServiceInstance](../op.mobile.app.dev.singhs2.travelling.service/-service-instance/index.md) | SeviceInstance - performing long-running operations in the background. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.service.ServiceStatus](../op.mobile.app.dev.singhs2.travelling.service/-service-status/index.md) | Class Enum - loading the service status. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.settings.SettingsFragment](../op.mobile.app.dev.singhs2.travelling.ui.settings/-settings-fragment/index.md) | Class SettingsFragment - This class will be displaying the facebook, github external link. Extra feature. Also I am loading my privacy policy and terms &amp; conditions on this page. I have also added a toggle switch which will be changing the theme to light mode / dark mode. In the onCreateView function I am setting up the light mode and dark mode theme. If/Else checks the toggle switch is in dark mode or light mode. Using shared preference if the check is true then apply the dark mode (MODE_NIGHT_YES) and if the check is false then don't apply the dark mode (MODE_NIGHT_NO). Further Buttons - to take the user to the specific need. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.settings.SettingsViewModel](../op.mobile.app.dev.singhs2.travelling.ui.settings/-settings-view-model/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.allCountryActivities.SouthAfricaActivity](../op.mobile.app.dev.singhs2.travelling.all-country-activities/-south-africa-activity/index.md) | Declaring shared preferences for night mode and checking the theme style checked. Declaring shared preferences for night mode and checking the theme style checked. Initialize data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.splashScreen.SplashScreenActivity](../op.mobile.app.dev.singhs2.travelling.ui.splash-screen/-splash-screen-activity/index.md) | SplashScreenActivity - loads the animation and  MediaPlayer is responsible for the plane sound in the background. We then release sound at the end of activity. finish()  method then release sound at the end of activity. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.translation.TranslationFragment](../op.mobile.app.dev.singhs2.travelling.ui.translation/-translation-fragment/index.md) | TranslationFragment - Initialize variables. Generate findViewById for translator button, speech button and spinner. Then Create an ArrayAdapter using the string array and a default spinner layout. Specify the layout to use when the list of choices appears and then Apply the adapter to the spinner. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.ui.translation.TranslationViewModel](../op.mobile.app.dev.singhs2.travelling.ui.translation/-translation-view-model/index.md) | TranslationViewModel - declaring the yandexTranslateUrl url and assigning the status of MutableLiveData. Getting the response MutableLiveData. viewModelScope then launches the translation activity by using the retrofitYandexService. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.service.Translator](../op.mobile.app.dev.singhs2.travelling.service/-translator/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.database.User](../op.mobile.app.dev.singhs2.travelling.database/-user/index.md) | user data class - Using @Entity annotation and creating the quiz_score table within the database to store the highest score data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.roomDatabase.User](../op.mobile.app.dev.singhs2.travelling.room-database/-user/index.md) | user data class - Using @Entity annotation and creating the quiz_score table within the database to store the highest score data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.database.UserDao](../op.mobile.app.dev.singhs2.travelling.database/-user-dao/index.md) | Data Access Object (Dao) - Contains the methods used to access the database. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.roomDatabase.UserDao](../op.mobile.app.dev.singhs2.travelling.room-database/-user-dao/index.md) | Data Access Object (Dao) - Contains the methods used to access the database. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.database.UserDatabase](../op.mobile.app.dev.singhs2.travelling.database/-user-database/index.md) | UserDatabase - Contains the database holder and serves as the main access point for the underlying connection to the app's persisted, relational data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.roomDatabase.UserDatabase](../op.mobile.app.dev.s<br><br>inghs2.travelling.room-database/-user-database/index.md) | UserDatabase - Contains the database holder and serves as the main access point for the underlying connection to the app's persisted, relational data. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.database.UserRepository](../op.mobile.app.dev.singhs2.travelling.database/-user-repository/index.md) | UserRepository - Abstracts access to multiple data sources. its not part of the Architecture Components libraries, but is a suggested best practice for code separation and architecture. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.roomDatabase.UserRepository](../op.mobile.app.dev.singhs2.travelling.room-database/-user-repository/index.md) | UserRepository - Abstracts access to multiple data sources. its not part of the Architecture Components libraries, but is a suggested best practice for code separation and architecture. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.database.UserViewModel](../op.mobile.app.dev.singhs2.travelling.database/-user-view-model/index.md) | UserViewModel - To access all our queries from Dao. To provide data to the UI and survive configuration changes. It acts as a communication center between the Repository and the UI. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.roomDatabase.UserViewModel](../op.mobile.app.dev.singhs2.travelling.room-database/-user-view-model/index.md) | UserViewModel - To access all our queries from Dao. To provide data to the UI and survive configuration changes. It acts as a communication center between the Repository and the UI. |<br><br>
| [op.mobile.app.dev.singhs2.travelling.model.Yandex](../op.mobile.app.dev.singhs2.travelling.model/-yandex/index.md) |  |<br><br>
| [op.mobile.app.dev.singhs2.travelling.languageApi.YandexLangCode](../op.mobile.app.dev.singhs2.travelling.language-api/-yandex-lang-code/index.md) | YandexLangCode - used for translator. Language is translated from english to each specific country language using Yandex. |</p><br><br>
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