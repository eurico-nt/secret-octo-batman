package DAO;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;




public class EmpresaDAO {
	
	public Empresa findEmpresaByNome(String nome) {
		Empresa emp = null;
		String cmd = "select * from xxxx where nome= ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			// abrir conex�o
			Properties props = new Properties();
			props.load(new FileInputStream("xx.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, nome);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				int EmpId = rs.getInt(1);
				String nome = rs.getString(2);
				String responsavel = rs.getString(3);
				emp = new Empresa(EmpId, nome, responsavel);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return emp;
	}

	public void insertEmpresa(Empresa emp) {
		String cmd = "insert into xxxx(EmpId, nome, responsavel) values (?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			// abrir conex�o
			Properties props = new Properties();
			props.load(new FileInputStream("xx.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, emp.getEmpId());
			st.setString(2, emp.getNome());
			st.setString(3, emp.getResponsavel());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir Empresa!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}