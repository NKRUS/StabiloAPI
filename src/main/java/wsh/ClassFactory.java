package wsh;

 import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * stpl_drv Object
   */
  public static wsh.Istpl_drv createstpl_drv() {
    return COM4J.createInstance( wsh.Istpl_drv.class, "{B48BF56B-46AC-49F8-9F19-59A90149D44F}" );
  }
}
