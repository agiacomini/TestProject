package com.giacomini.andrea.OCA.BuildingBlocks.UnderstandingPackageDeclarationAndImports;

//OPZIONE 1
import java.nio.file.*;

//OPZIONE 2
import java.nio.file.Files;
import java.nio.file.Path;

//import NON CONSENTITI
//import java.nio.*;            - Non ci sono classi da importare al path "java.nio"; 
//import java.nio.*.*;          - E' possibile avere un solo asterisco (* - Wildcards); 
//import java.nio.files.Paths;  - Non è possibile importare metodi ma solo nomi di classi;

/*
 * N.B: Due classi posso avere lo stesso nome purchè siano in due package diversi.
 * 		Si avrà però un conflitto di nomi quando queste due classi (con lo stesso nome) verranno importate allo stesso momento.
 * 		Se c'è la necessità di averle entrambe, una delle due dovrà essere usata specificando per intero il suo package.
 * 		L'import tramite specificazione della classe avrà la precedenza sull'import con l'asterisco (wildcard).
 */
import java.util.Date;
//import java.sql.Date;

public class Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date;
		java.sql.Date sqlDate;

	}

}
