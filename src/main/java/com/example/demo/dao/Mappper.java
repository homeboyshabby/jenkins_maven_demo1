package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
/**
 *
 * @author LENOVO
 */
public class Mappper implements RowMapper<Object> {
    @Override
    public Details mapRow(ResultSet rs, int rowNum) throws SQLException {
        Details userDto = new Details();
        userDto.setId(rs.getInt("ID"));
        userDto.setName(rs.getString("NAME"));
        userDto.setAddress(rs.getString("ADDRESS"));
        userDto.setPan(rs.getString("PAN"));
        userDto.setDob(rs.getString("DOB"));
        return userDto;
    }
}

