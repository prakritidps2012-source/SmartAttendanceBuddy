# 📄 Smart Attendance Buddy – Submission Document

## 👤 Name
PRAKRITISWARUP SINHA

## 🎓 Branch
CSEDS

---

## 📌 Project Overview

Smart Attendance Buddy is a simple Android application developed to help students calculate their attendance percentage and determine their eligibility status based on predefined academic criteria.

The application focuses on logical implementation, clean structure, and user-friendly result classification.


---

## 🏗 Architecture & Approach

The application follows a basic two-activity architecture:

### 1️⃣ MainActivity

**Responsibilities:**
- Accepts user input:
  - Name  
  - Branch  
  - Subject  
  - Classes Attended  
  - Total Classes  
- Performs input validation to prevent invalid or empty entries  
- Calculates attendance percentage  
- Sends the calculated percentage to ResultActivity using Intent  


### 2️⃣ ResultActivity

**Responsibilities:**
- Receives attendance percentage from MainActivity  
- Applies conditional eligibility logic  
- Displays attendance result along with status classification  
- Uses color indicators for clarity:

  - 🟢 Green → Safe Zone (≥ 75%)  
  - 🟡 Yellow → Warning (60–74%)  
  - 🔴 Red → Danger Zone (< 60%)  


---

## 🔢 Logic Used

Attendance Percentage is calculated using the formula:
