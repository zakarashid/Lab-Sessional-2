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
public class admin {
   
    public Double result;
    sub1 obj=new sub1();
     sub2 obj1=new sub2();
      sub3 obj2=new sub3();
    public void calculatecgpa(){
   
           
     Double sub1=obj.getgpa();
          
     Double sub2=obj1.getgpa();

     Double sub3=obj2.getgpa();
        System.out.println("Subject1 "+sub1);
        System.out.println("Subject2 "+sub2);
        System.out.println("Subject3 "+sub3);
    
    }
    public void setgpa(int subnum,double gpa){
        if(subnum==1){
        
            obj.setgpa(gpa);
            calculatecgpa();
        }
        else if(subnum==2){
       
            obj.setgpa(gpa);
            calculatecgpa();
        }
        else{
           
            obj.setgpa(gpa);
             calculatecgpa();
        }
    }
    
      
}
