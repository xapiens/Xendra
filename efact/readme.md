<h1>BETA</h1>
<br>
Factura					https://e-beta.sunat.gob.pe/ol-ti-itcpfegem-beta/billService?wsdl<br>
Retención y Percepción	https://e-beta.sunat.gob.pe/ol-ti-itemision-otroscpe-gem-beta/billService?wsdl<br>
Guia					https://e-beta.sunat.gob.pe/ol-ti-itemision-guia-gem-beta/billService?wsdl<br>
<br>
<h1>PRODUCCION</h1>
<br>
Factura					https://e-factura.sunat.gob.pe/ol-ti-itcpfegem/billService?wsdl<br>
Retención y Percepción	https://e-factura.sunat.gob.pe/ol-ti-itemision-otroscpe-gem/billService?wsdl<br>
Guia					https://e-guiaremision.sunat.gob.pe/ol-ti-itemision-guia-gem/billService?wsdl<br>


<h1>Guia de informacion para la generacion de la factura electronica</h1>

**/Invoice/cac:InvoiceLine/cac:TaxTotal/cac:TaxSubtotal/cac:TaxCategory/cbc:TaxExemptionReasonCode**<br>
*Referencia* : **TaxExemptionReasonCode**<br>
*tabla* **C_Tax** *campo* **TaxID**<br>

**Catálogo No. 01: Código de Tipo de documento cbc:InvoiceTypeCode**<br>
tabla **C_DocumentTax** campo **TaxID**<br>

**Catalogo No. 05 Codigos de tipos de tributos AD_Reference: TaxTypeCode**<br>
Referencia : **TaxTypeCode**<br>
tabla **C_Tax** campo **TaxTypeCode**<br>

**Catalogo No 5 TaxCategory cbc:ID schemeID="UN/ECE 5305" **<br>
Referencia: **ECE_5305**<br>
table **C_Tax** campo **ECE_5305**<br>

**Catalogo No 5 TaxCategory cbc:ID schemeID="UN/ECE 5153" **<br>
Referencia: **ECE_5153**<br>
table **C_Tax** campo **ECE_5153**<br>


**Catalogo No. 08 Codigos de tipos de sistema de calculo del ISC  cbc:TierRange**<br>
Referencia: **Tier Range**<br>
table **AD_OrgInfo** campo **TierRange**<br>

**Catalogo No. 16 Tipo de precio de venta unitario cac:AlternativeConditionPrice/cbc:PriceTypeCode**<br>
Referencia: **PriceTypeCode**<br>
table: **M_Product** campo **PriceTypeCode**<br>


**Catalogo No. 17: Codigos tipo de operacion   sac:AdditionalInformation/sac:SUNATTransaction/cbc:ID**<br>
Referencia : **Additional Information Tax**<br>
tabla **C_Invoice**  campo **AdditionalInformacion**<br>
table **C_Order** 	 campo **AdditionalInformation**<br>

**Catalogo No 51 Codigo de tipo de operacion **<br>
cbc:InvoiceTypeCode @listID (tipo de operacion)<br>
Referencia: **InvoiceOperationTypeCode**<br>
table **C_Order** campo **InvoiceOperationTypeCode**<br>
table **C_Invoice** campo **InvoiceOperationTypeCode**<br>

**//Invoice/cac:InvoiceLine/cac:PricingReference/cac:AlternativeConditionPrice/cbc:PriceTypeCode**<br>
Referencia **PriceTypeCode**<br>
table **M_Product** campo **PriceTypeCode**<br>



