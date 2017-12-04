/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cgpa;
public class bridge {
   protected Exam exam;
   
   public bridge(Exam exam){
      this.exam = exam;
   }
  public Exam getinstance(){
      return exam;
  }
}