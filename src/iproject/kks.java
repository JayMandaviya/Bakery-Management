package iproject;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author smart11
 */

public class kks {
    String Roll,Name;
    public  kks(){
        System.out.println("CONSTRUCTOR CREATED");
    }
    public void input()
    {
        Roll=JOptionPane.showInputDialog("Enter Roll  Number:");
        Name=JOptionPane.showInputDialog("Enter Name:");

    }
    public void Output(){
        System.out.println(Roll);
        System.out.println(Name);}}