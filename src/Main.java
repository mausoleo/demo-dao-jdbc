import db.DatabaseConfig;
import db.DatabaseConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        String configFilePath = "D:/Java Nelio Alves/JavaPOO/db.properties";
        DatabaseConfig dbConfig = new DatabaseConfig(configFilePath);

        String user = dbConfig.getUser();
        String password = dbConfig.getPassword();
        String dbUrl = dbConfig.getDbUrl();

        DatabaseConnection dbConnection = new DatabaseConnection(dbUrl, user, password);

        Connection connection = dbConnection.getConnection();
        if (connection != null) {
            System.out.println("Conexão estabelecida com sucesso!");
            // Aqui você pode executar consultas ou outras operações no banco de dados
        }

        // Fecha a conexão ao finalizar
        dbConnection.closeConnection();
    }
}
