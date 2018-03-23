package com.giacomini.andrea;

/**
 * Created by Andrea on 05/07/2017.
 */
public class LoopTest {

    private int j;
    void show(){

      //int j += 5;                         ERRORE: non è possibile dichiarare e inizializzare in questo modo la variabile sulla stessa riga;
        new forLoop().testForLoop();

    }

    public static void main(String[] args){

        //j = 3;                            ERRORE: una variabile d'istanza non può essere referenziata in un constesto static;

        new LoopTest().show();
    }
}

class ifConstruct{

    private int j = 0;

    public void testIfConstruct(){

        /*
        * COSTRUTTO IF
        * */
        if(false) {                         /*ECCEZIONE rispetto agli altri ERRORI di COMPILAZIONE sui cicli/costrutti di controllo del flusso;*/
            j = 3;
        }
    }
}

class whileLoop{

    private int j = 0;
    boolean f;

    public void testWhileLoop(){

        /*
        * COSTRUTTO WHILE
        * */
        while(j<=5){

            for(int j = 1 ; j <= 5 ; ){

                System.out.println(j + " ");
                j++;
            }

            j++;
        }

        /*while(false){
            j = 3;                          ERRORE di COMPILAZIONE: statement/codice non raggiungibile;
        }*/

        while(f = false){
            j = 3;
        }

        while(f){
            j = 3;
        }
    }

}

class doWhileLoop{

    private int j = 0;
    boolean f = false;

    public void testDoWhileLoop(){

        /*
        * COSTRUTTO DO-WHILE
        * */
        do{
            j = 3;
        } while(false);

        do{
            j = 3;
        } while(f = false);

        do{
            j = 3;
        } while(f);
    }
}

class forLoop{

    private int j = 0;

    public void testForLoop(){

        /*
        * COSTRUTTO FOR
        * */

        /*int i = 0;
        for(int i = 0 ; i < 0 ; i++){     ERRORE di COMPILAZIONE: Non è possibile dichiarare nel ciclo for una variabile ("i") già presente nello scope;
            j = 3;
        }*/

        for(int ii = 0 ; ii < 0 ; ii++){
            j = 3;
        }

        /*for(int y = 0 ; false ; y++){
            j = 3;                          ERRORE di COMPILAZIONE: statement/codice non raggiungibile;
        }*/

        for(int i = 0 ; i < 3 ; System.out.println(++i));
    }
}