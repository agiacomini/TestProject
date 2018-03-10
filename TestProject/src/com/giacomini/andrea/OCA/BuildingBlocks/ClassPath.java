package com.giacomini.andrea.OCA.BuildingBlocks;

/*
 * N.B: Il "ClassPath" è la locazione di memoria dove la JVM cercherà i file ".class" da eseguire.
 * 
 * 		Quando un file ".java" è stato compilato con successo da linea di comando con il comando "javac nome_file.java"
 * 		verrà creato un secondo file ".class" sempre nella stessa locazione di memoria. 
 * 		Per eseguire il ByteCode ".class" sarà necessario lanciare il comando
 *  
 * 		"java -cp "c:\Users\..." nome_file_senza_estensione [eventuali argomenti]" 
 * 
 * 		dove "-cp" indica l'opzione classpath e "c:\Users\..." è il valore dato all'opzione stessa.
 * 		Il valore dell'opzione "-cp" potrà essere sia un persorso del file system sia un file zip ".jar" 
 * 		in cui cercare la classe che si vuole eseguire. 
 */

public class ClassPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
