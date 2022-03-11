public class DNA {
  // Determines if there is a protein in a strand of DNA
   public static void main(String[] args) {
     String dna1 = "ATGCGATACGCTTGA";
     String dna2 = "ATGCGATACGTGA";
     String dna3 = "ATTAATATGTACTGA";
     String dna = dna2;
       System.out.println(dna.length());
     int start = dna.indexOf("ATG");
     int stop = dna.indexOf("TGA");
       System.out.println(start);
       System.out.println(stop);
     if (start != -1 && stop != -1) {
         System.out.println("Condition 1 and 2 are satisfied.");
         }
     if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
         System.out.println("Condition 1 and 2 and 3 are satisfied.");
         String protein = dna.substring(start, stop+3);
         } else {
           System.out.println("No Protein");
         }
   }
  
 }