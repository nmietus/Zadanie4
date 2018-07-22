package com.javasampleapproach.activemq.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;

public class OdczytPliku {
	
	private String tekst;
	
	public OdczytPliku() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	private File plik;
	public void odczyt() {

		this.plik = new File("exercise-1.xml");
		
		try {
			Scanner scan = new Scanner(plik);
			System.out.println("Plik odczytany");
			
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nie mozna odczytac pliku!");
			e.printStackTrace();
		}
		
		
	}
	
	private String readFile(File file, Charset charset) throws IOException {
	    return new String(Files.readAllBytes(file.toPath()), charset);
	}
	
	public void zapiszTekst() {
		String str=null;
		try {
			str = readFile(plik, Charset.defaultCharset());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setTekst(str);
	}
	
}
