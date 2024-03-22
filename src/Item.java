import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Item {

    private static int lastId = 0;
    private static final formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    private int id;
    private String title;
    private String description;
    private LocalDate dateReceived;

    private Item(String title, String dateReceived){

    }

    public void setId(int num) {
        this.id = num;
    }

    public void setTitle(String name) throws Exception {
        this.title = name.trim();

        if (title.isEmpty())
            throw new Exception("Title cannot be blank.");

        this.title = name;
    }

    public void setDescription(String desc){
        this.title = desc.trim();
    }

    public void setDateReceived(String date){
        this.dateAdded = date;
    }

    public String getTitle(){
        return this.title;
    }

    public int getId(){
        return this.id;
    }

    public String getDescription(){
        return this.description;
    }

    public String getDateAdded(){
        return this.dateAdded;
    }

}
