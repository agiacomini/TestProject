package com.giacomini.andrea.OCA.ClassDesign.ExamEssential;

public class Notes {

	/*
	 * N.B: Questo capitolo ha preso le basi delle strutture di classe presentate nel capitolo "MethodsAndEncapsulation" e le
	 * 		ha espensa introducendo la nozione di ereditarietà. Le classi JAVA seguono un pattern di ereditarietà singola a 
	 * 		multi-livello nel quale ogni singola classe ha esattamente una classe parent diretta, con tutte le classi che alla fine
	 * 		ereditano da "java.lang.Object". Le interfacce JAVA simulano una forma limitata di ereditarietà multipla, dal momento
	 * 		che le classi JAVA possono implementare interfacce multiple. 
	 * 		Ereditare una classe dà l'accesso a tutti i metodi PUBLIC e PROTECTED della classe, ma esistono regole speciali da seguire 
	 * 		per i costruttori e l'overriding dei metodi affinchè il codice compili. Per esempio, se una classe parent non include
	 * 		un costruttore senza argomenti, una chiamata esplicita al costruttore parent deve essere fornita nel costruttore della
	 * 		classe figlia. Fare attenzione all'esame a qualsiasi classe che definisce un costruttore con argomenti ma non definisce
	 * 		un costruttore senza argomenti.
	 * 		Si è rivisto anche l'overloaded, l'overridden, i metodi nascosti e come differiscono specialmente in termini di
	 * 		polimorfismo. Si è introdotto anche il concetto di variabile nascosta anche se si scoraggia l'uso in quanto porta
	 * 		a cunfusione e a difficoltà nel mantenimento del codice.
	 * 		E' stata introdotta la classe abstract e le interfacce e si è mostrato come si possono usarle per definire una
	 * 		piattaforma per gli altri sviluppatori per interagire con esse. Per definizione, un tipo abstract non può essere
	 * 		istanziato direttamente e richiede una sotto-classe concreta per essere usata. Dal momento che i metodi d'interfaccia
	 * 		STATIC e DEFAULT sono nuovi in JAVA 8, ci si aspetta almeno una domanda su di loro all'esame.
	 * 		Infine, è stato introdotto il concetto di POLIMORFISMO, centrale nel linguaggio JAVA, e si è mostrato come gli oggetti
	 * 		possono essere acceduti in varie forme. Assicurarsi di aver capito quando il cast è necessario per accedere agli oggetti,
	 * 		ed essere in grado di riconoscere la differenza tra i problemi di cast a compile-time e run-time.
	 *      
	 * 
	 * 		Note per l'esame:
	 * 			- Essere in grado di scrivere codice che estende altre classi. Una classe JAVA che estende un'altra classe
	 * 			  eredita tutti i suoi metodi e variabili PUBLIC e PROTECTED. La prima riga di ogni costruttore è una chiamata
	 * 			  ad un'altro costruttore all'interno della stessa classe usando "this()" oppure una chiamata ad un costruttore
	 * 			  della classe parent usando "super()". Se nella classe parent non esiste un costruttore senza argomenti allora
	 * 			  sarà necessaria una chiamata esplicita ad uno degli altri costruttori della classe parent. I metodi parent e 
	 * 			  le variabili d'istanza della classe parent devono essere acceduti tramite la parola chiave super. 
	 * 			  Infine, tutte le classi JAVA estendono "java-lang.Object" direttamente o tramite una super-classe;
	 * 
	 * 			- Conoscere le regole dell'overriding dei metodi. Il compilatore JAVA permette ai metodi di essere overriden nella
	 * 			  sotto-classe se certe regole sono seguite: un metodo deve avere la stessa firma, essere accedibile almeno o più
	 * 			  del metodo parent, non è possibile dichiarare una nuova oppure più ampia eccezione e il valore di ritorno deve
	 * 			  seguire la regola delle covarianti;
	 * 
	 *      	- Conoscere le regole per nascontere metodi e variabili. Quando un metodo STATIC è richieato in una sotto-classe,
	 *      	  viene referenziato come un metodo nascosto (hidden). Allo stesso modo, una variabile è nascosta quando il nome
	 *      	  della variabile è riusato in una sotto-classe. In entrambe le situazioni, il metodo originale o la variabile
	 *      	  continuano ad esistere e vengono usate nei metodi che referenziano l'oggetto nella classe parent. Per i metodi
	 *      	  nascosti, l'uso di STATIC nella dichiarazione del metodo deve essere la stessa sia nella classe parent che nella
	 *      	  classe figlia. Infine, sia le variabili che i metodi nascosti dovrebbero essere evitati dal momento che portano
	 *      	  confusione;
	 *      	
	 *      	- Riconoscere le differenze tra l'overloading e l'overriding dei metodi. Sia l'overloading che l'overriding implicano
	 *      	  la creazione di un nuovo metodo con lo stesso nome di un metodo esistente. Quando la firma del metodo è la
	 *      	  stessa, viene referenziato come overriding del metodo e deve seguire un preciso insieme di regole affinchè il codie
	 *      	  compili. Qunado invece la firma è differente, stesso nome ma parametri di input differenti, è referenziato
	 *      	  come overloading del metodo e nessuna delle regole dell'overriding è richiesta;
	 *      
	 *         	- Essere in grado di scrivere codice che crea o estende una classe abstract. In JAVA, una classe o un metodo
	 *         	  possono essere dichiarati come abstract. Le classi abstract NON possono essere istanziate e richiedono una sotto-classe
	 *         	  concreta per essere accedute. Una classe abstract può includere zero o più metodi sia abstract che non abstract.
	 *         	  I metodi abstract seguono tutte le regole dell'overriding dei metodi e possono essere definiti solo all'interno
	 *         	  di classi abstract. La prima sotto-classe concreta di una classe abstract può implementare tutti i metodi
	 *         	  ereditati. Sia le classi che i metodi abstract NON devono essere marcati come FINAL o PRIVATE;
	 *         
	 *         - Essere in grado di scrivere codice che crea, estende e implementa interfacce. Le interfacce sono simili ad una
	 *         	 classe abstract specializzata nella quale solo i metodi abstract e le variabili costanti STATIC FINAL sono permessi.
	 *         	 Dalla versione 8 di JAVA, le interfacce possono definire metodi default e static con un loro corpo. Tutti i membri
	 *         	 di una interfaccia si assume siano tutti PUBLIC. I metodi di una interfaccia si assume siano abstract se non è 
	 *         	 specificato nessu marcatore DEFAULT o STATIC. Un'interfaccia che estende un'altra interfaccia eredita tutti i suoi
	 *         	 metodi abstract. Un'interfaccia non può estendere una classe e nemmeno una classe può estendere un'interfaccia.
	 *         	 Infine, una classe può implementare qualsiasi numero di interfacce;
	 *         
	 *         - Essere in grado di scrivere codice che usa metodi d'interfaccia DEFAULT e STATIC. Un metodo default permette ad uno
	 *           sviluppatore di aggiungere un nuovo metodo ad un'interfaccia usando un'implementazione esistente, senza forzare
	 *           gli altri sviluppatori che già usano quell'interfaccia a ricompilare il codice. Uno sviluppatore che usa quell'interfaccia
	 *           può decidere di overriding quel meotodo oppure usare l'implementazione di deafult. Un metodo static in una
	 *           interfaccia segue le stesse regole di un metodo static in una classe;
	 *           
	 *         - Comprendere il POLIMORFISMO. Un'oggetto in JAVA può prendere una varietà di forme, in parte a seconda del tipo
	 *           di riferimento usato per accedere all'oggetto. I metodi che sono overridden saranno sostituiti ovunque sono usati
	 *           , mentre i metodi e le variabili che sono nascosti saranno sostituiti solo nelle classi e sotto-classi nelle quali
	 *           sono definiti. E' comune affidarsi ai parametri polimorfici - l'abilità dei metodi di essere automaticamente passati
	 *           come un riferimento di super-classe o interfaccia - quando si creano definizioni di metodi;
	 *           
	 *         - Riconoscere i cast di riferimenti validi. Un'istanza può essere automaticamente castata a un riferimento di super-classe 
	 *         	 o a un riferimento d'interfaccia senza un esplictio cast. Alternativamente, un'esplicto cast è richiesto se il riferimento
	 *         	 è stato ridotto a una sotto-classe dell'oggetto. Il compilatore JAVA non permette cast tra tipi non correlati.
	 *         	 Si dovrebbe essere in grado di discernere tra errori di cast a compile-time e quelli che non accadono fino al momento
	 *         	 dell'esecuzione (run-time) e che lanceranno l'eccezione "ClassCastException";   
	 */
	
}
