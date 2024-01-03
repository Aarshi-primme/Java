class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor to initialize width, height, and depth
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the volume of the box
    public double volume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two Box objects with different dimensions
        Box mybox1 = new Box(5.0, 4.0, 5.0);
        Box mybox2 = new Box(10.0, 5.0, 4.0);

        // Calculate the volume of each box
        double volume1 = mybox1.volume();
        double volume2 = mybox2.volume();

        // Print the volume of each box
        System.out.println("Volume of mybox1 is " + volume1);
        System.out.println("Volume of mybox2 is " + volume2);

        // Determine which box has the maximum volume
        if (volume1 > volume2) {
            System.out.println("Maximum volume of mybox1 is " + volume1);
        } else if (volume2 > volume1) {
            System.out.println("Maximum volume of mybox2 is " + volume2);
        } else {
            System.out.println("Both boxes have the same volume of " + volume1);
        }
    }
}
