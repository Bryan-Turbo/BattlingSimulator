package logic;



public class Base {
	public void sleep(double seconds){
		int countI = 0;
		long now = System.nanoTime();
		
		int waitIterations = (int)(seconds * 60);
		double sixtyFPS = (1000000000D / 60D);
		while(countI < waitIterations){
			if(System.nanoTime() - now > sixtyFPS){
				countI++;
				now = System.nanoTime();
			}
		}countI = 0;
	}
}
