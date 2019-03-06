public interface Fly{
  public void goDown();
  public void goForward();
  }
  
  public class Duck implements Fly{
    public void goDown(){
      System.out.println("Duck fly Down");
      }
      public void goForward(){
      System.out.println("Duck fly forward");
      }
   }
   
  public class Finch implements Fly{
    public void goDown(){
      System.out.println("Finch fly Down");
      }
      public void goForward(){
      System.out.println("Finch fly forward");
      }
   }
 
 
 public class Interface{
    public static void main(String[] s){
        Duck duck=new Duck();
        Finch finch=new Finch();
        bird.goDown();
        bird.goForward();
        finch.goDown();
        finch.goForward();
        }
   }
 
