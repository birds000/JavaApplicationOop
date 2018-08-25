
package javaapplicationoop;

public class Monitor {
    String Name;
    int Size;
    int Port;
    int Button;
    
    boolean status = false;
    
    public void On(){
        status = true;
        System.out.println("Status = "+status);
        
    }
    
    public void Off(){
        status = false;
        System.out.println("Status = "+status);
        
    }
}
