package br.com.lucio.bootcampDio.sistemasmarttv;

public class smartTv {
	 boolean ligada = false;
	 int canal = 1;
	 int volume = 25;
	 
	 public void ligar() {
		 ligada = !ligada;
	 }
	 
	 public void desligar() {
		 ligada = false;
	 }
	 
	 public void aumentarVolume() {
		 volume++;
	 }
	 
	 public void diminuirVolume() {
		 volume--;
	 }
}
