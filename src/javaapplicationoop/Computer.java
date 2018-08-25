/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationoop;

/**
 *
 * @author Filver L Believe
 */
public class Computer {
    
    String name;
    
    int SlotRam = 4;
    int SlotGpu = 1;
    int SlotCpu = 1;
    int SlotDisk = 2;
    
    public void print(){
        System.out.println("a = " + name + "  SlotRam = "+ SlotRam +" SlotGup = "+ SlotGpu+" SlotCpu = "+ SlotCpu +" SlotHaedick = "+ SlotDisk);
        
    }

    void On() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
