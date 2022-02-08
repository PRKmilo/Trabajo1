package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.FactorsNumbers;

public class Controller {
public Controller() {
	FactorsNumbers num=new FactorsNumbers();
	System.out.println(num.function()+" es el factor mas grande que se consigue de arreglo");
}
}
