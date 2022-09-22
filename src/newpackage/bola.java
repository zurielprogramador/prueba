/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Zuriel PC
 */
public class bola  {
    private Color color;
    private int x;
    private int y;
    private int dir;
    private final int VEL=5;
     private final int TAM=150;
    
    public bola(Color color,int x, int y){
        this.color= color;
        this.x=x;
        this.y=y;
        dir=1;
    
    }
     void pintar(Graphics g) {
         g.setColor(color);
         g.fillOval(x, y, 150, 150);
     }
     public void mover() {
       if(dir==0){
           y+=VEL;
       }else if(dir==1){
           y-=VEL;
       }else if(dir==2){
           x+=VEL;
       }else if(dir==3){
           x-=VEL;
       }else if(dir==4){
           x+=VEL;
           y+=VEL;
       }else if(dir==5){
           x-=VEL;
           y-=VEL;
    }else if(dir==6){
           x-=VEL;
           y+=VEL;
     }else if(dir==7){
           x+=VEL;
           y-=VEL;
     }}

    public void rebotar(int limX, int limY) {
        if (y<=0){
            int nr=(int)(Math.random()*3)+1;
           
            dir=nr==1 ? 6: nr==2  ? 0: 4;
        }else if (x<=0){
            int nr=(int)(Math.random()*3)+1;
        
            dir=nr==1 ? 7: nr==2  ? 2: 4;
           
        }else if (y>=limY-TAM){
            int nr=(int)(Math.random()*3)+1;
        
            dir=nr==1 ? 5: nr==2  ? 1: 7;
        }else if (x>=limX-TAM){
            int nr=(int)(Math.random()*3)+1;
        
            dir=nr==1 ? 6: nr==2  ? 3: 7;
        }
            
        }
      
    
     
    public Color getColor(){
        return color;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
     public void setY(int y){
        this.x=x;
     }
       public int getDIR(){
        return dir;
       }
        public void setDir(int dir){
        this.dir=dir;
        }
       
     
    public void setColor(Color color){
        this.color=color;
    }

    void rebotar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void rebotar(int width) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }

   
        
    
