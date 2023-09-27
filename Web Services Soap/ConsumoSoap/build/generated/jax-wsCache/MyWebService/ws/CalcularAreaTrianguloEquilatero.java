
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalcularAreaTrianguloEquilatero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalcularAreaTrianguloEquilatero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcularAreaTrianguloEquilatero", propOrder = {
    "lado"
})
public class CalcularAreaTrianguloEquilatero {

    protected double lado;

    /**
     * Obtiene el valor de la propiedad lado.
     * 
     */
    public double getLado() {
        return lado;
    }

    /**
     * Define el valor de la propiedad lado.
     * 
     */
    public void setLado(double value) {
        this.lado = value;
    }

}
