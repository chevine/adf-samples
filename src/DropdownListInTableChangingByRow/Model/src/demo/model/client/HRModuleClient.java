package demo.model.client;
import demo.model.common.HRModule;

import oracle.jbo.RowIterator;
import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HRModuleClient extends ApplicationModuleImpl implements HRModule {
  /**This is the default constructor (do not remove)
   */
  public HRModuleClient() {
  }
  public RowIterator lovEmpsForDepartment(Number departmentId) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"lovEmpsForDepartment",new String [] {"oracle.jbo.domain.Number"},new Object[] {departmentId});
    return (RowIterator)_ret;
  }
  public RowIterator lovEmpsForDepartmentReadOnly(Number departmentId) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"lovEmpsForDepartmentReadOnly",new String [] {"oracle.jbo.domain.Number"},new Object[] {departmentId});
    return (RowIterator)_ret;
  }
  public void refreshLovEmps() {
    Object _ret = this.riInvokeExportedMethod(this,"refreshLovEmps",null,null);
    return;
  }
  public void refreshLovEmpsReadOnly() {
    Object _ret = 
      this.riInvokeExportedMethod(this,"refreshLovEmpsReadOnly",null,null);
    return;
  }
}
