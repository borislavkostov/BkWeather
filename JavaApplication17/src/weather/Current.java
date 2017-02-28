package weather;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Current {

    private City city;
    private Temperature temperature;

    public Current() {
    }
    

    public void setCity(City city) {
        this.city = city;
    }

    @XmlElement
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public City getCity() {
        return city;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return city.getName()+city.getCountry()+temperature.getValue(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
