package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

   
    @RequestMapping("/reservation")
    public Reservation reservation() {
		//Reservation(  String _reservationNumber, String _location ){
	
	    Reservation res =  new Reservation(
			1,
			"2017/12/12",
			"2017/12/12",
			"LKSJDLKJ",
			"Puerto Vallarta"
			);
		
		return res;
    }
}