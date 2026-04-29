
package com.mycompany.practicaandor;




public class PracticaANDOR {

    public static void main(String[] args) {

        int A = 0;
        int B = 0;
        int C = 0;
        int Z = 0;
        
       
        
        if ((B > C && B > Z) || (C > Z && C > B)) //a
                {
                    
                }
        if (!(B > C && B > Z) || !(C > Z && C > B)) //b
                {
                    
                }
        if (!(B > C && B > Z)) //c
                {
                    
                }
        
        if (!(B > C && B > Z) || (C > Z && C > B) || (Z > C && Z > B)) //d
                {
                    
                }
        if (A > B && A > Z && A > C) //e
        {
            
        }
        if (!(A > B && A > Z && A > C)) //f
        {
            
        }
        if (!(A > B && A > Z && A > C) || (B > A && B > Z && B > C) || (Z > B && Z > A && Z > C) || (C > B && C > A && C > Z))
        {
            
        }
    }
}
