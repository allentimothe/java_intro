package Language;

class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String names, int numberOfSpeakers, String rgnsSpoken, String wrdOrder){
  this.name = names;
  this.numSpeakers = numberOfSpeakers;
  this.regionsSpoken = rgnsSpoken;
  this.wordOrder = wrdOrder;
}

public void getInfo(){
  System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + "." + "\n" +
"The language follows the word order: " + this.wordOrder + ".");
}


public static void main(String[] args){
    Language chontal = new Mayan("Chontal", 36810);
    chontal.getInfo();
    Language wuu = new SinoTibetan("WUU", 80000000);
    wuu.getInfo();
    Language sinitic = new SinoTibetan("Sinitic", 1300000000);
    sinitic.getInfo();
  }
}