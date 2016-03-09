import java.sql.Connection;
//Connect
public interface Connect
{
   public Connection getConnection();    
   public void closeConnection();
}