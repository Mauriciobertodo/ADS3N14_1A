package com.senac.exemplo;

import java.util.Random;

public class Aleatorio {
	
	public void geraNumeroRandom(){
	
		Random r = new Random();
		
		int prefixo;
		int sulfixo;
		
		prefixo = r.nextInt(1000);
		sulfixo = r.nextInt(10000);
		
		System.out.print(String.format("\nNumero: %03d - %04d",prefixo,sulfixo));
	}
	
	public void geraNomeRandom(int nCaracteres){
		
		Random r = new Random();
		
		char[] letras = "ABCDEFGHIJKLMNOPQRSTUVWXZ".toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < nCaracteres; i++){
			int ch = r.nextInt(letras.length);
			sb.append(letras[ch]);
		}		
	}
}
