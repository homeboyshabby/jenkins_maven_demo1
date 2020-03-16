package com.example.demo.dao;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;

@Repository
public class RegisterDao implements RegisterInterface {
	
	
	@Autowired
    private PlatformTransactionManager platformTransactionManager;
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate getJdbcTemplate;
	@Override
	public Boolean insertData(Details det) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Details> getAllDetails() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public void insertDetailsPkg(Details det) throws Exception {
//        String proc_showMessage = "USER_REG_NEW_PKG.ADD_USER";
//        TransactionStatus status = null;
//        try {
//
//            DefaultTransactionDefinition paramTransactionDefinition = new DefaultTransactionDefinition();
//            status = platformTransactionManager.getTransaction(paramTransactionDefinition);
//            List<StoreProcParameters> sqlInPrametes = new ArrayList<>();
//            StoreProcParameters storeProc = new StoreProcParameters("IN_NAME", det.getName(), OracleTypes.VARCHAR, null);
//            sqlInPrametes.add(storeProc);
//
//            storeProc = new StoreProcParameters("IN_ADDRESS", det.getAddress(), OracleTypes.VARCHAR, null);
//            sqlInPrametes.add(storeProc);
//
//            storeProc = new StoreProcParameters("IN_PAN", det.getPan(), OracleTypes.VARCHAR, null);
//            sqlInPrametes.add(storeProc);
//
//            storeProc = new StoreProcParameters("IN_DOB", det.getDob(), OracleTypes.VARCHAR, null);
//            sqlInPrametes.add(storeProc);
//
//            getJdbcTemplate = new JdbcTemplate();
//            getJdbcTemplate.setDataSource(this.dataSource);
//            if (getJdbcTemplate.getDataSource() == null) {
//                throw new Exception("Data source exception.");
//            }
//
//            ProcedureBuilder proc = new ProcedureBuilder(getJdbcTemplate.getDataSource(), proc_showMessage, sqlInPrametes, null);
//            proc.execute(sqlInPrametes);
//            platformTransactionManager.commit(status);
//        } catch (DataAccessException dae) {
//            platformTransactionManager.rollback(status);
//            throw new Exception(dae.getMessage());
//        } catch (Exception ex) {
//            throw new Exception(ex.getMessage());
//        }
    }

	@Override
    public List<Details> getAllDetailsPkg() throws Exception {
//        String proc_showMessage = "USER_REG_NEW_PKG.GET_USERS";
//        List<Details> message;
//        TransactionStatus status = null;
//        try {
//            DefaultTransactionDefinition paramTransactionDefinition = new DefaultTransactionDefinition();
//            status = platformTransactionManager.getTransaction(paramTransactionDefinition);
//            List<StoreProcParameters> sqlOutPrametesList = new ArrayList<>();
//            StoreProcParameters sqlOutPrametes = new StoreProcParameters("OUT_USERLIST", null, OracleTypes.CURSOR, new Mappper());
//            sqlOutPrametesList.add(sqlOutPrametes);
//            JdbcTemplate getJdbcTemplate = new JdbcTemplate();
//            getJdbcTemplate.setDataSource(this.dataSource);
//            if (getJdbcTemplate.getDataSource() == null) {
//                throw new Exception("Data source exception.");
//            }
//
//            ProcedureBuilder proc = new ProcedureBuilder(getJdbcTemplate.getDataSource(), proc_showMessage, null, sqlOutPrametesList);
//            Map result = proc.execute();
//            message = (List<Details>) result.get("OUT_USERLIST");
//            platformTransactionManager.commit(status);
//        } catch (DataAccessException dae) {
//            platformTransactionManager.rollback(status);
//            throw new Exception(dae.getMessage());
//        } catch (Exception ex) {
//            throw new Exception(ex.getMessage());
//        }
//        return message;
		return null;
    }

