
public class Car {
     private int modelNo;  // 4 bytes
     private String carName;  // 
     private String carColor;
   
     public Car() // Default constructor
     {
    	 System.out.println(" Inside Default Constructor");
    	 modelNo = 00;
    	 carName = "NA";
    	 carColor = "NA";
    	 
     }
     
	 public int getModelNo() {
		 return modelNo;
	 }
	 public void setModelNo(int modelNo) {
		 this.modelNo = modelNo;
	 }
	 public String getCarName() {
		 return carName;
	 }
	 public void setCarName(String carName) {
		 this.carName = carName;
	 }
	 public String getCarColor() {
		 return carColor;
	 }
	 public void setCarColor(String carColor) {
		 this.carColor = carColor;
	 }
     
     
     
}
