import java.util.Scanner;
public class Circle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the radius");
    int r=sc.nextInt();
    System.out.println("please enter x");
    int cx=sc.nextInt();
    System.out.println("please enter y");
    int cy=sc.nextInt();
    int x=0,y=r;
    int d=1-r;
    int dE=3;
    int dSE=5-(2*r);
    String flag="dE";
    while(x<y){
      System.out.println(x+"\t"+y+"\t"+d+"\t"+flag+"\t"+dE+"\t"+dSE+"\t"+(x+cx)+"\t"+(y+cy));
      if(d<=0){
        flag="dE";
        d=d+dE;
        dE+=2;
        dSE+=2;
      }
      else{
        flag="dSE";
        d+=dSE;
        dE+=2;
        dSE+=4;
        y--;
      }
      x++;
      
    }
  }
}

