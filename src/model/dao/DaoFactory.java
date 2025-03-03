package model.dao;

import model.dao.imple.SellerDaoImpleJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoImpleJDBC();
    }
}
