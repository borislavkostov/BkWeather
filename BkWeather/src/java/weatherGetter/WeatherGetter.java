package weatherGetter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import weather.Current;

public class WeatherGetter {

    public static Current Weather() {
        Current currWeather = null;
        String url = "http://api.openweathermap.org/data/2.5/weather?id=727011&cnt=10&appid=7330bff2928c454b01b3d2f40a5f2709&units=metric&mode=xml";
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(Current.class);

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            URL xml = null;
            try {
                xml = new URL(url);
            } catch (MalformedURLException ex) {
                Logger.getLogger(WeatherGetter.class.getName()).log(Level.SEVERE, null, ex);
            }
            currWeather = (Current) unmarshaller.unmarshal(xml);
        } catch (JAXBException ex) {
            Logger.getLogger(WeatherGetter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return currWeather;
    }
}
