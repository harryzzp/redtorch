/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1v.api;

public class CThostFtdcTransferHeaderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferHeaderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferHeaderField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcTransferHeaderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_Version_set(swigCPtr, this, value);
  }

  public String getVersion() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_Version_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_TradeCode_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeSerial(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_TradeSerial_set(swigCPtr, this, value);
  }

  public String getTradeSerial() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_TradeSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_FutureID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_BankBrchID_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_OperNo_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_DeviceID_get(swigCPtr, this);
  }

  public void setRecordNum(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_RecordNum_set(swigCPtr, this, value);
  }

  public String getRecordNum() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_RecordNum_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_SessionID_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcTransferHeaderField_RequestID_get(swigCPtr, this);
  }

  public CThostFtdcTransferHeaderField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcTransferHeaderField(), true);
  }

}
