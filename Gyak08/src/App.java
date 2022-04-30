import Controller.PrismManager;
import model.Cylinder;
import model.Rectangle;

public class App {

	public static void main(String[] args) {
        PrismManager prismManager = new PrismManager(5);
        prismManager.setPrism(0, new Cylinder(5, 7.2));
        prismManager.setPrism(1, new Rectangle(2, 4, 12));
        prismManager.setPrism(4, new Cylinder(6.6, 3.9));
        System.out.println(prismManager);
        System.out.println("Managed array length: " + prismManager.getLength());
        System.out.println("Instances stored in managed array: " + prismManager.getInstanceCount());
        System.out.println("Cylinders stored in managed array: " + prismManager.getCylinderCount());
        System.out.println("Average volume in managed array: " + prismManager.getAverageVolume());
    }
}
