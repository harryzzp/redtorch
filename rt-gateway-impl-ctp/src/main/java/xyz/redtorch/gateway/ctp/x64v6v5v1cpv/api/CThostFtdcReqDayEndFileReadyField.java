/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcReqDayEndFileReadyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqDayEndFileReadyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqDayEndFileReadyField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcReqDayEndFileReadyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_SessionID_get(swigCPtr, this);
  }

  public void setFileBusinessCode(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_FileBusinessCode_set(swigCPtr, this, value);
  }

  public char getFileBusinessCode() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_FileBusinessCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqDayEndFileReadyField_Digest_get(swigCPtr, this);
  }

  public CThostFtdcReqDayEndFileReadyField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcReqDayEndFileReadyField(), true);
  }

}
