package CedrickProgram.Java_Tesda.SampleCode.Java_Objects.DiceSample;

class Die
{
   private final int MAX = 6;  // maximum face value
   private int faceValue;  // current value showing on the die
   // Alternate Constructor
   
  public Die(int value)
   {
      faceValue = value;
   }
  public Die()
   {
      faceValue = this.roll();
   }
  
  public int roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1;

      return faceValue;
   }
  
   public void setFaceValue (int value)
   {
      faceValue = value;
   }

   public int getFaceValue()
   {
      return faceValue;
   }
// Returns a string representation of this die. 
    public String toString() 
      { 
             String result = Integer.toString(faceValue); 
             return result; 
        } 

}


public class Dice {

    public static void main (String[] args)
   {
      Die die1, die2, die3;
      int sum;
      die1 = new Die();
      die2 = new Die();
      die3 = new Die(4);

      // System.out.println("Die 1 :" + die1.roll());
      // die2.setFaceValue(4);
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2+ ", Die Three: " + die3);
     
      sum = die1.getFaceValue() + die2.getFaceValue()+die3.getFaceValue();
      System.out.println ("Sum: " + sum);
      
      

// What happens if we change faceValue to public
// and then do die3.faceValue = 2; System.out.println("Die Two : " + die2.getFaceValue());


   }
    
}
