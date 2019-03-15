import java.util.*;

public class Numero {
        public static void main(String args[]){
		while(true){
			try {
				Thread.sleep(1000);
				Random rand = new Random();
				System.out.printf("%12d", rand.nextInt());
				System.out.println();
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}

}
}
}
