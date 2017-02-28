
package weather;

import javax.xml.bind.annotation.XmlAttribute;


public class Speed {
    private double value;
    private String name;

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }
    @XmlAttribute
    public void setValue(double value) {
        this.value = value;
    }
    
}
