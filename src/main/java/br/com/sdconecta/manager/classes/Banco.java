package br.com.sdconecta.manager.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<Empresa>() ;
	private static int id= 1;
	
	static {

		Empresa ifsertao = new Empresa(id++, "IF Sertao" , 987654321 , LocalDate.now() );
		Empresa sdconecta = new Empresa(id++, "SD Conecta", 123456789 , LocalDate.now()) ;
	
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
