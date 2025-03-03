package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection;

    public DatabaseConnection(String dbUrl, String user, String password) {
        try {
            this.connection = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("Conexão com o banco de dados estabelecida!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão com o banco de dados fechada.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão:");
                e.printStackTrace();
            }
        }
    }
}

