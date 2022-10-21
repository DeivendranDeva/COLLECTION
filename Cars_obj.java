package october;

public class Cars_obj 
{
   private String brand ;
   private int wheel;
   private String color;
   private int price;

   public String getBrand() 
   {
	 return brand;
   }
   public void setBrand(String brand) 
   {
	this.brand = brand;
   }
   public int getWheel() {
	return wheel;
   }
   public void setWheel(int wheel) 
   {
	this.wheel = wheel;
   }
   public String getColor() 
   {
	return color;
   }
   public void setColor(String color)
   {
	this.color = color;
   }
   public int getPrice() 
   {
	return price;
   }
   public void setPrice(int priczze)
   {
	this.price = price;
   }

   @Override
   public String toString()
   {
	return "Cars_obj [brand=" + brand + ", wheel=" + wheel + ", color=" + color + ", price=" + price + "]";
   }

   public Cars_obj(String brand, int wheel, String color, int price) 
   {
	this.brand = brand;
	this.wheel = wheel;
	this.color = color;
	this.price = price;
   }

}
