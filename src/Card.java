public class Card {
    // values
    int value;
    String name;

    public Card(int value, String name) {
        // use set methods to include checks for invalid values
        setValue(value);
        setName(name);

    }

    // getters and setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 2 && value <= 14) {
            this.value = value;
        } else {
            System.out.println("Invalid Card Value");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("Diamonds")) {
            this.name = "Diamonds";
        } else if (name.equalsIgnoreCase("Hearts")) {
            this.name = "Hearts";
        } else if (name.equalsIgnoreCase("Spades")) {
            this.name = "Spades";
        } else if (name.equalsIgnoreCase("Clubs")) {
            this.name = "Clubs";
        } else {
            System.out.println("Invalid Suit");
        }
    }

    // methods
    public String describe() {
        StringBuilder card = new StringBuilder();
        if (value == 14) {
            card.append("Ace of ");
        } else if (value == 13) {
            card.append("King of ");
        } else if (value == 12) {
            card.append("Queen of ");
        } else if (value == 11) {
            card.append("Jack of ");
        } else {
            card.append(value + " of ");
        }

        if (name.equalsIgnoreCase("Diamonds")) {
            card.append(name);
        } else if (name.equalsIgnoreCase("Hearts")) {
            card.append(name);
        } else if (name.equalsIgnoreCase("Spades")) {
            card.append(name);
        } else if (name.equalsIgnoreCase("Clubs")) {
            card.append(name);
        }
        
        return card.toString();
    
    }

}
