# Smart Attendance Buddy

## Overview
Smart Attendance Buddy is a simple Android application that calculates student attendance percentage and displays eligibility status.

## Logic
Attendance Percentage = (Classes Attended / Total Classes) * 100

Eligibility Rules:
- >= 75% → Safe Zone
- 60–74% → Warning
- < 60% → Danger Zone

## Features
- Attendance calculation
- Eligibility classification
- Color-coded result display
- Input validation

## Architecture
- Language: Kotlin
- Two Activities: MainActivity and ResultActivity
- Data passed using Intent

## Future Improvements
- RecyclerView for multiple subjects
- SharedPreferences for persistence
- Improved UI using XML layouts

## Detailed Documentation

For complete project explanation and architectural details, please refer to:

➡️ [Project Documentation](Project_Documentation.md)
