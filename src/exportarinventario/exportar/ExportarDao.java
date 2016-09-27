/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exportarinventario.exportar;

import exportarinventario.util.database;

/**
 *
 * @author Jose Felix
 */
public class ExportarDao extends database {
    
    public Object[][] cargarConsulta() {
        Object[][] rs = select("tablas", "campos", "condicion");
        if (rs.length > 0) {
            return rs;
        }
        return null;
    }
    
}
