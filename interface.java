interface Fly{
  public void goDown();
  public void goForward();
  }
  
   class Duck implements Fly {
    public void goDown(){
      System.out.println("Duck fly Down");
      }

      public void goForward() {
      System.out.println("Duck fly forward");
      }
   }
   
   class Finch implements Fly{
    public void goDown(){
      System.out.println("Finch fly Down");
      }

      public void goForward(){
      System.out.println("Finch fly forward");
      }
   }
 
 
 public class Interface{
    public static void main(String[] args){
        Duck duck=new Duck();
        Finch finch=new Finch();
        duck.goDown();
        duck.goForward();
        finch.goDown();
        finch.goForward();
        }
   }
 
















