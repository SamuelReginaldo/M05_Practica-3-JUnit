
package myutils;


public class Main {

    
    
    public static void main(String[] args) {
        
        //METODE INVERTEIX
        System.out.println(MyUtils.inverteix("Hola Mundo"));//OdnuM aloH
        System.out.println(MyUtils.inverteix(null));//null
        
        //METODE EDAT
        System.out.println(MyUtils.edat(9, 7, 2004));//18
        System.out.println(MyUtils.edat(1, 1, 1872));//-1
        System.out.println(MyUtils.edat(26, 4, 2023));//-2
        
        // METODE FACTORIAL
        System.out.println(MyUtils.factorial(5));//120
        System.out.println(MyUtils.factorial(-2));//-1
    }
    
}
