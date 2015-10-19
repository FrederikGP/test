/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.tester;

/**
 *
 * @author Frederik
 */
public class Box {
    
    // Navngivning af int variabler.
   private int height;
   private int width;
   private int length;
  
    
    
    public Box(){
        //Constructor der sætter int værdierne til 0.
        height = 0;
        width = 0;
        length = 0;
        
    }
    
    public Box(int h,int w, int l){
       height = h;
       width = w;
       length = l;
    }
    
    
    
    //Get metoder, som returnerer height, width og length.
   public int getHeight(){
       return height;
       }
   
   public int getWidth(){
       return width;
       }
   
   public int getLength(){
       return length;
       }
   
   public int getSize(){
       int volume;
      volume = height*width*length;
       
       return volume;
       }
   
   
   
   
   //Set metoder, som sætter height, width og length.
   public void setHeight(int newHeight){
       height = newHeight;
      }
   
   public void setWidth(int newWidth){
       width = newWidth;
      }
    
   public void setLength(int newLength){
       length = newLength;
      }
   
 
   
   @Override
   public String toString(){
       String str="Height:"+"\t"+height+"\n"+"Width:"+"\t"+width+"\n"+"Length:"+"\t"+length+"\n";
       return str;
       
      }
    
}
