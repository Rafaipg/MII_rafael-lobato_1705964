/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp_rafael_1705964;

/**
 *
 * @author feliz
 */
public class Comboio { 
    
// atributos 
    
    public String marca	= "Stadler";
    public int vmax=250;
    private int	velocidade=250;
    protected	boolean	isPortasEsquerdaOpen=false;
    protected	boolean	isPortasDireitaOpen= false;
    public String cor =	"Vermelho";
    protected static int numeroBogies=12;
    public static int numeroPortas=26;
    public boolean isOn	= false;
   
    // metodos
    
    public void	MarchaAtras (int x) {}
    public void	ligar (boolean x){}
     public int getVelocidade(){
    return 0 ; 
    }
     public void setVelocidade(int x){}
     public void setSentido (int x){}
     public int getSentido (){
         return sentido; 
     }
     public boolean getPortasEsquerdaOpen() { 
         return isPortasEsquerdaOpen; }
     public void setPortasEsquerdaOpen (boolean x){}	
     public boolean isPortasDireitaOpen() {
         return isPortasDireitaOpen; }
     public void setPortasDireitaOpen (boolean x){}
     private void setCor (String x){
         cor = x ;
      }
}
