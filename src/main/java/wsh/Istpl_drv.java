package wsh;

import com4j.*;

/**
 * Dispatch interface for stpl_drv Object
 */
@IID("{1900D33C-BACF-4073-B10B-7934FA22D428}")
public interface Istpl_drv extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void data_w_x_y();


  /**
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  void data_joystick();


  /**
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  void data_acp();


  /**
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(10)
  void data_zero();


  /**
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(11)
  void data_vers_proshivki();


  /**
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(12)
  void data_size_platformi();


  /**
   * @param n Mandatory int parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(13)
  void filter(
          int n);


  /**
   * @param nonlinear Mandatory boolean parameter.
   * @param checkcalibration Mandatory boolean parameter.
   * @param weightmain Mandatory double parameter.
   * @param weightbetween Mandatory double parameter.
   * @param weightmax Mandatory double parameter.
   * @param lx Mandatory double parameter.
   * @param ly Mandatory double parameter.
   * @param pid Mandatory int parameter.
   * @param date Mandatory java.util.Date parameter.
   * @param serial Mandatory int parameter.
   * @param password Mandatory java.lang.String parameter.
   * @param typeplatform Mandatory int parameter.
   * @param xparam Mandatory int parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  void calibration(
          boolean nonlinear,
          boolean checkcalibration,
          double weightmain,
          double weightbetween,
          double weightmax,
          double lx,
          double ly,
          int pid,
          java.util.Date date,
          int serial,
          String password,
          int typeplatform,
          int xparam);


  /**
   * @param visible Mandatory boolean parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  void visible_tray(
          boolean visible);


  /**
   * @param usbnocom Mandatory boolean parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  void interfaces(
          boolean usbnocom);


  /**
   * @param nomer_leng Mandatory int parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  void languags(
          int nomer_leng);


  /**
   * @param filenamefilename Mandatory java.lang.String parameter.
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  void firmware_update(
          String filenamefilename,
          String password);


  /**
   * @param settings_filename Mandatory java.lang.String parameter.
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  void load_def_calibration_installation(
          String settings_filename,
          String password);


  /**
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(20)
  void read_settings_platform();


  /**
   * @param typecalibration Mandatory int parameter.
   * @param ncom Mandatory int parameter.
   * @param nonlinear Mandatory boolean parameter.
   * @param checkcalibration Mandatory boolean parameter.
   * @param weightmain Mandatory double parameter.
   * @param weightbetween Mandatory double parameter.
   * @param weightmax Mandatory double parameter.
   * @param w1 Mandatory double parameter.
   * @param w2 Mandatory double parameter.
   * @param w3 Mandatory double parameter.
   * @param w4 Mandatory double parameter.
   * @param lx1 Mandatory double parameter.
   * @param ly1 Mandatory double parameter.
   * @param lx2 Mandatory double parameter.
   * @param ly2 Mandatory double parameter.
   * @param lx3 Mandatory double parameter.
   * @param ly3 Mandatory double parameter.
   * @param lx4 Mandatory double parameter.
   * @param ly4 Mandatory double parameter.
   * @param pid Mandatory int parameter.
   * @param date Mandatory java.util.Date parameter.
   * @param serial Mandatory int parameter.
   * @param password Mandatory java.lang.String parameter.
   * @param typeplatform Mandatory int parameter.
   * @param xparam Mandatory int parameter.
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(21)
  void calibrationexact(
          int typecalibration,
          int ncom,
          boolean nonlinear,
          boolean checkcalibration,
          double weightmain,
          double weightbetween,
          double weightmax,
          double w1,
          double w2,
          double w3,
          double w4,
          double lx1,
          double ly1,
          double lx2,
          double ly2,
          double lx3,
          double ly3,
          double lx4,
          double ly4,
          int pid,
          java.util.Date date,
          int serial,
          String password,
          int typeplatform,
          int xparam);


  /**
   * <p>
   * Getter method for the COM property "data_Read_flash"
   * </p>
   * @param address Mandatory int parameter.
   * @param size Mandatory int parameter.
   * @param data Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(22)
  boolean data_Read_flash(
          int address,
          int size,
          Holder<String> data);


  /**
   * <p>
   * Getter method for the COM property "data_Read_file_flash"
   * </p>
   * @param file_data Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(23)
  int data_Read_file_flash(
          Holder<String> file_data);


  /**
   * <p>
   * Getter method for the COM property "data_Write_flash"
   * </p>
   * @param address Mandatory int parameter.
   * @param str_ Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(24)
  boolean data_Write_flash(
          int address,
          String str_);


  /**
   * <p>
   * Getter method for the COM property "data_Write_file_flash"
   * </p>
   * @param file_data Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(25)
  int data_Write_file_flash(
          String file_data);


  // Properties:
}
