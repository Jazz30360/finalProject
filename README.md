***
# finalProject

## Table of Contents

1. [Overview](https://github.com/Jazz30360/finalProject/edit/main/README.md#overview)
2. [Product Spec](https://github.com/Jazz30360/finalProject/edit/main/README.md#product-spec)
3. [Wireframes](https://github.com/Jazz30360/finalProject/edit/main/README.md#3-navigation)
4. [Schema](https://github.com/Jazz30360/finalProject#schema)

## Overview


### Description

Allows FAMU students and/or faculty to track the venom shuttles accurately and in real time based
on their current location.

### App Evaluation

- **Category:** Navigation
- **Story:** Tracker follows the location of the venom shuttles in real-time (i.e. when a venom 
shuttle moves, the location of that specific shuttle updates on the map and also moves). Users
can favorite certain stops, arrival and departure times, and destinations.
- **Market:** Any and all members of the FAMU community that need to maneuver the campus.
- **Habit:** This app could be used up to 7 days a week, especially on the weekend (Saturday and
Sunday) by on-campus students as the venom is not as reliable and predictable on these days.
- **Scope:** First the app will have to be tested and optimized for FAMU campus. The app could 
possibly be integrated with the FAMU mobile app so that an additional app won't need to be
downloaded by users. Larger potential for the app would be to incorporate other campuses throughout
Florida and then throughout the country.

## Product Spec


### 1. User Stories (Required and Optional)

#### **Required Must-have Stories**

- [] User must use FAMU credentials to log into app and gain access to the tracker (i.e user must be
an active FAMU student/faculty member)
- [] Home screen needs to display map of all venom shuttles with icons for each shuttle
- [] Each icon should move in real-time based on each shuttle's movement
- [] App will determine closest stop based on current location
- [] Users can create and manipulate a "favorites" list
- [] User can view their profile information and log out
- [] User can view the schedule for each shuttle and see any changes or updates
- [] User must turn-on location permissions

#### **Optional Nice-to-have Stories**

- [] Once user has entered credentials and logged in 1 time, user will have the option to "remember
me;" credentials will be saved for 30 days for faster sign in
- [] Users can share routes with other users
- [] Users can share their ETA based on route currently in progress or a future route
- [] Multiple stops can be added during one route 

### 2. Screens

- Login
  - user logs in with FAMU credentials
- Home Screen/ Main Screen
  - Consists of a map with shuttle icons showing the current locations of running shuttles
  -If no shuttles are online, map will instead be "pixelated" and display a message informing user
that there are currently no shuttles running
  - A list of the users "Favorites" will also be easily accessible from the home screen
- Profile Screen
    - Will contain user information and allow user to logout
    - Also contains preferences (ex light vs dark mode and notification settings)
- Favorites Screen
    - Allows the user to easily edit their "favorites list" (add, delete, re-order etc.)
- Info Screen
    - Allows the university to post relevant updates and information
    - Contains the schedule for each shuttle and any schedule changes/updates
    - Safety/weather updates and information

### 3. Navigation

#### **Tab Navigation** (Tab to Screen)

- Home Screen
- Favorites
- Info
- Profile

#### **Flow Navigation** (Screen to Screen)

- Forced log-in -> automatically connects to/opens famu duo login (in-app) -> asks for 
in-app location permissions if app has never been opened on the device OR alerts user that
location services must be allowed if access was denied
- Home Screen -> displays map and "quick" favorites list
- Favorites -> 2 lists (tabs) one showing favorite stops, the other showing favorite routes
- Info -> read-only display with all pertinent information and updates
- Settings -> clickable list or dropdowns with each category -> personal info -> app settings
-> permissions -> log out


## Wireframes

[Paper Wireframe][1]

[1]: https://github.com/Jazz30360/finalProject/blob/main/Paper%20Wireframe.jpg

## Digital Wireframes & Mockups

[Digital Wireframe pg 1][2]<br>
[Digital Wireframe pg 2][3]<br>
[Digital Wireframe pg 3][4]<br>
[Digital Wireframe pg 4][5]<br>
[Digital Wireframe pg 5][6]<br>
[Digital Wireframe pg 6][7]<br>

[2]: https://github.com/Jazz30360/finalProject/blob/main/Digital%20Wireframes_Page_1.jpg
[3]: https://github.com/Jazz30360/finalProject/blob/main/Digital%20Wireframes_Page_2.jpg
[4]: https://github.com/Jazz30360/finalProject/blob/main/Digital%20Wireframes_Page_3.jpg
[5]: https://github.com/Jazz30360/finalProject/blob/main/Digital%20Wireframes_Page_3.jpg
[6]: https://github.com/Jazz30360/finalProject/blob/main/Digital%20Wireframes_Page_5.jpg
[7]: https://github.com/Jazz30360/finalProject/blob/main/Digital%20Wireframes_Page_6.jpg


## Schema

### Models 

#### Post 

|Property|Type|Description|
|---|---|---|
|currentLocation|Geographical Point|stores the user's current location|
|currentTime|DateTime|current date and time to determine arrivals and departures|
|favoritesList|List|list of users' favorite stops|
|permissionsAreOn|boolean|determines whether the user has their location permission settings on|
|objectId|String|used to store the user's profile information (retrieved from Duo login)|
|shuttleSchedules|ArrayList<String>|schedules for all shuttles|
|closestStop|Geographical Point|closest stop to the user based on current location|

### Networking

#### List of network requests by screen

- Login
  - (Create/POST) 2 factor authentication to login user
- Home Screen/ Main Screen
    - (Read/GET) Favorites list is retrieved to display "quick favorites" list
    - (Create/POST) Map with venom shuttle icons is retrieved from Google Maps and displayed
- Favorites Screen
  - (Create/POST) Empty favorites list generated once user logs in for the first time
  - (Create/PUT) New stop is added to the favorites list
  - (Delete) Stop is removed from favorties list
- Info Screen
    - (Read/GET) Retrieve shuttle schedules to print to screen
    - (Read/GET) Retrieve any changes/updates to print to screen
- Profile Screen
    - (Read/GET) Profile information is retrieved from DUO login API
  
 #### *[IF EXISTS:]* Existing API Endpoints
  
  ##### FAMU Duo Login API
  
  - Base URL - https://api-XXXXXXXX.duosecurity.com
  
  |HTTP Verb|Endpoint|Description|
|---|---|---|
|Get|/ping|detrmines whether duo is running|
|Get|/logo|way to retrieve the stored logo |
|Post|/enroll|provides a way to enroll new users|
|Post|/enroll_status|checks whether a user completes log in|
|Post|/preauth|determines whether a user is authorized to log in|
|Post|/auth|performs 2 factor authentication for the user|


## Milestone III

- [x] Updated status of issues in Project board (2pts)
- [x] Sprint planned for next week (Issues created, assigned & added to project board) (3pts)
- [x] Completed user stories checked-off in README (2pts)
- [x] Gifs created to show build progress and added to README (3pts)
  - Created parse database
  - Created Model skeletons
  - Created DUO Admin account
  - See below:

![](https://github.com/Jazz30360/finalProject/blob/main/Milestone3.gif)

***

**(END)**


