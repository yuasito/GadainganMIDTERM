import java.util.ArrayList;
class WorkingDirectory {
    int file_id = 1;
    ArrayList<String> files = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> location = new ArrayList<>();
    ArrayList<String> content = new ArrayList<>();
    ArrayList<String> new_changes = new ArrayList<>();
    
    // Command: touch <filename>
    public void addFile(String name, String location, String content) {
        String path_file = location +"/"+name;
        this.files.add(path_file);
        this.names.add(name);
        this.location.add(location);
        this.content.add(content);
        this.new_changes.add(path_file);
    }
}