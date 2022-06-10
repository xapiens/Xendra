
package pe.gob.sunat.service2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStatusCdrResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getStatusCdrResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCdr" type="{http://service.sunat.gob.pe}statusResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatusCdrResponse", propOrder = {
    "statusCdr"
})
public class GetStatusCdrResponse {

    protected StatusResponse statusCdr;

    /**
     * Obtiene el valor de la propiedad statusCdr.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    public StatusResponse getStatusCdr() {
        return statusCdr;
    }

    /**
     * Define el valor de la propiedad statusCdr.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    public void setStatusCdr(StatusResponse value) {
        this.statusCdr = value;
    }

}
