package br.com.sdconecta.manager.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<Empresa>();
	private static int id = 1;

	static {
		Empresa ifsertao = new Empresa("IF Sertao", 987654321, LocalDate.now());
		ifsertao.setId(id++);

		Empresa sdconecta = new Empresa("SD Conecta", 123456789, LocalDate.now());
		sdconecta.setId(id++);

		empresas.add(ifsertao);
		empresas.add(sdconecta);
	}

	/*
	 * The method will register a company on list
	 * 
	 * @param Empresa
	 */
	public void add(Empresa empresa) {
		empresa.setId(id++);
		Banco.empresas.add(empresa);
	}

	/*
	 * Return the list with all companies registered
	 */
	public List<Empresa> getEmpresas() {
		return Banco.empresas;
	}

	/*
	 * This class will remove a company from list by id passed.
	 * 
	 * @param id
	 */
	public void removeEmpresa(Integer id) {		
		empresas.forEach(empresa -> {
			if (empresa.getId() == id) {
				empresas.remove(empresa);
			}
		});
	}

}
