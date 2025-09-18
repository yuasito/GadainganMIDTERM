class index {
    public Boolean twoChangesInStatus() {
        WorkingDirectory wd = new WorkingDirectory();
        wd.addFile("index.html", "views", "<html>Hello</html>");
        wd.addFile("index.js", "assets/scripts", "alert('Hi!')");
        GitCommands git = new GitCommands(wd);
        // 1. Initialize git workspace
        git.init();
        // 2. Check status
        System.out.println("\n" + git.status());
        boolean output = git.status().equals("You have 2 change/s.\nviews/index.html\nassets/scripts/index.js\n");
        // 3. Add as index
        git.add("views/index.html");
        git.add("assets/scripts/index.js");
        // 4. Check status
        System.out.println("\n" + git.status());
        // 5. Commit
        System.out.println("\n" + git.commit("Added index.html file"));
        // 6. Push
        System.out.println("\n" + git.push());
        return output;
    }

    public Boolean noChangesInStatus() {
        WorkingDirectory wd = new WorkingDirectory();
        GitCommands git = new GitCommands(wd);
        git.init();
        System.out.println("\n" + git.status());
        System.out.println("\n" + git.commit("Added index.html file"));
        System.out.println("\n" + git.push());

        return git.status().equals("You have 0 change/s.\n");
    }

    public static void main(String args[]) {
        index tests = new index();
        boolean testOne = tests.twoChangesInStatus();
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        boolean testTwo = tests.noChangesInStatus();
        System.out.println("-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Test 1: Should return information if has changes in directory");
        System.out.println(testOne ? "- PASSED":"- FAILED");
        System.out.println("Test 2: Should return information if no changes in directory");
        System.out.println(testTwo ? "- PASSED":"- FAILED");
    }
}