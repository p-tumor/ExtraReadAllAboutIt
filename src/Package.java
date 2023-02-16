public class Package {
    private Address origin;
    private Address destination;
    private int weightInPounds;
    private int length;
    private int height;
    private int width;

    public Package(Address origin, Address destination, int weightInPounds, int length, int height, int width) {
        this.origin = origin;
        this.destination = destination;
        this.weightInPounds = weightInPounds;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}