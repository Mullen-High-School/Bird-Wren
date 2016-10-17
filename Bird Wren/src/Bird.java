
public class Bird 
{
  private String name;
  private String sound;
  protected int age;       
  private static int ID;
      
  public Bird() {
    this("","",0);
  }
      
  public Bird(String n, String s, int a){
    name=n; 
    sound=s; 
    age=a;
    ID += 1;
  }
      
  public String getName(){ 
    return name;
  }
  public void setAge(int a){ 
    age = a;
  }
  public int getAge(){ 
    return age;      
  }
  public int getId(){
    return ID;
  }
}