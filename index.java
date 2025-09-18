class index {
    public static void main(String args[]){
        WorkingDirectory wd = new WorkingDirectory();
        wd.addFile("index.html", "views", "<html>Hello</html>");
        wd.addFile("index.js", "assets/scripts", "alert('Hi!')");
        GitCommands git = new GitCommands(wd);
        
        //1. Initialize git workspace
        git.init();

        //2. Check status
        // System.out.println("\n" + git.status());

        //3. Add as index
        git.add("views/index.html");

        //4. Check status
        // System.out.println("\n" + git.status());

        //5. Commit
        System.out.println("\n" + git.commit("Added index.html file"));

        //6. Push
        System.out.println("\n" + git.push());
    }
}