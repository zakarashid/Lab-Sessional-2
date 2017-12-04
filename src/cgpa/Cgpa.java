/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;

/**
 *
 * @author fa14-bse-109
 */
public class Cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       bridge Object=new bridge(new sub1());
       bridge object2=new bridge(new sub2());
       bridge object3=new bridge(new sub3());
              admin obj222=new admin();
       
       Exam obj22=Object.getinstance();
       Exam obj23=object2.getinstance();
       Exam obj24=object3.getinstance();
         
     
       obj222.calculatecgpa();
        System.out.println("after changes");
         obj222.setgpa(1,3.66);
       

    }
    
}
