package com.example.demo.dao;

import java.util.List;

import com.example.demo.pojos.Details;

public interface RegisterInterface
{
    Boolean insertData(Details det) throws Exception ;
    List<Details> getAllDetails() throws Exception;
    void insertDetailsPkg(Details det) throws Exception;
    List<Details> getAllDetailsPkg() throws Exception;
    Details getUserById(int id) throws Exception;
    void deleteUser(Integer id) throws Exception;
    void updateDetails(Details user) throws Exception;
}

