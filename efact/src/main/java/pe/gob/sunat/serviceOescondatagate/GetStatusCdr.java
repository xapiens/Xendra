
package pe.gob.sunat.serviceOescondatagate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStatusCdr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getStatusCdr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rucComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatusCdr", propOrder = {
    "rucComprobante",
    "tipoComprobante",
    "serieComprobante",
    "numeroComprobante"
})
public class GetStatusCdr {

    protected String rucComprobante;
    protected String tipoComprobante;
    protected String serieComprobante;
    protected String numeroComprobante;

    /**
     * Obtiene el valor de la propiedad rucComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucComprobante() {
        return rucComprobante;
    }

    /**
     * Define el valor de la propiedad rucComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucComprobante(String value) {
        this.rucComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Define el valor de la propiedad tipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComprobante(String value) {
        this.tipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad serieComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieComprobante() {
        return serieComprobante;
    }

    /**
     * Define el valor de la propiedad serieComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieComprobante(String value) {
        this.serieComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    /**
     * Define el valor de la propiedad numeroComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroComprobante(String value) {
        this.numeroComprobante = value;
    }

}
