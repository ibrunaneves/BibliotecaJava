package biblioteca;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    public void inserir(Livro livro) {
        String sql = "INSERT INTO livros (titulo, autor, genero, ano) VALUES (?, ?, ?, ?)";
        try (Connection conexao = Conexao.conectar(); PreparedStatement stmt = conexao.prepareStatement(sql)) {
            if (conexao != null) {
                stmt.setString(1, livro.getTitulo());
                stmt.setString(2, livro.getAutor());
                stmt.setString(3, livro.getGenero());
                stmt.setInt(4, livro.getAno());
                stmt.executeUpdate();
                System.out.println("Livro adicionado com sucesso!");
            } else {
                System.out.println("Erro: Conexão nula.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar o livro: " + e.getMessage());
        }
    }

    public List<Livro> listar() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livros";
        try (Connection conexao = Conexao.conectar(); Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Livro livro = new Livro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("genero"),
                        rs.getInt("ano")
                );
                livros.add(livro);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar os livros: " + e.getMessage());
        }
        return livros;
    }

    public void atualizar(Livro livro) {
        String sql = "UPDATE livros SET titulo = ?, autor = ?, genero = ?, ano = ? WHERE id = ?";
        try (Connection conexao = Conexao.conectar(); PreparedStatement stmt = conexao.prepareStatement(sql)) {
            if (conexao != null) {
                stmt.setString(1, livro.getTitulo());
                stmt.setString(2, livro.getAutor());
                stmt.setString(3, livro.getGenero());
                stmt.setInt(4, livro.getAno());
                stmt.setInt(5, livro.getId());
                stmt.executeUpdate();
                System.out.println("Livro atualizado com sucesso!");
            } else {
                System.out.println("Erro: Conexão nula.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar livro: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM livros WHERE id = ?";
        try (Connection conexao = Conexao.conectar(); PreparedStatement stmt = conexao.prepareStatement(sql)) {
            if (conexao != null) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                System.out.println("Livro excluído com sucesso!");
            } else {
                System.out.println("Erro: Conexão nula.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir o livro: " + e.getMessage());
        }
    }
}
