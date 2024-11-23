package bai1;

public class Address {
	private String diachi;
	private int soNha;
	/**
	 * 
	 */
	public Address() {
		super();
	}
	/**
	 * @param diachi
	 * @param soNha
	 */
	public Address(String diachi, int soNha) {
		super();
		this.diachi = diachi;
		this.soNha = soNha;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSoNha() {
		return soNha;
	}
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	@Override
	public String toString() {
		return "diachi=" + diachi 
				+ ", soNha=" + soNha ;
	}
	
	

}
