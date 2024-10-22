




 class guest
 {

    public void read()
    {
    
        System.out.println("this is guest login");
    }
    }
class dev extends guest{

public  void write(){
System.out.println("this is developer login");

}


}
class admin extends dev{

public void show(){
    System.out.println("this is admin login");
}
@Override
public void read(){
    super.read();
    System.out.println("i am the admin to the database");
}


}
public class inheritance {
    public static void main(String[] args) {
        guest g=new guest();
        dev d=new dev();
        admin a=new admin();
        g.read();
        d.read();
        d.write();
        a.read();
        a.write();
        a.show();
       
}
}
