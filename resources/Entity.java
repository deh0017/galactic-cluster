import java.io.*

public class Entity{
  //ALL Entities have:
  private String name;
  private int totalHP;
  private int currentHP;
  
  private int atk;
  private int def;
  
  //private Status status;
  
  //private Attribute[] weaknesses;
  //private Attribute[] resistances;
  
  //Only MAJOR Entities have:
  //private Spell[] spells;
  
  //Only PLAYER Entities have:
  //private int totalMP;
  //private int currentMP;
  
  
  public Entity(String newName){
    String filename = "GC/";
    filename.concat(newName);
    filename.concat(".txt");
    
    String line = null;
    BufferedReader bufferedReader = null;
    
    try{
      FileReader fileReader = new FileReader(filename);
      bufferedReader = new bufferedReader(fileReader);
      
      line = bufferedReader.readline();
      name = line;
      
      line = bufferedReader.readline();
      totalHP 
    }
  }
}
