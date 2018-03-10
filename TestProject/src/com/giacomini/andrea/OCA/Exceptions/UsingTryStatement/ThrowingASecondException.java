package com.giacomini.andrea.OCA.Exceptions.UsingTryStatement;

import java.io.FileReader;
import java.io.IOException;

/*
 * N.B: Fino ad ora, ci siamo limitati ad un solo "try" per singolo esempio.
 * 		Sia il blocco "catch" che il blocco "finally" possono avere qualsiasi tipo di codice JAVA valido - incluso un altro
 * 		blocco "try".
 * 		Il caso più semplice di questo esempio è quando il codice del metodo "read()" non lancia nessuna eccezione. In questo 
 * 		caso l'intero blocco "catch(IOException e)" viene saltato. Un'altro caso è quando il codice del metodo "read()" lancia
 * 		una eccezione "NullPointerExcpetion". Visto che l'eccezione non è una "IOException", anche in questo caso viene saltato
 * 		il blocco "catch(IOException e)".
 * 		Se il codice del metodo "read()" invece lancia una "IOException" il blocco di codice "catch(IOException e)" viene
 * 		eseguito. A questo punto, all'interno del blocco "catch(IOExcpetion e)", si tenta di chiudere il "reader" con l'istruzione
 * 		"reader.close()". Se va tutto bene, il codice completa e il metodo "main()" finisce normalmente. Se invece l'istruzione
 * 		"reader.close()" lancia una eccezione, JAVA cerca un'ulteriore blocco "catch()". Non c'è altro, così il metodo "main()"
 * 		lancia una nuova eccezione. Indipendentemente da ciò, l'eccezione del metodo "read()" viene gestita.
 * 		Un'eccezione diversa potrebbe essere lanciata, ma quella del metodo "read()" è fatta.
 * 		Molti degli esempi che si vedono sulla gestione delle eccezioni nell'esame sono abstract. Usano lettere o numeri per
 * 		essere sicuri di capire il flusso.
 * 
 * 		Questo esempio come che solo l'ultima eccezione viene lanciata: 
 * 
 *  		try{
 *  			throw new RuntimeExcpetion();
 *  		} catch(RuntimeExcpetion e) {
 *  			throw new RuntimeExcpetion();
 *  		} finally {
 *  			throw new Exception();
 *  		}
 *  
 *  	Nel blocco try viene lanciata una "RuntimeException" che viene catturata dal blocco "catch(RuntimeExcpetion e)".
 *  	Il blocco catch a sua volta lancia una "RuntimeExcpetion". Se non ci fosse il blocco "finally", l'eccezione lanciata
 *  	dall'interno del blocco catch() sarebbe quella realmente lanciata. Tuttavia, il blocco "finally" viene eseguito alla fine
 *  	del blocco "catch". Dal momento che il blocco "finally" lancia una sua eccezione, quest'ultima viene effettivamente lanciata.
 *  	L'eccezione del blocco catch invece viene dimenticata. Questo perché spesso si vedono blocchi try/catch dentro ad un blocco
 *  	"finally" - questo per assicurasi che non si mascheri l'eccezione del blocco catch.
 *  
 *   		public String exceptions(){
 *   
 *   			String result = "";
 *   			String v = null;
 *   			try {
 *   			
 *   				try{
 *   
 *   					result += "before";
 *   					v.lenght();
 *   					result += "after";
 *   
 *   				} catch(NullPointerExcpetion e){
 *   
 *   					result += "catch";
 *   					throw new RunTimeExcpetion(); 
 *   
 *   				} finally {
 *   
 *   					result += "finally";
 *   					throw new Exception();
 *   			
 *   				}
 *   
 *   			} catch(Exception e){
 *   				result += "done";
 *   			}
 *   		}
 *   
 *   	Cosa ritorna questo metodo? La risposta è: before catch finally done.
 *   	Tutto il codice è corretto prima di "result += "before"" ma alla riga successiva viene lanciata una "NullPointerException".
 *   	Quindi, la riga "result += "after"" viene saltata e JAVA cerca un blocco catch per gestire l'eccezione "NullPointerException".
 *   	Quindi l'eccezione viene catturata dal blocco "catch(NullPointerExcpetion e)", il quale prima aggiunge alla stringa 
 *   	"result += "catch"" e poi come istruzione successiva lancia una nuova eccezione "RunTimeExcpetion".
 *   	Successivamente al blocco catch viene eseguito il blocco "finally", indipendetmenete dal fatto che sia stata lanciata o meno
 *   	una eccezione. Quidi esegue "result += "finally"".
 *   	A questo punto è stato eseguito per intero tutto il blocco try più interno.
 *   	Per finire il blocco "catch" più esterno vede l'eccezione che è stata lanciata internamente e la cattura eseguendo quindi
 *   	l'istruzione "result += "done"".  
 *   	
 */

public class ThrowingASecondException {

	public static void main(String[] args){
		FileReader reader = null;
		
		try{
			reader = read();
		} catch(IOException e){
			
			try{
				if(reader != null) reader.close();
			} catch(IOException inner){
				
			}
			
		}
	}
	
	private static FileReader read() throws IOException{
		return new FileReader("");
	}
}
