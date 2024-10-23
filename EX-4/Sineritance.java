class a {
    
    public void parent()
    {
        System.out.println("i am parent");
        
    }
}
class b extends a{
            public void child()
            {
               parent();
                System.out.println("iam child class");
            }
       
    
    
}
public class Sinheritance{
    public static void main(String[]args){
        a ob1=new a();
        ob1.parent();
        b ob2=new b();
        ob2.child();
        
    }
}