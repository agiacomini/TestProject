package com.giacomini.andrea;

import java.io.IOException;

/**
 * Created by Andrea on 10/07/2017.
 */
public class ExceptionClass {

    public String name;

    public void eat() throws NullPointerException {
        throw new NullPointerException();
    }

    public void firstTestExceptionClass() {

        System.out.println("1");
        try {

            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");

        } catch(NullPointerException e){

            System.out.println("4");

        } /*catch(Exception e){

            System.out.println("5");

        }*/

        System.out.println("6");
    }

    public void secondTestExceptionClass() {

        System.out.println("1");
        try {

            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");

        }catch(NullPointerException  e){

            System.out.println("4");

        }catch(NumberFormatException e){

            System.out.println("5");

        }

        System.out.println("6");
    }

    public void thirdTestExceptionClass() {

        System.out.println("1");
        try {

            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");

        }catch(NullPointerException  e){

            System.out.println("4");

        }catch(Exception e){

            System.out.println("5");

        } finally {

            System.out.println("6");
        }

        System.out.println("6A");
    }

    public void fourthTestExceptionClass() {

        System.out.println("1");
        try {

            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");

        }catch(NullPointerException  e){

            System.out.println("4");

        } finally {

            System.out.println("6");
        }

        System.out.println("6A");
    }

    public void fifthTestExceptionClass() throws Exception{

        System.out.println("1");
        try {

            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");

        }catch(NumberFormatException e){

            System.out.println("4");
            //throw new RuntimeException();
            throw new Exception();

        }catch(RuntimeException e){

            System.out.println("5");

        } catch(Exception e){

            System.out.println("5A");
        }

        System.out.println("6");
    }

    public void sixthTestExceptionClass() throws Exception{

        System.out.println("1");
        try{

            System.out.println("2");
            int x = Integer.parseInt(name);

        } catch(NumberFormatException e){

            System.out.println("3");
            throw new Exception("in first catch block");

        } catch(Exception e){

            System.out.println("4");
            throw new RuntimeException("in second catch block");

        } finally{

            System.out.println("5");
            throw new RuntimeException("in finally block");
        }
    }

    public static void main(String[] args) throws Exception{

        ExceptionClass p = new ExceptionClass();
        //p.eat();
        //p.firstTestExceptionClass();

        //p.secondTestExceptionClass();

        //p.thirdTestExceptionClass();

        //p.fourthTestExceptionClass();

        //p.fifthTestExceptionClass();

        p.sixthTestExceptionClass();

        System.out.println("7");

    }
}

class SecondExceptionClass{

    public void firstTestSecondExcpetionClass() throws IOException{

        throw new IOException();

    }

    public void secondTestSecondExcpetionClass(){

        int a = 5, b = 0;
        System.out.println("a/b = " + a/b);

    }

    public void thirdTestSecondExcpetionClass() throws ArrayIndexOutOfBoundsException{  // N.B: è una eccezione "Unchecked"

        String[] s = {"ciao","mondo"};
        System.out.println("s[2]" + s[2]);

    }

    /*public static void main(String[] args){

        SecondExceptionClass s = new SecondExceptionClass();

        s.firstTestSecondExcpetionClass();           ERRORE DI COMPILAZIONE: Il metodo main() non dichiara e non gestisce l'eccezione dichiarata dal
                                                                             metodo "firstTestSecondExcpetionClass()";
    }*/

    /*public static void main(String[] args) throws IOException{

        SecondExceptionClass s = new SecondExceptionClass();

        s.firstTestSecondExcpetionClass();

    }*/

    /*public static void main(String[] args){

        SecondExceptionClass s = new SecondExceptionClass();

        try{

            System.out.println("1");
            s.firstTestSecondExcpetionClass();
            System.out.println("2");

        } catch(IOException e) {

            System.out.println("3");

        } catch(Exception e){

            System.out.println("33A");
        }

        System.out.println("4");
    }*/

    /*public static void main(String[] args){

        SecondExceptionClass s = new SecondExceptionClass();

        try{

            System.out.println("1");
            s.secondTestSecondExcpetionClass();
            System.out.println("2");

        } catch(Exception e){

            System.out.println("33A");
        }

        System.out.println("4");
    }*/

    public static void main(String[] args){

        SecondExceptionClass s = new SecondExceptionClass();

        System.out.println("1");

        s.thirdTestSecondExcpetionClass();

        System.out.println("2");
    }
}

class ThirtdExceptionClass{

    public void test(){
        System.out.println("ciao");
    }
}