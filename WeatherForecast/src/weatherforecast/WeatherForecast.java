/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherforecast;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

/**
 *
 * @author Seun
 */
public class WeatherForecast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        
        weatherforecast.WeatherForecast service = new weatherforecast.WeatherForecast();
        
        QName portQName = new QName("http://www.webservicex.net" , "WeatherForecastSoap");
        String req = "<GetWeatherByZipCode  xmlns=\"http://www.webservicex.net\"><zipCode>ENTER VALUE</zipCode></GetWeatherByZipCode>";
        
        try { // Call Web Service Operation
            
            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        

        

    }

}
