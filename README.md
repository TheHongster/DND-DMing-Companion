# Dungeons and Dragons Companion App
# Software Engineering
# ITSC-3155
# Last Updated: December 1st, 2020
# Group 8 Members: Ross Landgraf, Aaron Hong, Nickolas Earles, Cormac Strickland
![Logos](https://i.imgur.com/o3EPh5Z.png "Logos")
## Final Project Report With More Details Of The Project:
#### [Final Project Report PDF](https://github.com/TheHongster/DND-DMing-Companion/blob/master/Final%20Project%20Report%20%20--%20Group%208.pdf)

## Introduction:
&nbsp; &nbsp; &nbsp; Our project is an application for the tabletop game DND (Dungeons and Dragons) for the DM (Dungeon Master) that will aid in running the game. It will keep track of the game’s statistics and mechanics such as a “monster’s” hit points and armor class as well as the player hit points and armor class. The main goal of this application is to keep track of all of the relevant statistics to the game to assure a smooth playing experience for all of the members involved in the game. 
<br> &nbsp; &nbsp; &nbsp; Our project will be able to create an app that covers the important mechanics of running the game as a Dungeon Master. The Dungeon Master is a person who controls the different mechanics of the game and the different outcomes for all of the other players involved. Our project that creates an app to aid this person will be very important because it will keep track of many advanced concepts that are hard to keep track of within your head.

## Purpose:
&nbsp; &nbsp; &nbsp; DND (Dungeons and Dragons) games are often complicated and disorganized, especially after several hours of playtime. There is a lot of information to keep track of, so we decided to create a system to help organize and check that information. This allows players to focus on the more enjoyable aspects of the game without being bogged down by the monotony of constantly tallying and adjusting numbers. Our app is designed to make the DND experience more accessible to players without intruding too much on what makes a tabletop role-playing game so fun.

## Scope:
&nbsp; &nbsp; &nbsp; We proposed to create an application that will allow users to track the status of multiple characters for the tabletop game DND (Dungeons and Dragons) so that the user will be able to spend less time trying to keep track of individual statistics in the game. 
<br> &nbsp; &nbsp; &nbsp; We have created an android phone application called Dungeons and Dragons Companion App that has been developed through Android Studio. This project is an application that allows users to add enemies and players into a list, that will be editable. Displaying the list using a recycler view. And allowing the user to view, sort, edit, and delete entries.
<br> <br> The Application will have the ability to:
* Add new creatures 
* Keep track of creatures HP/AC. 
* Delete creatures 
* Sort creatures by HP/AC/Name 
* Change the health of creatures through damage actions
* Display creatures in a list style

<br> &nbsp; &nbsp; &nbsp;  The overall objective of the application is to create a system that allows the user to input a set of data that is stored in an ArrayList, then allowing the user to interact with the data through changing fields in the ArrayList. This allows the system to take the user's inputted information and display it as a View that shows all of the creatures created by the user.

## Definitions, Acronyms, and Abbreviations:
* DND: Refers to the game Dungeons and Dragons; a tabletop game made by Wizards of the Coast. 
* HP: Stands for hit points; it is a numerical statistic in the game to track an entity’s health in the game.
* AC: Stands for armor class; it is a numerical statistic that represents the difficulty of “hitting” an entity within the game based on a dice roll.
* DM: Stands for Dungeon Master; this is the master of the game that controls how the game flows and dictates what happens in the game as well as keep track of changes to the entities within the game.
* UI: User interface; this is the medium in which the user can interact with our application.
* DFD: Detailed Flow Diagram; this is a diagram we use to list out what we need of the system we’re trying to create.

## References:
* Dungeons and Dragons Official Website - https://dnd.wizards.com/ 
* Android Studio - https://developer.android.com/studio 

* Not necessarily a reference but an important documentation of our project:
<br> Our GitHub Page: https://github.com/TheHongster/DND-DMing-Companion

* No code was referenced in development and was done completely from scratch.

## Overview: 
&nbsp; &nbsp; &nbsp; The application allows the user(s) to create and store entities related to their session of DND. The user(s) can modify specific values like HP or AC to help keep track of the game statistics as the game session progresses. The entities the user(s) can create contain the values Name, HP, and AC which can be set and edited at will. The user(s) can also designate the type of entity it is, (player, neutral, enemy), and the number of the entity if there’s a need for several of the same entities. All of the information related to the entities are displayed in a list where any user can touch to edit the information. The application has a sort feature that can sort entities by specific categories in ascending or descending order.

## Project Perspective
&nbsp; &nbsp; &nbsp; As DND players ourselves, we had a useful perspective for designing and implementing an app to be used by other players. We all have experience with the problems that arise during a game of DND, and we all have tried other software products to solve these issues. This familiarity with the game allows us to best understand what users want in an app and how it will be used. Making an app for a game we had never played would be considerably more difficult, as often occurs in business settings where the product owner is disconnected from the desires of their users.

## The List of Our User Stories:
* As a Dungeons and Dragons Game Master, I want to utilize my time efficiently so I can get through a game faster.
* As a Dungeons and Dragons Game Master, I want to be able to keep track of what’s going on so I can have fun with the game without wasting time.
* As a Dungeons and Dragons Game Master, I want to be able to track the health of all of the listed creatures so I can know the current status of all creatures.
* As a Dungeons and Dragons Game Master, I want to be able to see all creatures listed in Armor Class so I can quickly make rulings and decisions in the game.
* As a Dungeons and Dragons Game Master, I want to be able to subtract the health from the creature's health pool so I can know when a creature is dead.
* As a Dungeons and Dragons Game Master, I want to be able to organize/sort my creatures on the list, so that I can find specific creatures faster.
* As a Dungeons and Dragons Game Master, I want to be able to list creatures by their turn order so that I can keep combat more organized.
* As a Dungeons and Dragons Player, I want to be able to get through a game session efficiently so that I can not waste time and have more fun.
* As a Dungeons and Dragons Player, I want to be able to have information about the game session so that I can have the information readily available.
* As a Dungeons and Dragons Enthusiast, I want to be able to identify gameplay attributes so that I can improve my style of play for the game.
* As a Dungeons and Dragons Enthusiast, I want to be able to clearly observe how the game is tracked in the app, so that I can better utilize my time spent playing the game.

## Specific Goals/Features:
&nbsp; &nbsp; &nbsp; Our group had several main goals in mind while designing and developing the application. There were some specific use cases that had to be included in the app for it to be able to serve its intended purpose of tracking creature health, including create/delete a creature, change creature health, and display creature list. We also knew we would need a database for storing creature information, as well as a way to get input from the user. 
<br> &nbsp; &nbsp; &nbsp; Outside of these core components we also wanted to add some quality of life features such as sorting and filtering creatures by their health or type, as well as color coding for quick identification of relevant information. We also had a more general design goal of keeping the app streamlined and minimalistic. Players should find the app intuitive so they can seamlessly incorporate it into their games.


## The List of The System Features Extracted From The User Stories:
* Add creatures to list
* Display all creatures in a list together
* Display creature information including name, health, and armor class
* Make calculations of health by inputting damage information into the application
* Sort by ascending/descending based on specific attributes (Will be implemented in the next Demo)
* Be able to list creatures by “turn order” (Will be implemented in the next Demo)

## Overview Of Programs Related To Specific Goals
This gives a main overview of how the program/application is structured when it comes to code and the different files involved. 
* MainActivity
  * This acts as the base for the program all of the following fragments are displayed on top of this and pull information from it. 
  * Arraylist that holds all information for the creatures.
  * Holds the methods that are used to edit the arraylist that holds all information for the creatures.
* Fragment0
  * Is a basic press to start screen it only sends users to fragment1
* Fragment1 
  * This fragment acts as the display of the ArrayList
  * Sends a request to the Block_Adapter for a formatted version of the ArrayList
  * Holds the base for mLisiner which is used by the fragments to reference MainActivity’s methods
  * If the user clicks on one of the items displayed in the list returned from Block_Adapter, it will take them to Fragment3.
  * If the user taps the add or sort buttons they will be taken to the proper fragment (add = fragment2, sort= fragment4)
* Fragment2
  * This is the add fragment 
  * By filling out the input sections the user is able to create a new creature (Block object) and add it to the array thru the use of the mListener 
* Fragment3
  * This is the creature display fragment 
  * This fragment displays the information of a single selected creature from the ArrayList
  * Here the user can either damage a single creature or delete a creature
* Fragment4
  * This is the sorting fragment
  * This fragment is able to sort the ArrayList in ascending or descending order based off of Name, Armor Class, Hitpoints
* Block
  * This class is how the information of a single creature is stored
  * This is is built in to the ArrayList for the storage
* Block_Adapter
  * This class in takes the Arraylist and converts it into a viewable list 
  * Then sends it back to the fragment1
  
## Assumptions And Dependencies
Some of the main assumptions with our application are:
* The user has an android phone
* The user is able to use a touch screen
* The user has a basic understanding of Dungeons and Dragons 

Some of the main dependencies with our application are:
* The Android phone systems
* Dungeons and Dragons/ or other D20 Base Systems
* Java


## Important Diagrams:
### The Context Diagram, Data Flow Diagram, and Major Use Cases Along With The Use Case Diagram:
### Context Diagram: 
![Context Diagram](https://i.imgur.com/2Xsg4jO.png "Context Diagram")
### Data Flow Diagram: 
![Data Flow Diagram](https://i.imgur.com/d6ODwVP.png "Data Flow Diagram")
### Major Use Cases
![Add Creature To List Use Case Diagram](https://i.imgur.com/NRIXTft.png "Add Creature to list Use Case Diagram")
![Damage Creature Use Case Diagram](https://i.imgur.com/dBMJyta.png "Damage Creature Use Case Diagram")
![Display creatures screen Use Case Diagram](https://i.imgur.com/zzBqKnW.png "Display creatures screen Use Case Diagram")
![Edit Selected Creature Use Case Diagram](https://i.imgur.com/8tzuVXb.png "Edit Selected Creature Use Case Diagram")
![Remove Creature Use Case Diagram](https://i.imgur.com/Fi7YUCk.png "Remove Creature Use Case Diagram")
### Major Use Cases As A Use Case Diagram:
![Major Use Cases As A Use Case Diagram](https://i.imgur.com/y676AXu.png "Major Use Cases As A Use Case Diagram")

## Total Effort:
| Task                                      | Estimated Time of Research | Actual Time Of Research | Estimated Coding Effort | Actual Coding Effort |
|-------------------------------------------|----------------------------|-------------------------|-------------------------|----------------------|
| User Stories                              | ~1 hr                      | 1 hr                    | N/A                     | N/A                  |
| Context Diagram                           | ~1.5 hrs                   | 1 hr                    | N/A                     | N/A                  |
| DFD                                       | ~1.5 hrs                   | 2 hrs                   | N/A                     | N/A                  |
| Use Case Diagrams                         | ~1.5 hrs                   | 1.5 hrs                 | N/A                     | N/A                  |
| Develop Demo Of App                       | ~1.5 hrs                   | 1 hr                    | ~5 hrs                  | 5.5 hrs              |
| Record and Edit Demonstration/Final Video | ~1.5 hrs                   | 3.5 hrs                 | N/A                     | N/A                  |
| Screenshot App Funcitonality              | ~ .5 hrs                   | .5 hrs                  | N/A                     | N/A                  |
| Develop Final Version Of App              | ~1.5 hrs                   | 1 hr                    | ~2 hrs                  | 5 hrs                |


## Programs Developed:
## Screenshots of The User Interfaces With A Brief Description of What Each One Is For:
These are screenshots of our app that is in development. These screenshots help demonstrate the overall functionality of our project in its current state at the first demonstration. 
## Screenshots:
|   |   |
|---|---|
| ![Screenshot 1](https://i.imgur.com/CabMkSn.png "Screenshot 1")  | ![Screenshot 2](https://i.imgur.com/STwa3Wd.png "Screenshot 2")  |
| Description: This is the new opening screen for the app added after request for it from testers.  | Description: This is the creature list  display with no creatures held in the Arraylist.  |
| ![Screenshot 3](https://i.imgur.com/TpZuAK2.png "Screenshot 3")  | ![Screenshot 4](https://i.imgur.com/ZDB70aB.png "Screenshot 4")  |
| Description: This is the add screen. This is where the user can add new creatures.  | Description: This is the creature list  display with 2 creatures held in the Arraylist that were added by the last add.  |
| ![Screenshot 5](https://i.imgur.com/BDax6hZ.png "Screenshot 5")  | ![Screenshot 6](https://i.imgur.com/6B4YFsN.png "Screenshot 6")  |
| Description: This is the creature list display with more values to be used for future tests.   | Description: This is the creature display showing one monster's stats. As well as showing the damage function.  |
| ![Screenshot 7](https://i.imgur.com/EZaA69I.png "Screenshot 7")  | ![Screenshot 8](https://i.imgur.com/bUAOo5o.png "Screenshot 8")  |
| Description: This shows the damaged monster in the list.  | Description: This shows the sorting selections.  |
| ![Screenshot 9](https://i.imgur.com/9eqhhty.png "Screenshot 9")  | ![Screenshot 10](https://i.imgur.com/MdVuTrH.png "Screenshot 10")  |
| Description: This shows the sort’s results.  | Description: Part 2 of sort results.  |

## Before and After Additional Development:
|  Before  |  After  |
|---|---|
| ![Screenshot 1](https://i.imgur.com/LYA6wRC.png "Screenshot 1")  |  ![Screenshot 2](https://i.imgur.com/nphlw8h.png "Screenshot 2") |
| ![Screenshot 3](https://i.imgur.com/Fdu1YlI.png "Screenshot 3")  |  ![Screenshot 4](https://i.imgur.com/x4GPuAR.png "Screenshot 4") |
| ![Screenshot 5](https://i.imgur.com/He75bVT.png "Screenshot 5")  |  ![Screenshot 6](https://i.imgur.com/BDRLJla.png "Screenshot 6") |
| ![Screenshot 7](https://i.imgur.com/lXn37Sy.png "Screenshot 7")  |  ![Screenshot 8](https://i.imgur.com/2SY2uAs.png "Screenshot 8") |
| ![Screenshot 9](https://i.imgur.com/JONAXce.png "Screenshot 9")  |  ![Screenshot 10](https://i.imgur.com/n5N430A.png "Screenshot 10") |

## Discussions And Conclusion
&nbsp; &nbsp; &nbsp; Before beginning work on our project we had already completed several models of the system which allowed us to accurately estimate the time and effort required. We decided which features were required and which could be added later as time permitted, so we felt confident that we would be able to implement the core requirements of our product. Fortunately our planning paid off and our predictions were mostly correct, giving us time to add quality of life features such as color coding and sorting the creature list. We also were able to spend time refining the layout and color scheme of the overall application. Determining the UI design took longer than expected as it was important for us that the app remained as minimalistic and easy-to-use as possible.
<br> &nbsp; &nbsp; &nbsp;Our project was created using Android Studio, which only one of our groups members had experience with, but it also used Java which we had all used in previous classes. This meant that getting started with the development environment took some time as we accustomed ourselves to Android Studio, but we learned quickly from our more experienced group member. Pair programming turned out to be an invaluable tool in developing and debugging the project, with one person writing the code while others would review it in real time. 
<br> &nbsp; &nbsp; &nbsp;We had minimal issues during development, but did run into formatting issues when displaying the database, as well as some logic errors related to the sorting functionality. Some features of Android Studio were unreliable such as the built-in ‘push to GitHub’ feature which caused problems until we decided to push updates manually using Git Bash. There was some uncertainty in our group on how to go about creating the diagrams needed for our project, but we quickly sought clarification from our assigned teacher’s assistant.

## Final Presentation Video:
## Click [Here](https://www.youtube.com/watch?v=-35rdO2JvNw&) to access the video. 

### Statement
##### *All members of our team have helped complete and contribute to this document. All Team members have also reviewed the document to make sure it is to their standards.*
##### Ross Landgraf, Aaron Hong, Nickolas Earles, Cormac Strickland

