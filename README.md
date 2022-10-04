***
# finalProject

# Table of Contents

1. [Overview](https://github.com/Jazz30360/finalProject/edit/main/README.md#overview)
2. [Product Spec](https://github.com/Jazz30360/finalProject/edit/main/README.md#product-spec)
3. [Wireframes](https://github.com/Jazz30360/finalProject/edit/main/README.md#3-navigation)

# Overview


## Description

Allows FAMU students and/or faculty to track the venom shuttles accurately and in real time based
on their current location.

## App Evaluation

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

# Product Spec


## 1. User Stories (Required and Optional)

### **Required Must-have Stories**

- User must use FAMU credentials to log into app and gain access to the tracker (i.e user must be
an active FAMU student/faculty member)
- Home screen needs to display map of all venom shuttles with icons for each shuttle
- Each icon should move in real-time based on each shuttle's movement
- Users can create and manipulate a "favorites" list
- User can view their profile information and log out
- User can view the schedule for each shuttle and see any changes or updates

### **Optional Nice-to-have Stories**

- Once user has entered credentials and logged in 1 time, user will have the option to "remember
me;" credentials will be saved for 30 days for faster sign in
- Users can share routes with other users
- Users can share their ETA based on route currently in progress or a future route
- Multiple stops can be added during one route 

## 2. Screens

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

## 3. Navigation

#### **Tab Navigation**

- Home Screen
- Favorites
- Info
- Profile

#### **Flow Navigation**

- Forced log-in -> automatically connects to/opens famu duo login (in-app) -> asks for 
in-app location permissions if app has never been opened on the device OR alerts user that
location services must be allowed if access was denied
- Home Screen -> displays map and "quick" favorites list
- Favorites -> 2 lists (tabs) one showing favorite stops, the other showing favorite routes
- Info -> read-only display with all pertinent information and updates
- Settings -> clickable list or dropdowns with each category -> personal info -> app settings
-> permissions -> log out


# Wireframes


# Digital Wireframes & Mockups


***

**(END)**


