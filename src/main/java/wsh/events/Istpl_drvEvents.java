package wsh.events;

import com4j.*;

/**
 * Events interface for stpl_drv Object
 */
@IID("{623D96DF-CE19-4D52-9CB8-627F65FB1E4E}")
public abstract class Istpl_drvEvents {
  // Methods:
  /**
   * @param knop Mandatory long parameter.
   * @param pressed Mandatory boolean parameter.
   */

  @DISPID(201)
  public void onknopkadawn(
    long knop,
    boolean pressed) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param n_errore Mandatory long parameter.
   * @param text_error Mandatory java.lang.String parameter.
   */

  @DISPID(202)
  public void onerrors(
    long n_errore,
    String text_error) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param acp1 Mandatory long parameter.
   * @param acp2 Mandatory long parameter.
   * @param acp3 Mandatory long parameter.
   * @param acp4 Mandatory long parameter.
   */

  @DISPID(203)
  public void onacp(
    long acp1,
    long acp2,
    long acp3,
    long acp4) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param w Mandatory double parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param ax Mandatory double parameter.
   * @param ay Mandatory double parameter.
   * @param az Mandatory double parameter.
   */

  @DISPID(204)
  public void ondatawxy(
    double w,
    double x,
    double y,
    double ax,
    double ay,
    double az) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param xmin Mandatory long parameter.
   * @param xmax Mandatory long parameter.
   * @param ymin Mandatory long parameter.
   * @param ymax Mandatory long parameter.
   * @param pid Mandatory long parameter.
   * @param serial Mandatory long parameter.
   * @param date Mandatory java.util.Date parameter.
   * @param xparam Mandatory long parameter.
   */

  @DISPID(206)
  public void onsizeplatformi(
    long xmin,
    long xmax,
    long ymin,
    long ymax,
    long pid,
    long serial,
    java.util.Date date,
    long xparam) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(207)
  public void onclose() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(208)
  public void onfound() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(209)
  public void onlost() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param ver Mandatory java.lang.String parameter.
   */

  @DISPID(210)
  public void onversproshivki(
    String ver) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param w Mandatory double parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   */

  @DISPID(211)
  public void ondatawxyfilter(
    double w,
    double x,
    double y) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param successful Mandatory boolean parameter.
   * @param settings_filename Mandatory java.lang.String parameter.
   */

  @DISPID(212)
  public void oncalibrationend(
    boolean successful,
    String settings_filename) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param installed_leng Mandatory java.lang.String parameter.
   * @param available_lang Mandatory java.lang.String parameter.
   */

  @DISPID(213)
  public void onlanguags(
    String installed_leng,
    String available_lang) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
