package Controller;

import model.Cylinder;
import model.Prism;

public class PrismManager {

	 Prism[] prisms;

	    public PrismManager(int length) {
	        prisms = new Prism[length];
	    }

	    public void setPrism(int index, Prism prism) {
	        this.prisms[index] = prism;
	    }

	    public Prism getPrism(int index) {
	        return prisms[index];
	    }

	    public int getLength() {
	        return prisms.length;
	    }

	    public int getInstanceCount() {
	        int cnt = 0;
	        for (Prism p : prisms) {
	            if (p != null) {
	                cnt++;
	            }
	        }
	        return cnt;
	    }

	    public double getAverageVolume() {
	        int cnt = 0;
	        double volume = 0;
	        for (Prism p : prisms) {
	            if (p != null) {
	                cnt++;
	                volume += p.getVolume();
	            }
	        }
	        return volume / (double) cnt;
	    }

	    public int getCylinderCount() {
	        int cnt = 0;
	        for (Prism p : prisms) {
	            if (p instanceof Cylinder) {
	                cnt++;
	            }
	        }
	        return cnt;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (Prism p : prisms) {
	            sb.append(p + "\n");
	        }
	        return sb.toString();
	    }
	
}
