/*************************************************************************************************************
 ** Vantage Point Analytics .  Copyright 2015 - 16  All rights reserved.
 **
 ** No Part of this file should be copied or distributed without the permission of Vantage Point Analytics.
 ** Application : Vantage Point analytics SaaS Authentication Platform
 **
 ** Module      :   VPA-SaaS
 ** File        :   BusinessUserDao.java
 ** Version     :   1.0
 ** Description :   
 **
 ** Author      :   Rajesh Parab 
 ** Created Date :  Tuesday, 05 May 2015
 **************************************************************************************************************
 ** Change History Header:
 **************************************************************************************************************
 ** Date Author     Version Description:
 ** -------- --------   -------- -------------
 **  
 **************************************************************************************************************/
package com.vpa.core.mes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vpa.core.models.BrandOwnerUser;

@Repository
public interface BrandOwnerUserDao extends JpaRepository<BrandOwnerUser, Long> {

    @Query("SELECT u FROM BrandOwnerUser u WHERE userId = ? and  enable = 0")
    BrandOwnerUser findInactiveUser(long userId);

    @Query("SELECT u FROM BrandOwnerUser u WHERE userId = ? and  enable = 1")
	BrandOwnerUser findActiveUser(Long userId);

}
