import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Fabolous");
    desertIslandPlaylist.add("50 Cent");
    desertIslandPlaylist.add("Jay Z");
    desertIslandPlaylist.add("Kanye");
    desertIslandPlaylist.add("Pop Smoke");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Fabolous");
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);

    String tempA = "Jay Z";
    
    desertIslandPlaylist.set(0, "Jay Z");
    desertIslandPlaylist.set(1, "50 Cent");
    desertIslandPlaylist.set(2, "Pop Smoke");
    desertIslandPlaylist.set(3, "Kanye");

    System.out.println(desertIslandPlaylist.indexOf("50 Cent"));



  }
  
}