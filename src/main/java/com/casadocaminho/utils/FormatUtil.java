package com.casadocaminho.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtil {
	
	public static String formatCPF(String cpf) {
		Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
		Matcher matcher = pattern.matcher(cpf);
		if (matcher.matches()) cpf = matcher.replaceAll("$1.$2.$3-$4");
		return cpf;		
	}
	
	public static String formatCNPJ(String cnpj) {
		Pattern pattern = Pattern.compile("(\\d{2})(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
		Matcher matcher = pattern.matcher(cnpj);
		if (matcher.matches()) cnpj = matcher.replaceAll("$1.$2.$3/$4-$5");
		return cnpj;		
	}

}
