/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1v.api;

public class CThostFtdcInstrumentMarginRateULField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentMarginRateULField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentMarginRateULField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v5v1x64apiJNI.delete_CThostFtdcInstrumentMarginRateULField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_reserve1_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcInstrumentMarginRateULField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentMarginRateULField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcInstrumentMarginRateULField(), true);
  }

}
