import java.util.Arrays;
public class Sort {
    public static void main(String args[])
    {
    String[] aminoacids={"valine","glycine","alanine","leucine","histidine","tyrosine","phenylalanine","cysteine","asparagine","glutamine","proline","aspartate","tryptophan","methionine","isoleucine","glutamate","serine","threonine","lysine","arginine"};
    Arrays.sort(aminoacids);
    System.out.println(Arrays.toString(aminoacids));
  
    }
}