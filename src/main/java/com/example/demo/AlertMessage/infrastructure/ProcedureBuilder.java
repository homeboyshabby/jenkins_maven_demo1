
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.AlertMessage.infrastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class ProcedureBuilder extends StoredProcedure{
    
    public ProcedureBuilder(
                DataSource datasource,
                String sprocName,
                List<StoreProcParameters> sqlInParam,
                List<StoreProcParameters> sqlOutParam
    )throws Exception 
    {
        super( datasource, sprocName);

        if(sqlInParam != null){
            for(StoreProcParameters spp :sqlInParam){
                declareParameter( new SqlParameter( spp.getParamter(),spp.getDataType()) ); //declaring sql in parameter to pass input  
                System.out.println("InParam "+spp.getParamter()+","+spp.getDataType());
            }

        }
        if(sqlOutParam!=null && !sqlOutParam.isEmpty())
        {
        for(StoreProcParameters spp :sqlOutParam){
            declareParameter( new SqlOutParameter(spp.getParamter(),spp.getDataType(),spp.getInstanceClass() ) ); 

                System.out.println(" OUT Param "+sprocName+","+spp.getParamter()+","+spp.getDataType());

            }
        }
        compile();   
    }
    public Map execute(List<StoreProcParameters> sqlInParam)
    {

        String str = "";
         Map inputs = new HashMap();
         if(sqlInParam != null){
         for(StoreProcParameters spp :sqlInParam){

            inputs.put(spp.getParamter(), spp.getParamterValue()); 
            if(spp.getDataType() ==12)
            str +="'"+spp.getParamterValue()+"',";
            else
                str +=spp.getParamterValue()+",";
            System.out.println("InParam "+spp.getParamter()+" :"+spp.getParamterValue()+", "+spp.getDataType());
         }
         }
         System.out.println(str);
         return super.execute(inputs); 
    }
}