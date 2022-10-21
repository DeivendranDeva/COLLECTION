package october;

public class Laptop_obj 
{
	String brand ;
	int ram;
	int price;
	String os;
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	@Override
	public String toString() {
		return "Laptop_obj [brand=" + brand + ", ram=" + ram + ", price=" + price + ", os=" + os + "]";
	}
	public Laptop_obj(String brand, int ram, int price, String os) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.os = os;
	}
	
}
