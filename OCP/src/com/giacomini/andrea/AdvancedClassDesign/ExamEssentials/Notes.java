package com.giacomini.andrea.AdvancedClassDesign.ExamEssentials;

/*
 * N.B: La parola chiave "instaceof" confronta un oggetto e un tipo di classe o un tipo di interfaccia. Inoltre controlla tra
 * 		le stto-classi e le sotto-interfaccia. "x instanceof Object" ritorna TRUE tranne quando "x" vale null. Se il compilatore
 * 		determinare che non c'è modo che "instanceof" ritorni TRUE allora genera un errore di compilazione.
 * 		L'invocazione di metodi virtuali significa che Java controllerà nelle sotto-classi alla ricerca del metodo da richiamare.
 * 		Questo succede anche dall'interno di un metodo della super-classe. 
 * 		I metodi "toString()", "equals()" e "hashCode()" ereditati di defualt dalla classe padre Object, da cui ereditato tutte
 * 		le classi, possono essere overridati al fine di combiarne il comportamento. Il metodo "toString()" viene usato per fornire
 * 		una rappresentazione più facilmente compresibile dal programmatore della classe in cui si stà eseguendo l'ovverriding del
 * 		metodo. Il metodo "equals()" è usato per specificare quale variabile d'istanza dovrebbe essere considerata per l'uguaglianza.
 * 		"equals()" ritorna FALSE quando l'oggetto passato è null o quando è di tipo sbagliato. Il metodo "hashCode()" è usato per
 * 		fornire un raggruppamento in categorie. "hasCode()" ritorna lo stesso numero quando chiamato con oggetti che sono uguali.
 * 		La parola chiave "enum" serve per i valori enumerati o per una lista di valori. Enums possono essere usati in uno
 * 		"switch" statement. Non sono valori int e non possono essere confrontati con i valori int. In uno switch, il valore
 * 		enum è poszionato nella clausola case del costrutto. Negli Enums è permesso avere variabili d'istanza, costruttori
 * 		e metodi. Gli Enums possono avere anche metodi a valore specifico (value-specific methods). L'Enum stesso dichiara questo
 * 		metodo. Può essere astratto, e in questo caso tutti i valori enum devono fornire un'implementazione. Alternativamente può 
 * 		anche essere concreto. In quel caso i valodi enum possono scegliere se voler override l'implementazione di default.
 * 		Esisto quattro tipi di classi innestate. La classe innestata membro richiede un'istanza della classe che la contiene per
 * 		essere usata. Dal suo interno è possibile accedere ai membri PRIVATE della classe outer che la contiene. La classe innestata
 * 		locale sono classi definite all'interno di un metodo. Possono accedere ai membri PRIVATE della classe outer che contiene
 * 		il metodo. La classe innestata locale può inoltre accedere alle variabili locali FINAL e a quelle "effectively final".
 * 		La classe innestata anonima sono un tipo speciale di classe innestat locale che non ha un nome. Le classi innestate anonime
 * 		vengono usate per estendere esattamente una classe per nome o per implementare esattamente una interfaccia. 
 * 		La classe innestata statica può esistere senza un'istanza della classe outer che la contiene.
 * 		Questo capitolo contiene inoltre un ripasso dei modificatori d'accesso, dell'overloading, dell'overriding, delle classi
 * 		astratte, classi statiche, classi final e degli import. Inoltre introduce l'annotazione opzionale "@Override" per
 * 		overridare metodi o per l'implementazione di metodi ereditati da una interfaccia.
 * 
 *    	Exam Essentials:
 *    	- Essere in grado di identificare l'output del codice usando "instanceof". L'operaotre "instanceof" controlla l'operando
 *    	  sulla sinistra è dello stesso tipo della classe o interfaccia (o una sua sotto-classe) dell'operando sulla destra.
 *    	  Se l'operando sulla destra è null, il risultato è FALSE. Se i due operandi non sono nella stessa gerarchia di classi,
 *    	  il codice non compila;
 *    
 *    	- Riconoscere l'implementazione corretta e incorretta di "equals()", "hashCode()", e "toString()".
 *    	  "public boolean equals(Object obj)" ritorna FALSE quando chiamato con null o una classe del tipo sbagliato.
 *    	  "public int hashCode()" ritorna un numero calcolato con tutte o alcune delle delle variabili d'istanza usate in "equals()".
 *    	  "public String toString()" ritorna qualsiasi String;
 *    
 *     	- Essere in grado di creare classi "enum". Gli "enum" hanno una lista di valori. Se quello è tutto quello presente nell'enum,
 *     	  il (;) è opzionale alla fine della lista dei valori. Gli enum possono avere variabili d'istanza, costruttori, e metodi.
 *     	  I costruttori è richiesto che siano PRIVATE o che abbiano il modificatore d'accesso "package private" (quello di default).
 *     	  Ai metodi è permesso esssere a livello top degli enum oppure nei singoli valori degli enum. Se l'enum dichiara un metodo
 *     	  abstract, ogni valore dell'enum dovrà implementarlo;
 *     
 *      - Identificare ed usare le classi annidate. Una classe interna membro è istanziata come "outer.new Inner();" Le classi interne
 *        locali hanno uno scope che arriva fino alla fine del codice del metodo che le contiene e non gli è permesso di avere
 *        memebri non-FINAL STATIC. Alle classi interne anonime è permesso solo di estendere una classe o di implementare un'interfaccia. 
 *        La dichiarazione di una classe interna anonima deve finire con un (;). Le classi annidate STATIC non possono accedere alle
 *        variabili d'istanza della classe che la racchiude;
 *        
 *      - Sapere come usare gli "import" e gli "static import". Le classi possono essere importate per nome oppure con (*). Gli
 *        (*) non guardano nelle sotto-directories. In presenza di un conflitto, l'import per nome ha la precedenza su quello con (*).
 *        L'import statico importa i membri statici di una classe. Sono scritti come "import static" e non come "static import".
 *        Assicurarsi che importino metodi o variabili statiche piuttosto che nomi di classi.
 *        
 *      - Conoscere le regole dell'overloading e overriding dei metodi. Il compilatore Jave permette ai metodi di essere overridden
 *        in sotto-classi se certe regole sono ripsettate: un metodo deve avere la stessa firma, essere almeno accedibile tanto quanto 
 *        il metodo della classe padre, non devono dichiarare nuove "cheked exception" o eccezioni checked più grandi di quelle del 
 *        metodo padre, e per finire usare covarianti per il tipo di ritorno. I metodi sono overloading se hanno lo stesso nome del 
 *        metodo padre ma una lista di argomenti diversa. Un metodo overridden può usare l'annotazione opzionale "@Override".
 */

public class Notes {

}
