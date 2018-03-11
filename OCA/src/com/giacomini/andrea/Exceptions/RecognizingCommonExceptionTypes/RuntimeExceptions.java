package com.giacomini.andrea.Exceptions.RecognizingCommonExceptionTypes;

/*
 * N.B: Data una eccezione bisogna essere in grado di ricnoscere di che tipo di eccezione si tratta e se è lanciata dalla JVM o dal
 * 		programma.
 * 
 *  	Le eccezioni a run time estendono la classe "RuntimeExcpetion". Queste NON devono essere gestite o dichiarate.
 *  	Possono essere lanciata sia dal programma che dalla JVM.
 *  	Le più comuni sono:
 *  
 *  		- ArithmeticException: lanciate dalla JVM quando il codice tenta per esempio di dividere per zero;
 *  
 *  		- ArrayIndexOutOfBoundException: lanciate dalla JVM quando il codice usa un indice di accesso all'array non permesso;
 *  
 *  		- ClassCastException: lanciata dalla JVM quando si tenta di fare un cast di un oggetto a una sua sotto-classe della
 *  							  quale non è un'istanza;
 *  
 *   		- IllegalArgumentException: lanciata dal programma per indicare che ad un metodo è stato passato un parametro non permesse;
 *   
 *    		- NullPointerExcpetion: lanciata dalla JVM quando c'è un riferimento null dove invece dovrebbe esserci un riferimenro ad
 *    								un'oggetto specifico;
 *    
 *     		- NumberFormatException: lanciata dal programma quando si tenta di convertire una String ad un tipo numerico ma la stringa
 *     								 non ha un appropriato formato;
 *     
 *     ArithmeticException:
 *     Tentare di dividere un "int" per zero porta ad un risultato indefinito. Quando succede questo, la JVM lancia una "ArithmeticException".
 *     
 *      	int answer = 11 / 0;
 *      
 *     Eseguendo questo codice viene ritornato il seguente output:
 *     
 *     		Exception in thread "main" java.lang.ArithmeticException: / by zero
 *     
 *     
 *     
 *     ArrayIndexOutOfBoundException:
 *     Sappiamo che gli indici di un array partono da 0 e arrivano fino a "lenght -1". Per questo motivo il codice seguente 
 *     genererà un "ArrayIndexOutOfBoundException":
 *     
 *     		int[] countsOfMoose = new int[3];		// 0, 1, 2
 *     		System.out.println(countsOfMoose[-1]);
 *     
 *     Questo è un problema perché non si può avere un indice di matrice negativo. Eseguendo il codice si avrà in output:
 *     
 *     		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
 *     
 *     Anche il seguente codice crea un problema di questo tipo:
 *     
 *     		int total = 0;
 *     		int[] countsOfMoose = new int[3];  		// 0, 1, 2
 *     		for (int i = 0 ; i <= countsOfMoose.lenght ; i++){
 *     
 *     			total += countsOfMoose[i];
 *     		}
 *     
 *     Il problema è che il ciclo for dovrebbe avere < invece che <=. Infatti, all'ultima ietrazioneJAVA tenta di chiamare
 *     countsOfMoose[3] che è un'indice invalido. Infatti l'array include solo tre elementi. L'output sarà questo:
 *     
 *     		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
 *     
 *     
 *     
 *     ClassCastException:
 *     JAVA tenta di proteggerci da cast non permessi. Il codice seguente non compila perché Integer non è sotto-classe di 
 *     String:
 *     
 *     		String type = "moose";
 *     		Integer number = (Integer)type;				// NON COMPILA -
 *     
 *     Codice più complicato invece vanifica i tentativi di JAVA di proteggerci:
 *     
 *     		String type = "moose";
 *     		Object obj = type;
 *     		Integer number = (Integer) obj;
 *     
 *     Il compilatore vede un cast da Object a Integer. Questo potrebbe essere anche OK. Il compilatore però non realizza che
 *     c'è una String in quell'oggetto. Quando il codice viene eseguito, si ha il seguente output:
 *     
 *      	Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
 *      
 *      
 *     
 *     IllegalArgumentException:
 *     IllegalArgumentException è un modo per il nostro programma di proteggersi:
 *     
 *     		public void setNumberEggs(int numberEggs){
 *     
 *     			if(numberEggs > 0)
 *     				this.numberEggs = numberEggs;
 *     		}
 *     
 *     Questo codice funziona, ma in realtà non si vuole ignorare la richiesta del chiamante quando passa al metodo un valore
 *     -2. Si vuole dire al chiamante che qualcosa è andato storto, preferibilmente in modo molto evidente in modo che non venga
 *     	ignorato il messaggio e permettere così di fissare il problema. Le eccezioni sono un modo efficiente per fare questo.
 *     Mettere un'eccezione alla fine è un grosso richiamo che qualcosa è sbagliato:
 *     
 *      	public void setNumberEggs(int numberEggs){
 *     
 *     			if(numberEggs < 0)
 *     				throw new IllegalArgumentException(" # eggs must not be negative");		
 *     	
 *     			this.numberEggs = numberEggs;
 *     		}
 *     
 *     Il programma lancia una eccezione quando riceve un valore che non vuole. L'output sarà questo:
 *     
 *     		Exception in thread "main" java.lang.IllegalArgumentException: # eggs must not be negative
 *     
 *     
 *     
 *     NullPointerExcpetion:
 *     Le variabili d'istanza e i metodi devono essere chiamati con riferimenti non nulli. Se invece il riferimento è NULL,
 *     allora la JVM lancerà un "NullPointerExcpetion".
 *     
 *     		String name;
 *     		
 *     		public void printLenght() throws NullPointerExcpetion{
 *     
 *     			System.out.println(name.lenght);
 *     		}
 *     
 *     Eseguendo questo codice l'output sarà:
 *     
 *     		Exception in thread "main" java.lang.NullPointerException
 *     
 *     
 *     
 *     NumberFormatException:
 *     JAVA fornisce metodi per convertire String in numeri. Quando vengono passati valori invalidi, viene lanciata allora una
 *     "NumberFormatException". L'idea è molto simile a quella del "IllegalArgumentException". Dal momento che questo è un
 *     problema comune, JAVA fornisce una classe separata. Infatti, "NumberFormatException" è sotto-classe di "IllegalArgumentException"
 *     Di seguito un sempio di conversione di qualcosa non-numerico in int:
 *     
 *     		Integer.parseInt("abc");				// Autoboxing - converte una String in un Integer;
 *     
 *     L'output è il seguente:
 *     
 *     		Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
 */

public class RuntimeExceptions {

}
