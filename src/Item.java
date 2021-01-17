public class Item extends Object {
    private final String description;

    public Item(int id, String name, String description) {
        super(id, name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
