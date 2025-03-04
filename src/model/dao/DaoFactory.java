package model.dao;

import db.DatabaseConnection;
import model.dao.imple.SellerDaoImpleJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoImpleJDBC(DatabaseConnection.getConnection());
    }
}
