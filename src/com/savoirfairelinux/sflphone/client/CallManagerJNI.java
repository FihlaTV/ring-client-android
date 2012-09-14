/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.savoirfairelinux.sflphone.client;

public class CallManagerJNI {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CallManagerJNI(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CallManagerJNI obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sflphoneserviceJNI.delete_CallManagerJNI(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void placeCall(String accountID, String callID, String to) {
    sflphoneserviceJNI.CallManagerJNI_placeCall(swigCPtr, this, accountID, callID, to);
  }

  public void refuse(String callID) {
    sflphoneserviceJNI.CallManagerJNI_refuse(swigCPtr, this, callID);
  }

  public void accept(String callID) {
    sflphoneserviceJNI.CallManagerJNI_accept(swigCPtr, this, callID);
  }

  public void hangUp(String callID) {
    sflphoneserviceJNI.CallManagerJNI_hangUp(swigCPtr, this, callID);
  }

  public CallManagerJNI() {
    this(sflphoneserviceJNI.new_CallManagerJNI(), true);
  }

}
