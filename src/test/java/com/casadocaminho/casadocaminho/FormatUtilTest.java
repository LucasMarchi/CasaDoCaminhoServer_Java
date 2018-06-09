package com.casadocaminho.casadocaminho;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.casadocaminho.utils.FormatUtil;

public class FormatUtilTest {

	@Test
	public void deveFormatarCPF() {
		String documento = "11122233344";
		documento = FormatUtil.formatCPF(documento);
		assertEquals("111.222.333-44", documento);
	}
	
	@Test
	public void deveFormatarCNPJ() {
		String documento = "1122233344455";
		documento = FormatUtil.formatCNPJ(documento);
		assertEquals("11.222.333/444-55", documento);
	}

}
