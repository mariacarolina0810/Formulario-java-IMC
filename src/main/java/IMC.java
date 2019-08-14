/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class IMC {
   
     public  IMC(){  
    }
    public double resultadoIMC( double peso, double estatura){
    double resultado=peso/Math.pow(estatura,2);
    return resultado;          
     }
    public String obesIMC(double imc){
    String diagnostico="";
    if(imc<15){
    diagnostico= "delgadez muy severa";
        
    }
    else if (imc<=15.9){
        diagnostico="delgadez severa";
    }
    else if (imc<=18.4){
        diagnostico="delgadez";
    }
      else if (imc<=24.9){
        diagnostico="peso saludable";
    }
      else if (imc< 30){
        diagnostico="sobre peso";
    }
      else if (imc< 40){
        diagnostico="obesidad severa";
    }
      else if (imc<40){
        diagnostico="obesidad morvita";
    }
      else{
          diagnostico="Obesidad morvita";
      }
     return diagnostico ;   
}
}



