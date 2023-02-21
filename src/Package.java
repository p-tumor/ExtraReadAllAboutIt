public class Package {
    private Address origin;
    private Address destination;
    private double weightInPounds;
    private int height, width, length;

    public Package(Address origin, Address destination, double weightInPounds, int length, int height, int width) {
        if(weightInPounds < .1) throw new ArithmeticException("Weight of package cannot be less than a tenth of a pound.");
        if((height < 2) || (width < 2) || (length < 2)) throw new ArithmeticException("Dimensions of package cannot be less than 2 inches.");
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

    public double getWeightInPounds() {
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