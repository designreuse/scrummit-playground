package com.mitrais.scrummit.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitrais.scrummit.bo.OrganizationBO;
import com.mitrais.scrummit.dao.OrganizationDAO;
import com.mitrais.scrummit.model.Organization;

@Service
public class OrganizationBOImpl extends BaseBOImpl<Organization, OrganizationDAO> implements OrganizationBO {
    
	@Autowired
	OrganizationDAO organizationDAO;
	
	public OrganizationBOImpl() {
        super(true);
    }
    
    @Override
    public Organization getOrganizationByName(String name) {
    	return organizationDAO.getOrganizationByName(name);
    }

}
