# Git Exercise

### **Task: Git Commands - The `status()` Function**

**Objective:** Your task is to complete the `status()` function within the `GitCommands.java` class. This function should mimic the behavior of the `git status` command, providing information about the current state of the files in the working directory and staging area.

You will be given the `index.java` file, which contains a series of unit tests. These tests are designed to check if your `status()` function works as expected under different scenarios, such as when there are no changes, one change, or multiple changes. Your code is considered complete when all four tests in `index.java` return "PASSED."

-----

### **Getting Started**

1.  **Fork this repository:** Before you begin, you need your own copy of the project. Navigate to the repository page on GitHub and click the **"Fork"** button in the top right corner. This will create a copy of the repository under your own GitHub account.
<img width="1915" height="917" alt="image" src="https://github.com/user-attachments/assets/464dd300-de60-4914-bd57-0b4630702b3b" />

2.  **Clone the repository:** Now that you have your own fork, clone it to your local machine using the `git clone` command. Replace `[your-username]` with your actual GitHub username.

    `git clone https://github.com/[your-username]/[repository-name].git`

3.  **Navigate to the project directory:** Use your terminal to move into the project folder you just cloned.

-----

### **Instructions**

1.  **Analyze the Classes:** Review the provided code for `GitCommands.java` and `index.java`. Pay close attention to the variables you have access to, such as `working_directory.new_changes` (for un-staged files) and `staging` (for staged files).

2.  **Examine the Tests:** Look at the `index.java` file to understand the exact output format the tests are expecting. For example, the `oneChangesInStatus()` test expects the output to be `"You have 1 change/s.\nviews/index.html\n"`. This tells you exactly what string your `status()` function needs to return to pass that test.

3.  **Implement the `status()` Function:** In the `GitCommands.java` file, locate the `status()` function, which is currently empty. Write the necessary Java code to perform the following actions:

      * Combine all files from both the **staging area** (`this.staging`) and the **working directory** (`this.working_directory.new_changes`).
      * Count the total number of unique files.
      * Create a string that matches the format required by the unit tests in `index.java`. The format is: `"You have X change/s.\n"` followed by each file path on a new line.
      * Return this formatted string.

4.  **Run the Program:** Execute the `index.java` file. You should see a series of test results.

5.  **Debug and Refine:** If any of the tests fail, carefully compare your function's output with the expected output in the `index.java` tests. Make adjustments to your code until all tests pass.

    Goodluck and Happy Coding!
