package persistencia;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import entidade.Aluno;

public class gravarDAO extends ConnectionDAO{ 
	
	public void save(Aluno aluno) throws SQLException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try
		{
			conn = getConnection();
			
				if (aluno.getId() == null)
				{
					stmt = conn.prepareStatement("insert into alunos (matricula, nome, email)
					
					
				}
			
			
		}finally
			{
				
			}
			
		
		
		
	}
	
	
	
	
	
}
