package october;

public class Students
{
  private String name ;
  private int roll_number;
  private int std;
  private int age;


  public String getName() 
  {
	return name;
  }
  public void setName(String name) 
  {
	this.name = name;
  }

  public int getRoll_number() 
  {
	return roll_number;
  }
  public void setRoll_number(int roll_number)
  {
	this.roll_number = roll_number;
  }

  public int getStd()
  {
	return std;
  }
  public void setStd(int std)
  {
	this.std = std;
  }

  public int getAge() 
  {
	return age;
  }
  public void setAge(int age)
  {
	this.age=age;
  }

  
  Students(String name , int roll_number , int std , int age)
  {
	this.name=name;
	this.roll_number=roll_number;
	this.std=std;
	this.age=age;
  }

  @Override
  public String toString()
  {
	return "Students [name=" + name + ", roll_number=" + roll_number + ", std=" + std + ",age="+age+ "]";
  }

	

}
