
package weather;

import javax.xml.bind.annotation.XmlAttribute;

public class Clouds {
    private String name;

    public String getName() {
        return name;
    }
    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }
    
}
