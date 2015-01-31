package br.com.tutorial.conexaojdbc.main;

import java.sql.Connection;

import br.com.tutorial.conexaojdbc.connection.ConnectionFactory;

public class Main {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		System.out.println( conn.toString() );
		
	}

}
