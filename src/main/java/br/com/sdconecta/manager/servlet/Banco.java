package br.com.sdconecta.manager.servlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<Empresa>() ;
	
	static {
		Empresa sdconecta = new Empresa("SD Conecta");
		
		Empresa ifsertao = new Empresa("IF Sertao");
		
		empresas.add(ifsertao);
		empresas.add(sdconecta);
	}

	public void add(Empresa empresa) {
			Banco.empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.empresas;
	}
	
}
