public class Resource extends Item {
    private int amount;

    private double value;

    public Resource(int id, String name, String description, int amount) {
        super(id, name, description);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public double getValue() {
        return value;
    }

    public double totalValue() {
        return amount * value;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public String toString() {
        return "Item name: "+ super.getName() +"\nAmount (g): "+ getAmount() +"\nValue/gram: "+
                getValue() +"Total value: "+ totalValue() +"\n"+ super.getDescription() +"\n";
    }
}
