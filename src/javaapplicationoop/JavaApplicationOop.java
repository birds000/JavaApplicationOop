
package javaapplicationoop;


public class JavaApplicationOop {


    public static void main(String[] args) {

           Computer Com1 = new Computer(); 
           Com1.SlotDisk = 4;
           Com1.print();
           System.out.println("Com1.SlotDisk"+Com1.SlotDisk);
           
           Computer Com2 = new Computer();
           Com2.SlotDisk = 7;
           Com2.print();
           System.out.println("Com1.SlotDisk"+Com2.SlotDisk);
           
           Computer Com3 = new Computer();
           Com3.name = "Dell";
           Com3.print();
           
           Monitor Monitor1 = new Monitor();
           Monitor1.On();
           Monitor1.Name = "HP";
           
           Keyboard keyboard1 = new Keyboard();
           keyboard1.CapsLockOff();
           
           Mouse mouse1 = new Mouse();
           mouse1.Wireless = "yes";
           mouse1.print();
        // TODO code application logic here
    }
    
}