	@Override
    public Details getUserById(int id) throws Exception {
//        String proc_showMessage = "USER_REG_NEW_PKG.GET_SINGLE_USER";
//        Details message;
//        TransactionStatus status = null;
//        try {
//            DefaultTransactionDefinition paramTransactionDefinition = new DefaultTransactionDefinition();
//            status = platformTransactionManager.getTransaction(paramTransactionDefinition);
//            List<StoreProcParameters> sqlInPrametes = new ArrayList<>();
//            StoreProcParameters storeProc = new StoreProcParameters("IN_USERID", id, OracleTypes.NUMBER, null);
//            sqlInPrametes.add(storeProc);
//
//            List<StoreProcParameters> sqlOutPrametesList = new ArrayList<>();
//            StoreProcParameters sqlOutPrametes = new StoreProcParameters("OUT_USER", null, OracleTypes.CURSOR, new Mappper());
//            sqlOutPrametesList.add(sqlOutPrametes);
//
//            JdbcTemplate getJdbcTemplate = new JdbcTemplate();
//            getJdbcTemplate.setDataSource(this.dataSource);
//            if (getJdbcTemplate.getDataSource() == null) {
//                throw new Exception("Data source exception.");
//            }
//
//            ProcedureBuilder proc = new ProcedureBuilder(getJdbcTemplate.getDataSource(), proc_showMessage, sqlInPrametes, sqlOutPrametesList);
//            Map result = proc.execute(sqlInPrametes);
//            message = ((List<Details>) result.get("OUT_USER")).get(0);
//            platformTransactionManager.commit(status);
//        } catch (DataAccessException dae) {
//            platformTransactionManager.rollback(status);
//            throw new Exception(dae.getMessage());
//        } catch (Exception ex) {
//            throw new Exception(ex.getMessage());
//        }
//        return message;
		return null;
    }

	@Override
    public void deleteUser(Integer id) throws Exception {
//        String proc_showMessage = "USER_REG_NEW_PKG.DELETE_USER";
//        TransactionStatus status = null;
//        try {
//            DefaultTransactionDefinition paramTransactionDefinition = new DefaultTransactionDefinition();
//            status = platformTransactionManager.getTransaction(paramTransactionDefinition);
//            List<StoreProcParameters> sqlInPrametes = new ArrayList<>();
//            StoreProcParameters storeProc = new StoreProcParameters("IN_USERID", id, OracleTypes.NUMBER, null);
//            sqlInPrametes.add(storeProc);
//
//            JdbcTemplate getJdbcTemplate = new JdbcTemplate();
//            getJdbcTemplate.setDataSource(this.dataSource);
//            if (getJdbcTemplate.getDataSource() == null) {
//                throw new Exception("Data source exception.");
//            }
//
//            ProcedureBuilder proc = new ProcedureBuilder(getJdbcTemplate.getDataSource(), proc_showMessage, sqlInPrametes, null);
//            Map result = proc.execute(sqlInPrametes);
//            platformTransactionManager.commit(status);
//        } catch (DataAccessException dae) {
//            platformTransactionManager.rollback(status);
//            throw new Exception(dae.getMessage());
//        } catch (Exception ex) {
//            throw new Exception(ex.getMessage());
//        }
    }

	  @Override
	    public void updateDetails(Details user) throws Exception {
//	        String proc_showMessage = "USER_REG_NEW_PKG.MODIFY_USER";
//	        TransactionStatus status = null;
//	        try {
//	            DefaultTransactionDefinition paramTransactionDefinition = new DefaultTransactionDefinition();
//	            status = platformTransactionManager.getTransaction(paramTransactionDefinition);
//	            List<StoreProcParameters> sqlInPrametes = new ArrayList<>();
//	            StoreProcParameters storeProc = new StoreProcParameters("IN_USERID", user.getId(), OracleTypes.NUMBER, null);
//	            sqlInPrametes.add(storeProc);
//
//	            storeProc = new StoreProcParameters("IN_NAME", user.getName(), OracleTypes.VARCHAR, null);
//	            sqlInPrametes.add(storeProc);
//	            storeProc = new StoreProcParameters("IN_ADDRESS", user.getAddress(), OracleTypes.VARCHAR, null);
//	            sqlInPrametes.add(storeProc);
//	            storeProc = new StoreProcParameters("IN_PAN", user.getPan(), OracleTypes.VARCHAR, null);
//	            sqlInPrametes.add(storeProc);
//	            storeProc = new StoreProcParameters("IN_DOB", user.getDob(), OracleTypes.VARCHAR, null);
//	            sqlInPrametes.add(storeProc);
//
//	            JdbcTemplate getJdbcTemplate = new JdbcTemplate();
//	            getJdbcTemplate.setDataSource(this.dataSource);
//	            if (getJdbcTemplate.getDataSource() == null) {
//	                throw new Exception("Data source exception.");
//	            }
//
//	            ProcedureBuilder proc = new ProcedureBuilder(getJdbcTemplate.getDataSource(), proc_showMessage, sqlInPrametes, null);
//	            Map result = proc.execute(sqlInPrametes);
//	            platformTransactionManager.commit(status);
//	        } catch (DataAccessException dae) {
//	            platformTransactionManager.rollback(status);
//	            throw new Exception(dae.getMessage());
//	        } catch (Exception ex) {
//	            throw new Exception(ex.getMessage());
//	        }
	    }
}
