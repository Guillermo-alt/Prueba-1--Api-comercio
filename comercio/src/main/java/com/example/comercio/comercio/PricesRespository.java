package com.example.comercio.comercio;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PricesRespository extends JpaRepository<Prices, Long> {
	


	List<Prices>  findByStartDateAndBrandIdAndProductId(Date startDate, int brandId,int productId);
}
