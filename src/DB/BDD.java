package DB;

import java.net.Socket;
import java.sql.*;

public class BDD {
	
	 Connection connection;
	 Statement statement;
	 String SQL;	   
	 String url;
	 Socket client;
		  
	public BDD(String url) {    
		  this.url = url;
		   }
   
	public Connection connexionDatabase() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url);
			}
		catch (Exception e) {
			System.err.println(e);
			}
		return connection;
		}
	
	public Connection closeconnexion() {
		try {
            connection.close();
			}
		catch (Exception e) {
			System.err.println(e);
			}
		return connection;
		}
	
	public ResultSet ex�cutionQuery(String sql) {
		connexionDatabase();
		ResultSet resultSet = null;
	    try {
	    	statement = connection.createStatement();
	        resultSet = statement.executeQuery(sql);
	        System.out.println(sql);
	        } 
	    catch (SQLException ex) {
	        System.err.println(ex);
	        }
	    return resultSet;
	    }
	
	public String ex�cutionUpdate(String sql) {
        
		connexionDatabase();
        String result = "";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            result = sql;

        } catch (SQLException ex) {
            result = ex.toString();
        }
        return result;
    }

    public ResultSet querySelectAll(String nomTable) {

        connexionDatabase();
        SQL = "SELECT * FROM " + nomTable;
        return this.ex�cutionQuery(SQL);

    }

    public ResultSet querySelectAll(String nomTable, String �tat) {

        connexionDatabase();
        SQL = "SELECT * FROM " + nomTable + " WHERE " + �tat;
        return this.ex�cutionQuery(SQL);

    }

    public ResultSet querySelect(String[] nomColonne, String nomTable) {

        connexionDatabase();
        int i;
        SQL = "SELECT ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }

        SQL += " FROM " + nomTable;
        return this.ex�cutionQuery(SQL);

    }

    public ResultSet fcSelectCommand(String[] nomColonne, String nomTable, String �tat) {

        connexionDatabase();
        int i;
        SQL = "SELECT ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }

        SQL += " FROM " + nomTable + " WHERE " + �tat;
        return this.ex�cutionQuery(SQL);

    }
    
    public ResultSet fbSelectCommand(String[] nomColonne, String[] nomTable, Object[] �tat) {

        connexionDatabase();
        int i;
        SQL = "SELECT ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL+= "FROM " ;
        for (i = 0; i <= nomTable.length - 1; i++) {
        	SQL += nomTable[i] ;
        	if (i < nomTable.length - 1) {
                SQL += ",";
            }
        }
        SQL+= " WHERE ";
        for (i = 0; i <= �tat.length - 1; i++) {
        	SQL += �tat[i] ;
        	if (i < �tat.length - 1) {
                SQL += " AND ";
            }
        }
        return this.ex�cutionQuery(SQL);

    }
    
    public ResultSet ijSelectCommand(String[] nomColonne, String[] nomTable, Object[] �tat) {

        connexionDatabase();
        int i;
        SQL = "SELECT ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL+= "FROM " + nomTable[0] + " INNER JOIN " + nomTable[1] +" ON "+ �tat[0] + " WHERE " + �tat[1] ;
        return this.ex�cutionQuery(SQL);
    }
    
    public String queryInsert(String nomTable, Object[] contenuTableau) {

        connexionDatabase();
        int i;
        SQL = "INSERT INTO " + nomTable + " VALUES(";

        for (i = 0; i <= contenuTableau.length - 1; i++) {
            SQL += "'" + contenuTableau[i] + "'";
            if (i < contenuTableau.length - 1) {
                SQL += ",";
            }
        }

        SQL += ")";
        return this.ex�cutionUpdate(SQL);

    }

    public String queryInsert(String nomTable, String[] nomColonne, Object[] contenuTableau) {

        connexionDatabase();
        int i;
        SQL = "INSERT INTO " + nomTable + "(";
        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL += ") VALUES(";
        for (i = 0; i <= contenuTableau.length - 1; i++) {
            SQL += "'" + contenuTableau[i] + "'";
            if (i < contenuTableau.length - 1) {
                SQL += ",";
            }
        }

        SQL += ")";
        return this.ex�cutionUpdate(SQL);

    }
    

    public String queryUpdate(String nomTable, String[] nomColonne, Object[] contenuTableau, String �tat) {

        connexionDatabase();
        int i;
        SQL = "UPDATE " + nomTable + " SET ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i] + "='" + contenuTableau[i] + "'";
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }

        SQL += " WHERE " + �tat;
        return this.ex�cutionUpdate(SQL);

    }

    public String queryUpdate(String nomTable, String[] nomColonne, double[] contenuTableau, String �tat) {

        connexionDatabase();
        int i;
        SQL = "UPDATE " + nomTable + " SET ";

        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i] + "='" + contenuTableau[i] + "'";
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }

        SQL += " WHERE " + �tat;
        return this.ex�cutionUpdate(SQL);

    }
    
    public String queryDelete(String nomtable) {

        connexionDatabase();
        SQL = "DELETE FROM " + nomtable;
        return this.ex�cutionUpdate(SQL);

    }

    public String queryDelete(String nomTable, Object �tat) {

        connexionDatabase();
        SQL = "DELETE FROM " + nomTable + " WHERE " + �tat;
        return this.ex�cutionUpdate(SQL);

    }
}
