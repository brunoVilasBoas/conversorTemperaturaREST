package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Temperatura;
 
@RestController
@RequestMapping("/public")
public class TemperaturaConverterController {
	
	Temperatura temp;
	 
	public TemperaturaConverterController() {
		temp = new Temperatura();
	}
	
	//METODO GET PARA CONVERTER CELSIUS PARA FAHRENHEIT 
	@RequestMapping(value = "/celsius", method = RequestMethod.GET)
	public ResponseEntity<Temperatura> converterCelsiusParaFahrenheit(@RequestParam(defaultValue="", value="celsius") double celsius) {
		temp.setCelsius(celsius);
		temp.setFahrenheit((1.8 * celsius) + 32);  
		return new ResponseEntity<Temperatura>(temp, HttpStatus.OK);
		
	}
	
	
	//METODO GET PARA CONVERTER FAHRENHEIT PARA CELSIUS 
	@RequestMapping(value = "/fahrenheit", method = RequestMethod.GET)
	public ResponseEntity<Temperatura> converterFahrenheitParaCelsius(@RequestParam(defaultValue="", value="fahrenheit") double fahrenheit) {
		temp.setCelsius((fahrenheit - 32) * 5/9);
		temp.setFahrenheit(fahrenheit);  
		return new ResponseEntity<Temperatura>(temp, HttpStatus.OK);
		
	}
	
	
}