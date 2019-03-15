import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Hora {
        public static void main(String args[]){
		while(true){
			try {
				Thread.sleep(1000);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now));
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}

}
}
}
