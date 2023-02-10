package br.com.lucio.bootcampDio.sistemasmarttv;

public class usuario {

	public static void main(String[] args) {
		smartTv SmartTv = new smartTv();
		
		/*System.out.println("TV Ligada ? " + SmartTv.ligada);
		System.out.println("Canal Atual : "+SmartTv.canal);
		System.out.println("Volume Atual : "+SmartTv.volume);*/
		
		SmartTv.ligar();
		System.out.println("TV ligada: " + SmartTv.ligada);
		
		SmartTv.desligar();
		System.out.println("TV ligada: " + SmartTv.ligada);
		}
		
		
	}


