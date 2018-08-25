
package javaapplicationoop;


public class Keyboard {
    
    boolean status = false;
    
    public void CapsLockOn(){
        status = true;
        System.out.println("Status CapsLock = " + status);
    }
    
    public void CapsLockOff(){
        status = false;
        System.out.println("Status CapsLock = " + status);
    }
}
