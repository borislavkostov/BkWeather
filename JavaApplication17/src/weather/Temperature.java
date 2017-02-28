package weather;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

class Temperature {

    private double value;
    private double min;
    private double max;

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
    @XmlAttribute
    public void setMax(double max) {
        this.max = max;
    }
    @XmlAttribute
    public void setMin(double min) {
        this.min = min;
    }

    public Temperature() {
    }
    @XmlAttribute
    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
