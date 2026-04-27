package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class produtoDAO {

	//Create
	public void inserir(Produto p) throws SQLException{
		String sql = "INSERT INTO Produtos(nome, preco, quantidade) VALUES(?, ?, ?)";

		//try com recursos
		try(Connection conn = Conexao.conectar();
			PreparedStatement stmt = conn.prepareStatement(sql)){
				
			stmt.setString(1, p.getNome());
			stmt.setDouble(2, p.getPreco());
			stmt.setInt(3, p.getQuantidade());

			stmt.executeUpdate();
			System.out.println("Produto inserido com SUCESSO");
			
			}
	}
	
	//Read Listar todas as pessoas
	public List<Produto> listar() throws  SQLException{

		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM Produtos";

		try (Connection conn = Conexao.conectar();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
		
			while (rs.next()) {	
				lista.add(new Produto(
						rs.getInt("id"),
						rs.getString("nome"),
						rs.getDouble("preco"),
						rs.getInt("quantidade")
						));
			}
		}
		return lista;
	}

	//Update 
	public void atualizar(Produto p) throws SQLException{	
		String sql = "UPDATE Produtos SET nome = ?, preco = ?, quantidade = ? WHERE id=?";
		
		try(Connection conn = Conexao.conectar();
			PreparedStatement stmt = conn.prepareStatement(sql)){
						
			stmt.setString(1, p.getNome());
			stmt.setDouble(2, p.getPreco());	
			stmt.setInt(3, p.getQuantidade());	
			stmt.setInt(4, p.getId());
			
			stmt.executeUpdate();
			System.out.println("Produto Atualizado!");	
		}
	}

	//Delete
	public void excluir(int id) throws SQLException{	
		String sql = "DELETE FROM Produtos WHERE id=?";
		
		try(Connection conn = Conexao.conectar();
			PreparedStatement stmt = conn.prepareStatement(sql)){
						
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("Produto Excluído!");		
		}
	}
}