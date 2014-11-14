package com.senac.apps.BuscaBinaria.controller;

public class BuscaBinariaController {
	
	public void buscar(){
		
		int esq = 0;  
		int[] array = null;
		int dir = array.length - 1;  
		int valorMeio;  
				  
		while ( esq <= dir ) {  
	        valorMeio = esq + ((dir - esq) / 2);  
	        int valor = 0;
			if ( array[valorMeio] < valor ) { // Você precisa conseguir comparar assim seus objetos  
	        esq = valorMeio + 1;  
	        }
	        else if( array[valorMeio] > valor ) { //E Aqui  
	                dir = valorMeio - 1;  
	        }
	        else {  
	                //return valorMeio;  
	        }  
		}  
		//return -1;		
	}
}
