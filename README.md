# 🧠 Daily Data Structures and Algorithms Problems and Solutions — LeetCode & GeeksforGeeks

> Solving Data Structures & Algorithms problems every day to sharpen problem-solving skills and prepare for technical interviews at top tech companies.

---

## 👨‍💻 About This Repository

This repository contains my daily solutions to problems from **LeetCode** and **GeeksforGeeks**, organized by topic and difficulty. Each solution includes clean, well-commented code with time and space complexity analysis.

**Goal:** Solve at least 1-2 problems daily and build a strong foundation in DSA for technical interviews.

---

## 📊 Progress Tracker

| Platform | Problems Solved | Profile |
|----------|----------------|---------|
| 🟠 LeetCode | 500+ | (https://leetcode.com/u/Aryanmouli) |
| 🟢 GeeksforGeeks | 300+ | (https://www.geeksforgeeks.org/profile/aryanmov1z0?tab=activity) |
| **Total** | **800+** | |

---

## 📁 Repository Structure

```
DSA-Solutions/
│
├── LeetCode/
│   ├── Arrays/
│   │   ├── Easy/
│   │   ├── Medium/
│   │   └── Hard/
│   ├── Strings/
│   ├── LinkedList/
│   ├── Trees/
│   ├── Graphs/
│   ├── DynamicProgramming/
│   ├── Sorting/
│   ├── BinarySearch/
│   ├── Backtracking/
│   ├── Stack_Queue/
│   └── Heap/
│
├── GeeksforGeeks/
│   ├── Arrays/
│   ├── Strings/
│   ├── LinkedList/
│   ├── Trees/
│   ├── Graphs/
│   ├── DynamicProgramming/
│   └── Sorting/
│
└── README.md
```

---

## 🗂️ Topics Covered

| Topic | LeetCode | GFG | Difficulty |
|-------|----------|-----|------------|
| Arrays | ✅ | ✅ | Easy → Hard |
| Strings | ✅ | ✅ | Easy → Hard |
| Linked List | ✅ | ✅ | Easy → Hard |
| Trees & BST | ✅ | ✅ | Easy → Hard |
| Graphs | ✅ | ✅ | Medium → Hard |
| Dynamic Programming | ✅ | ✅ | Medium → Hard |
| Binary Search | ✅ | ✅ | Easy → Hard |
| Stack & Queue | ✅ | ✅ | Easy → Medium |
| Heap / Priority Queue | ✅ | ✅ | Medium → Hard |
| Backtracking | ✅ | ✅ | Medium → Hard |
| Sorting Algorithms | ✅ | ✅ | Easy → Medium |
| Bit Manipulation | ✅ | ✅ | Easy → Medium |

---

## 📝 Solution Format

Every solution file follows this structure:

```java
/**
 * Problem: Two Sum
 * Platform: LeetCode
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Approach: Hash Map
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## 🔥 Daily Streak

| Month | Problems Solved | Streak |
|-------|----------------|--------|
| June 2026 | Updating daily... | 🔥 Active |
| May 2026 | 30+ | ✅ |
| April 2026 | 30+ | ✅ |

---

## 🏆 Milestones

- [x] 100 Problems Solved
- [x] 250 Problems Solved
- [x] 500 Problems Solved
- [x] 800 Problems Solved
- [ ] 1000 Problems Solved 🎯

---

## 🛠️ Languages Used

- ☕ **Java** — Primary language
- 🐍 **Python** — Secondary language
- ⚡ **C++** — For competitive programming

---

## 📈 LeetCode Stats

![LeetCode Stats](https://leetcode-stats-six.vercel.app/api?username=your-username&theme=dark)

---

## 🔗 Connect With Me

LinkedIn:- https://linkedin.com/in/your-profile
LeetCode:- https://leetcode.com/u/Aryanmouli
GeeksforGeeks:- https://www.geeksforgeeks.org/profile/aryanmov1z0?tab=activity
GitHub:- https://github.com/Aryanch1

---

## ⭐ If this helped you, give it a star!

> *"The only way to get better at algorithms is to solve more problems every single day."*


