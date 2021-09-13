
import java.util.Scanner;
class MidLine
{

static void midPoint(int X1, int Y1,
                     int X2, int Y2, int zone)
{

    int dx = X2 - X1;
    int dy = Y2 - Y1;
 
    int d = 2*dy - dx;
    int x = X1, y = Y1;
    int NE= 2*(dy - dx);
    int E = 2*dy;
    System.out.println("NE = "+ NE +" E = "+ E+" d = "+ d);
    String n="NE";
    if(d<0)
        n="E";
    System.out.print("x" +"," + "y" + "    " + "d" + "   "+"N/NE" + " orginal "+"\n");
    if (zone==1) {
    	System.out.print(y +"," + x + "    " + d + "   "+n + " " + x + " " + y+ "\n");
    }
    else if (zone==2) {
    	System.out.print((y*-1) +"," + x + "    " + d + "   "+n +" " + x + " " + y+"\n");
    }
    else if (zone==3) {
    	System.out.print((x*-1) +"," + y + "    " + d + "   "+n +" " + x +  " " +y+"\n");
    }
    else if (zone==4) {
    	System.out.print((x*-1) +"," + (y*-1) + "    " + d + "   "+n +" " + x + " " + y+"\n");
    }
    else if (zone==5) {
    	System.out.print((y*-1) +"," + (x*-1) + "    " + d + "   "+n +" " + x + " " + y+"\n");
    }
    else if (zone==6) {
    	System.out.print(y +"," + (x*-1) + "    " + d + "   "+n +" " + x +  " " +y+"\n");
    }
    else if (zone==7) {
    	System.out.print(x +"," + (y*-1) + "    " + d + "   "+n +" " + x + " " + y+"\n");
    }
 
   
    while (x < X2)
    {
        x++;
 
        
        if (d < 0){
            d = d + 2*dy;
            
        }
       
        else
        {
            d = d+ 2*(dy - dx);
            y++;
           
        }
        if(d<0)
            n="E";
        else{
            n="NE";
        }
        if (zone==1) {
        	System.out.print(y +"," + x + "    " + d + "   "+n + " " + x + " " + y+ "\n");
        }
        else if (zone==2) {
        	System.out.print((y*-1) +"," + x + "    " + d + "   "+n +" " + x + " " + y+"\n");
        }
        else if (zone==3) {
        	System.out.print((x*-1) +"," + y + "    " + d + "   "+n +" " + x +  " " +y+"\n");
        }
        else if (zone==4) {
        	System.out.print((x*-1) +"," + (y*-1) + "    " + d + "   "+n +" " + x + " " + y+"\n");
        }
        else if (zone==5) {
        	System.out.print((y*-1) +"," + (x*-1) + "    " + d + "   "+n +" " + x + " " + y+"\n");
        }
        else if (zone==6) {
        	System.out.print(y +"," + (x*-1) + "    " + d + "   "+n +" " + x +  " " +y+"\n");
        }
        else if (zone==7) {
        	System.out.print(x +"," + (y*-1) + "    " + d + "   "+n +" " + x + " " + y+"\n");
        }
    }
}
 
static int findZone(int X1, int Y1,int X2, int Y2) {
	int dx = X2 - X1;
    int dy = Y2 - Y1;
    
    if(dx>0 && dy>0 && dx>dy) 
    {
    	return 0;
    }
    else if(dx>0 && dy>0 && dx<dy) {
    	return 1;
    }
    else if(dx<0 && dy>0 && dy>(-1*dx)) {
    	return 2;
    }
    else if(dx<0 && dy>0 && dy<(-1*dx)) {
    	return 3;
    }
    else if(dx<0 && dy<0 && (dy*-1)<(-1*dx)) {
    	return 4;
    }
    else if(dx<0 && dy<0 && (dy*-1)>(-1*dx)) {
    	return 5;
    }
    else if(dx>0 && dy<0 && (dy*-1)>dx) {
    	return 6;
    }
    else if(dx>0 && dy<0 && (dy*-1)<dx) {
    	return 7;
    }
    return 0;
}

public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
  
    int X1, Y1 , X2 , Y2;
    System.out.println("Input X1");
    X1=sc.nextInt();
    System.out.println("Input Y1");
    Y1=sc.nextInt();
    System.out.println("Input X2");
    X2=sc.nextInt();
    System.out.println("Input Y2");
    Y2=sc.nextInt();
    int zone = findZone(X1, Y1, X2, Y2);
    if (zone==1) {
    	int temp1 = X1;
    	X1 = Y1; 
    	Y1 = temp1;
    	int temp2 = X2;
    	X2 = Y2;
    	Y2 = temp2;
    }
    else if (zone==2) {
    	int temp1 = X1;
    	X1 = Y1; 
    	Y1 = -1*temp1;
    	int temp2 = X2;
    	X2 = Y2;
    	Y2 = -1*temp2;
    }
    else if (zone==3) {
    	X1=X1*-1;
    	X2=X2*-1;
    }
    else if (zone==4) {
    	X1=X1*-1;
    	X2=X2*-1;
    	Y1=Y1*-1;
    	Y2=Y2*-1;
    }
    else if (zone==5) {
    	int temp1 = X1;
    	X1 = Y1*-1; 
    	Y1 = -1*temp1;
    	int temp2 = X2;
    	X2 = Y2*-1;
    	Y2 = -1*temp2;
    }
    else if (zone==6) {
    	int temp1 = X1;
    	X1 = Y1*-1; 
    	Y1 = temp1;
    	int temp2 = X2;
    	X2 = Y2*-1;
    	Y2 = temp2;
    }
    else if (zone==7) {
    	Y1=Y1*-1;
    	Y2=Y2*-1;
    }
    System.out.println("Zone = "+ zone);
    midPoint(X1, Y1, X2, Y2, zone);
    
}
}