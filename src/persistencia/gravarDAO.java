package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import control.ServletAluno;
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
					stmt = conn.prepareStatement ("insert into usuarios (nome, email, matricula) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
					
					
				}else
				{
						stmt = conn.prepareStatement("update usuarios set nome = ?, email = ?, matricula = ? where id = ?");
						
				}
				
				stmt.setString(1, aluno.getNome());
				stmt.setString(2, aluno.getEmail());
				stmt.setString(3, aluno.getMatricula());
			
					if (aluno.getId() != null) {
						// Update
						stmt.setLong(5, aluno.getId());
					}
					
				int cout = stmt.executeUpdate();
				
				if (cout == 0)
				{
					throw new SQLException("Erro ao gravar Aluno");
				}

				
			if (aluno.getId() == null)
			{
				Long id = getGeneratedId(stmt);
				
				aluno.setId(id);
				
			}
				
				
		}finally
		{
			if (stmt != null) 
			{
				stmt.close();
				
			}if (conn != null) 
				{
					conn.close();
				}
		}		
	}


	public Aluno createAluno(ResultSet result) throws SQLException
	{
		Aluno aluno = new Aluno();
		
		aluno.setId(result.getLong("id"));
		aluno.setNome(result.getString("nome"));
		aluno.setEmail(result.getString("email"));
		aluno.setMatricula(result.getString("matricula"));
				
		return aluno;
	}
	
	
	
public Aluno getAlunoById(Long id) throws SQLException
{
	Connection conn = null;
	PreparedStatement stmt = null;
	

	try
	{
		conn = getConnection();
		stmt = conn.prepareStatement("select * from usuarios where id = ?");
	
		stmt.setString(1, "%" + name.toLowercase() + "%");
		
	}	
		
		
	}
	
	
	
	
}

	
	
public static Long getGeneratedId(Statement stmt) throws SQLException {
		
		ResultSet rs = stmt.getGeneratedKeys();
		
		if (rs.next()) {
			Long id = rs.getLong(1);
			return id;
		}
		
		return 0L;
	}
	
}
