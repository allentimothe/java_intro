import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> allensToDos = new ArrayList<String>();

    allensToDos.add("code");
    allensToDos.add("crud");
    allensToDos.add("create rest api");
    allensToDos.set(1, "work");
    allensToDos.remove("create rest api");

    System.out.println(allensToDos.size());
    System.out.println(allensToDos.get(1));
    System.out.println(allensToDos.indexOf("code"));
  }
}

// Common Practices for ARRAY LIST