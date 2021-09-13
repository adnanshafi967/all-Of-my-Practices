public class Cyrus{
    public static void main(String[]args){
        double xmin,xmax,ymin,ymax,x0,y0,x1,y1,t,te,tl,Ni,dx,dy;
        xmin =-5;
        xmax=5;
        ymin=-5;
        ymax=5;
        
        x0 =-10;
        y0=-5;
        x1=10;
        y1=5;
        dx= x1-x0;
        dy= y1-y0;
        te=0;
        tl=1;
        System.out.println("Boundary "+ " Ni "+" NiD "+" t "+" PE/PL te tl");
        
//Left
        
        double leftNiD = dx*-1;
        t = -1*((x0-xmin)/dx);
        if(leftNiD<0){
            if(t>te)
                te=t;
            System.out.println("left "+ " (-1,0) "+leftNiD+" "+t+" "+" PE "+ te+" "+tl+" ");
        }
        else{
            if(t<tl)
                tl=t;
            System.out.println("left "+ " (-1,0) "+leftNiD+" "+t+" "+" PL "+ te+" "+tl+" ");
        }
        
        //right
        
        double rightNiD = dx*1;
        t = -1*((x0-xmax)/dx);
        if(rightNiD<0){
            if(t>te)
                te=t;
            System.out.println("Right "+ " (1,0) "+rightNiD+" "+t+" "+" PE "+ te+" "+tl+" ");
        }
        else{
            if(t<tl)
                tl=t;
            System.out.println("Right "+ " (1,0) "+rightNiD+" "+t+" "+" PL "+ te+" "+tl+" ");
        }
        
        //bottom
        
        double bottomNiD = dy*-1;
        t = -1*((y0-ymin)/dy);
        if(bottomNiD<0){
            if(t>te)
                te=t;
            System.out.println("Bottom "+ " (0,-1) "+bottomNiD+" "+t+" "+" PE "+ te+" "+tl+" ");
        }
        else{
            if(t<tl)
                tl=t;
            System.out.println("Bottom "+ " (0,-1) "+bottomNiD+" "+t+" "+" PL "+ te+" "+tl+" "); 
        }
        
        //top
        
        double topNiD = dy*1;
        t = -1*((y0-ymax)/dy);
        if(topNiD<0){
            if(t>te)
                te=t;
            System.out.println("Top "+ " (0,1) "+topNiD+" "+t+" "+" PE "+ te+" "+tl+" ");
        }
        else{
            if(t<tl)
                tl=t;
            System.out.println("Top "+ " (0,1) "+topNiD+" "+t+" "+" PL "+ te+" "+tl+" "); 
        }
        if(te>tl)
            System.out.println("line segmet is outside clip window");
        else{
            double pforTEx = x0+(dx*te);
            double pforTEy = y0+(dy*te);
            System.out.println("p("+te+") = "+" ("+pforTEx+", "+pforTEy+" )");
            double pforTLx = x0+(dx*tl);
            double pforTLy = y0+(dy*tl);
            System.out.println("p("+tl+") = "+" ("+pforTLx+", "+pforTLy+" )");
        }
    }
}