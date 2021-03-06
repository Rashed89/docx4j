/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.pptx4j.pml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CT_TLBuildParagraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TLBuildParagraph">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tmplLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLTemplateList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://schemas.openxmlformats.org/presentationml/2006/main}AG_TLBuild"/>
 *       &lt;attribute name="build" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_TLParaBuildType" default="whole" />
 *       &lt;attribute name="bldLvl" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *       &lt;attribute name="animBg" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="autoUpdateAnimBg" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="rev" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="advAuto" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_TLTime" default="indefinite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TLBuildParagraph", propOrder = {
    "tmplLst"
})
public class CTTLBuildParagraph {

    protected CTTLTemplateList tmplLst;
    @XmlAttribute
    protected STTLParaBuildType build;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedInt")
    protected Long bldLvl;
    @XmlAttribute
    protected Boolean animBg;
    @XmlAttribute
    protected Boolean autoUpdateAnimBg;
    @XmlAttribute
    protected Boolean rev;
    @XmlAttribute
    protected String advAuto;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String spid;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long grpId;
    @XmlAttribute
    protected Boolean uiExpand;

    /**
     * Gets the value of the tmplLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLTemplateList }
     *     
     */
    public CTTLTemplateList getTmplLst() {
        return tmplLst;
    }

    /**
     * Sets the value of the tmplLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLTemplateList }
     *     
     */
    public void setTmplLst(CTTLTemplateList value) {
        this.tmplLst = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link STTLParaBuildType }
     *     
     */
    public STTLParaBuildType getBuild() {
        if (build == null) {
            return STTLParaBuildType.WHOLE;
        } else {
            return build;
        }
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTLParaBuildType }
     *     
     */
    public void setBuild(STTLParaBuildType value) {
        this.build = value;
    }

    /**
     * Gets the value of the bldLvl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getBldLvl() {
        if (bldLvl == null) {
            return  1L;
        } else {
            return bldLvl;
        }
    }

    /**
     * Sets the value of the bldLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBldLvl(Long value) {
        this.bldLvl = value;
    }

    /**
     * Gets the value of the animBg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAnimBg() {
        if (animBg == null) {
            return false;
        } else {
            return animBg;
        }
    }

    /**
     * Sets the value of the animBg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnimBg(Boolean value) {
        this.animBg = value;
    }

    /**
     * Gets the value of the autoUpdateAnimBg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoUpdateAnimBg() {
        if (autoUpdateAnimBg == null) {
            return true;
        } else {
            return autoUpdateAnimBg;
        }
    }

    /**
     * Sets the value of the autoUpdateAnimBg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUpdateAnimBg(Boolean value) {
        this.autoUpdateAnimBg = value;
    }

    /**
     * Gets the value of the rev property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRev() {
        if (rev == null) {
            return false;
        } else {
            return rev;
        }
    }

    /**
     * Sets the value of the rev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRev(Boolean value) {
        this.rev = value;
    }

    /**
     * Gets the value of the advAuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvAuto() {
        if (advAuto == null) {
            return "indefinite";
        } else {
            return advAuto;
        }
    }

    /**
     * Sets the value of the advAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvAuto(String value) {
        this.advAuto = value;
    }

    /**
     * Gets the value of the spid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpid() {
        return spid;
    }

    /**
     * Sets the value of the spid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpid(String value) {
        this.spid = value;
    }

    /**
     * Gets the value of the grpId property.
     * 
     */
    public long getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     */
    public void setGrpId(long value) {
        this.grpId = value;
    }

    /**
     * Gets the value of the uiExpand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUiExpand() {
        if (uiExpand == null) {
            return false;
        } else {
            return uiExpand;
        }
    }

    /**
     * Sets the value of the uiExpand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUiExpand(Boolean value) {
        this.uiExpand = value;
    }

}
