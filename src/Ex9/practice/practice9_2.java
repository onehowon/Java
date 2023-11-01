public class practice9_2{
    public static void main(String[] args){
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?"+(p1==p2));
        System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
    }
}

class Point3D{
    int x, y, z;
    
    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    Point3D(){
        this(0,0,0);
    }
    
    public boolean equals(Object obj){
       Point3D p3 = (Point3D)obj;
        if(p3.x == x && p3.y == y && p3.z == z)
            return true;
        else return false;
    }
    
    public String toString(){
        return"["+x+","+y+","+z+"]";
    }
}