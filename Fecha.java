import java.util.*;

public class Fecha {
        public static void main(String args[]){
		while(true){
			try {
				Thread.sleep(1000);
				System.out.println(java.time.LocalDate.now());
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}

}
}
}
