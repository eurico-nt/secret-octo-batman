package margulis.pojo;

/**
 * 
 * @author 
 *
 */
public class Empresa {
	
	/**
	 * 
	 */
	private int empid;
	
	/**
	 * 
	 */
	private String nome,responsavel;
	
	/**
	 * 
	 * @param empid
	 * @param nome
	 * @param responsavel
	 */
	public Empresa(int empid, String nome, String responsavel) {
		super();
		this.empid = empid;
		this.nome = nome;
		this.responsavel = responsavel;
	}
	
	/**
	 * 
	 * @param nome
	 * @param responsavel
	 */
	public Empresa(String nome, String responsavel) {
		this(-1, nome,  responsavel);
	}

	/**
	 * 
	 * @return
	 */
	public int getEmpId() {
		return empid;
	}

	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @return
	 */
	public String getResponsavel() {
		return responsavel;
	}
	
	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @param responsavel
	 */
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		return "empresa [empid=" + empid + ", nome=" + nome + ", responsavel="
				+ responsavel + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpId(int empid) {
		this.empid = empid;
	}
	
}
