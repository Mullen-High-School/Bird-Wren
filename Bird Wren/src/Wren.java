public class Wren extends Bird 
{
  private String name;
  
  public Wren(String n) {
    super("Wren", "cheery", 0);
    name = n;
  }
  public Wren(String n, String s, int a) {
    super("Wren", s, 6);
    name = n;
  }  
  public void setName(String n)      { 
    name = n;
  }
  public String getName(){
    return name;
  }
  public void setAge(int a){ 
    setAge(a);
  }
}