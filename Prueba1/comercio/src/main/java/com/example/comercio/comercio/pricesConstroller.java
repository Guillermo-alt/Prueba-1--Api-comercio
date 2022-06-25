package com.example.comercio.comercio;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pricesConstroller {
	
	@Autowired PricesRespository pricesRespository;
	
	//Obetiene Valores iniciales
	
	
	//http://localhost:8100/prices
	//http://localhost:8100/h2-console/login.do?jsessionid=de22ec519d6596254ed3c3ff677a0001
	
	@GetMapping("/prices")
	public List<Prices> initialPrices() {
		return pricesRespository.findAll();
		
	}
	
	
	//http://localhost:8100/prices/date/2020-01-20/brad_id/1/brand_prod/35455
	
	@GetMapping("/prices/date/{date}/brad_id/{brad_id}/brand_prod/{id_prod}")
	public  List<Prices> getPrices(@PathVariable Date date, @PathVariable int brad_id,@PathVariable int id_prod) {
		return pricesRespository.findByStartDateAndBrandIdAndProductId(date, brad_id, id_prod);
		
		}

}
