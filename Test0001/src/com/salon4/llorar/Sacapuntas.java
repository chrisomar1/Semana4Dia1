package com.salon4.llorar;

public class Sacapuntas 
{
	private int id;
	private String marca;
	
	public Sacapuntas()
	{
		
	}
	
	public Sacapuntas(int id, String marca)
	{
		setId(id);
		setMarca(marca);
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void probarSacapuntas()
	{
		System.out.println("Afilando lápiz...");
	}
}
