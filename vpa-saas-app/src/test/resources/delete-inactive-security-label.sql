UPDATE `securitylabel` SET productInstanceId = null where id = 999999999;
delete FROM productinstance   where id=999999999;
delete FROM securitylabel   where id=999999999;
delete FROM securitylabel   where id=999999998;
delete FROM manufacturerproduct   where id=999999999;
delete FROM products   where id=999999999;
delete FROM productfamily   where id=999999999;
delete FROM businessunit   where id=999999999;
delete FROM brand   where id=999999999;
delete FROM tenants   where id=999999999;
delete FROM manufacturersite   where id=999999999;
delete FROM manufacturer   where id=999999999;
