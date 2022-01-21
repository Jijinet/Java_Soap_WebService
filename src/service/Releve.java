/**
 * Releve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Releve  implements java.io.Serializable {
    private java.util.Date dateDebut;

    private java.util.Date dateFin;

    private java.util.Date dateReleve;

    private service.Operation[] listOperation;

    private java.lang.String rib;

    private double solde;

    public Releve() {
    }

    public Releve(
           java.util.Date dateDebut,
           java.util.Date dateFin,
           java.util.Date dateReleve,
           service.Operation[] listOperation,
           java.lang.String rib,
           double solde) {
           this.dateDebut = dateDebut;
           this.dateFin = dateFin;
           this.dateReleve = dateReleve;
           this.listOperation = listOperation;
           this.rib = rib;
           this.solde = solde;
    }


    /**
     * Gets the dateDebut value for this Releve.
     * 
     * @return dateDebut
     */
    public java.util.Date getDateDebut() {
        return dateDebut;
    }


    /**
     * Sets the dateDebut value for this Releve.
     * 
     * @param dateDebut
     */
    public void setDateDebut(java.util.Date dateDebut) {
        this.dateDebut = dateDebut;
    }


    /**
     * Gets the dateFin value for this Releve.
     * 
     * @return dateFin
     */
    public java.util.Date getDateFin() {
        return dateFin;
    }


    /**
     * Sets the dateFin value for this Releve.
     * 
     * @param dateFin
     */
    public void setDateFin(java.util.Date dateFin) {
        this.dateFin = dateFin;
    }


    /**
     * Gets the dateReleve value for this Releve.
     * 
     * @return dateReleve
     */
    public java.util.Date getDateReleve() {
        return dateReleve;
    }


    /**
     * Sets the dateReleve value for this Releve.
     * 
     * @param dateReleve
     */
    public void setDateReleve(java.util.Date dateReleve) {
        this.dateReleve = dateReleve;
    }


    /**
     * Gets the listOperation value for this Releve.
     * 
     * @return listOperation
     */
    public service.Operation[] getListOperation() {
        return listOperation;
    }


    /**
     * Sets the listOperation value for this Releve.
     * 
     * @param listOperation
     */
    public void setListOperation(service.Operation[] listOperation) {
        this.listOperation = listOperation;
    }

    public service.Operation getListOperation(int i) {
        return this.listOperation[i];
    }

    public void setListOperation(int i, service.Operation _value) {
        this.listOperation[i] = _value;
    }


    /**
     * Gets the rib value for this Releve.
     * 
     * @return rib
     */
    public java.lang.String getRib() {
        return rib;
    }


    /**
     * Sets the rib value for this Releve.
     * 
     * @param rib
     */
    public void setRib(java.lang.String rib) {
        this.rib = rib;
    }


    /**
     * Gets the solde value for this Releve.
     * 
     * @return solde
     */
    public double getSolde() {
        return solde;
    }


    /**
     * Sets the solde value for this Releve.
     * 
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Releve)) return false;
        Releve other = (Releve) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateDebut==null && other.getDateDebut()==null) || 
             (this.dateDebut!=null &&
              this.dateDebut.equals(other.getDateDebut()))) &&
            ((this.dateFin==null && other.getDateFin()==null) || 
             (this.dateFin!=null &&
              this.dateFin.equals(other.getDateFin()))) &&
            ((this.dateReleve==null && other.getDateReleve()==null) || 
             (this.dateReleve!=null &&
              this.dateReleve.equals(other.getDateReleve()))) &&
            ((this.listOperation==null && other.getListOperation()==null) || 
             (this.listOperation!=null &&
              java.util.Arrays.equals(this.listOperation, other.getListOperation()))) &&
            ((this.rib==null && other.getRib()==null) || 
             (this.rib!=null &&
              this.rib.equals(other.getRib()))) &&
            this.solde == other.getSolde();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDateDebut() != null) {
            _hashCode += getDateDebut().hashCode();
        }
        if (getDateFin() != null) {
            _hashCode += getDateFin().hashCode();
        }
        if (getDateReleve() != null) {
            _hashCode += getDateReleve().hashCode();
        }
        if (getListOperation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOperation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOperation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRib() != null) {
            _hashCode += getRib().hashCode();
        }
        _hashCode += new Double(getSolde()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Releve.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "releve"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDebut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateDebut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateReleve");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateReleve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "operation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rib");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
