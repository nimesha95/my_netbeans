/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keylogger;

import java.awt.KeyboardFocusManager;
import KeyDispatcher.java;
/**
 *
 * @author Nimesha
 */
public class Keylogger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hijack the keyboard manager
KeyboardFocusManager manager =
         KeyboardFocusManager.getCurrentKeyboardFocusManager();
manager.addKeyEventDispatcher( new KeyDispatcher() {} );
}
