package com.giacomini.andrea;

import java.io.FileNotFoundException;

/**
 * Created by Andrea on 10/07/2017.
 */
public class TryCatchBlock {

   /* public static void main(String[] args){

        new TryCatchBlock().testTryCatchBlock();        ERRORE DI COMPIALZIONE: l'eccezione che potrebbe essere lanciata dal meotdo
                                                        "testTryCatchBlock()" non viene gestita (try/catch) e nemmeno rilanciata (trows)
                                                        dal metodo main();
    }*/

    /*public static void main(String[] args) throws Exception{

        new TryCatchBlock().testTryCatchBlock();
    }*/

    /*public static void main(String[] args){

        try{
            new TryCatchBlock().testTryCatchBlock();
            new TryCatchBlock().test2TryCatchBlock();
        } catch(Exception e){

        }
    }*/

    /*public static void main(String[] args) throws Exception{

        try{
            new TryCatchBlock().testTryCatchBlock();
            new TryCatchBlock().test2TryCatchBlock();
        } catch(FileNotFoundException e){

        }
    }*/

    public static void main(String[] args){

        try{
            new TryCatchBlock().testTryCatchBlock();
            new TryCatchBlock().test2TryCatchBlock();
        } catch(FileNotFoundException e){
        } catch(Exception e){}
    }

    /*public static void main(String[] args) throws Exception{

        try{
            new TryCatchBlock().testTryCatchBlock();
        } catch(Exception e){

        }
    }*/

    public void testTryCatchBlock() throws Exception{

        System.out.println("This method could throw an Exception;");
    }

    public void test2TryCatchBlock() throws FileNotFoundException{

        System.out.println("This method could throw an FileNotFoundException;");
    }
}
