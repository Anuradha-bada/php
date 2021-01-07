public class Hello
{
  public static void main
  {
    Properties prop=new Properties();
    FileInputStream ip= new FileInputStream(“php/config.properties”);
    prop.load(ip);
    out.println(prop.getProperty(“key1”));
  }
}