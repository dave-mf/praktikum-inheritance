/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_inheritance;

/**
 *
 * @author Dave Maulana Ferros
 */
class Bapak {
        int a;
        int b;
        
        void show_variabel(){
            System.out.println("Nilai a=" + a);
            System.out.println("Nilai b=" + b);
        }
}       
class Anak extends Bapak{
    int c;
    int b;
    int a;
    void show_variabel(){
        System.out.println("Nilai a=" + super.a);
        System.out.println("Nilai b=" + super.b);
        System.out.println("Nilai c=" + c);
    }
}

    public class inheritExample{

        public static void main(String[] args) {

            Bapak objectBapak = new Bapak();
            Anak objectAnak = new Anak();

            objectBapak.a=1;
            objectBapak.b=2;
            System.out.println("Object Bapak (Superclass)");
            
            objectBapak.show_variabel();
            objectAnak.c=5;
            System.out.println("Object Anak (Superclass dari Bapak)");
            objectAnak.show_variabel();
        }
    }

