public class DDA{
    public static void main(String[] args) {
        dda(-2,83,-87,-143);
    }
    public static void dda(float x1, float y1, float x2, float y2) {
        
        float dx,dy,x,y;
        dx=x2-x1;
        dy=y2-y1;
        float m = dy/dx; 
        x=x1;
        y=y1;
        while(x<x2){
            if(m<1&&m>-1){
                x++;
                y+=m;
                System.out.println("m<1&&m>-1");
            }
            
            else{
                y++;
                x+=(1.0/m);
            } 
            
            System.out.println("X = "+Math.round(x)+", Y = "+Math.round(y));
        }
    }
    
}