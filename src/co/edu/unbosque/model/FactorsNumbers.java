package co.edu.unbosque.model;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class FactorsNumbers {
	
	public FactorsNumbers(){
		
	}
public int function() {
	int mayorone =0;
	int mayortwo=0;
	int fac=0;
	int a=0;
	int b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del array"));
	int[] cadena = new int[b];
	for(int i=0;i<cadena.length;i++) {
		cadena[i]=Integer.parseInt(JOptionPane.showInputDialog("ingreso de numero"));
	}
	Arrays.sort(cadena);
	if(cadena.length<=2) {
		for(int i=0;i<cadena.length;i++) {
			a *= cadena[i];
		}
	}else {
		if((cadena[0]*cadena[1])>(cadena[cadena.length-1]*cadena[cadena.length-2])) {
			a=cadena[0]*cadena[1];
		}else {
			a=cadena[cadena.length-1]*cadena[cadena.length-2];
		}
	}
	
	System.out.println(mayorone);
	return a;
}
}
