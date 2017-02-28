
package weather;

import javax.xml.bind.annotation.XmlAttribute;


public class Weather {
    private String icon;

    public Weather() {
    }

    public String getIcon() {
        return icon;
    }
    @XmlAttribute
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
}
