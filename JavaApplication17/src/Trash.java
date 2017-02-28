
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import weather.*;

public class Trash {

    public static void main(String args[]) throws JAXBException, MalformedURLException {
        String url = "http://api.openweathermap.org/data/2.5/weather?id=727011&cnt=10&appid=7330bff2928c454b01b3d2f40a5f2709&units=metric&mode=xml";
        JAXBContext jc = JAXBContext.newInstance(Current.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        URL xml = new URL(url);
        Current currWeather = (Current) unmarshaller.unmarshal(xml);
        System.out.println(currWeather);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(currWeather, System.out);

    }
}
