package incubator;
/**
 * A combination of four snippets to make the "genome"
 * 
 * @author Virginia R Hinson
 *
 */
public class Genome
{
  private int first;
  private int second;
  private int third;
  private int fourth;
  
  public Genome(int one, int two, int three, int four) {
    first = one;
    second = two;
    third = three;
    fourth = four;
  }
  
  public String snippetsToInsert() {
    return Snippet.getSnippet(first) + "\n" + Snippet.getSnippet(second) 
        + "\n" + Snippet.getSnippet(third) + "\n" + Snippet.getSnippet(fourth);
    
  }
  
  public int getFirst() {
    return this.first;
  }
  
  public int getSecond() {
    return this.second;
  }
  
  public int getThird() {
    return this.third;
  }
  
  public int getFourth() {
    return this.fourth;
  }
  
  public static int genomeSize() {
    return 4;
  }

}