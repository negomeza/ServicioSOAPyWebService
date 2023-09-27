
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalcularAreaTrapecio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalcularAreaTrapecio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseMayor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="baseMenor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcularAreaTrapecio", propOrder = {
    "baseMayor",
    "baseMenor",
    "altura"
})
public class CalcularAreaTrapecio {

    protected double baseMayor;
    protected double baseMenor;
    protected double altura;

    /**
     * Obtiene el valor de la propiedad baseMayor.
     * 
     */
    public double getBaseMayor() {
        return baseMayor;
    }

    /**
     * Define el valor de la propiedad baseMayor.
     * 
     */
    public void setBaseMayor(double value) {
        this.baseMayor = value;
    }

    /**
     * Obtiene el valor de la propiedad baseMenor.
     * 
     */
    public double getBaseMenor() {
        return baseMenor;
    }

    /**
     * Define el valor de la propiedad baseMenor.
     * 
     */
    public void setBaseMenor(double value) {
        this.baseMenor = value;
    }

    /**
     * Obtiene el valor de la propiedad altura.
     * 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define el valor de la propiedad altura.
     * 
     */
    public void setAltura(double value) {
        this.altura = value;
    }

}
