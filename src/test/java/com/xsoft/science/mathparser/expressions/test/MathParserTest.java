package com.xsoft.science.mathparser.expressions.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.xsoft.science.mathparser.MathParser;
import com.xsoft.science.mathparser.MathParserFactory;
import com.xsoft.science.mathparser.parser.calculation.Result;

public class MathParserTest {
	private MathParser mathParser;
	private Result result;

	@Before
	public void init() {
		mathParser = MathParserFactory.create();
	}

	@Test
	public void calculation001() {
		result = mathParser.calculate("4+3");
		Assert.assertEquals(7.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation002() {
		result = mathParser.calculate("5 + ((1 + 2) * 4) - 3");
		Assert.assertEquals(14.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation003() {
		result = mathParser.calculate("6+2*5");
		Assert.assertEquals(16.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation004() {
		result = mathParser.calculate("-8/2-5");
		Assert.assertEquals(-9.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation005() {
		result = mathParser.calculate("5*3+(6+1)");
		Assert.assertEquals(22.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation006() {
		result = mathParser.calculate("-5+7-(5*1)");
		Assert.assertEquals(-3.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation007() {
		result = mathParser.calculate("2-[-(7-2)+1]-4");
		Assert.assertEquals(2.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation008() {
		result = mathParser.calculate("-5*[(-3*2)/(-3)+1]");
		Assert.assertEquals(-15.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation009() {
		result = mathParser.calculate("18+[9-(-3)+5]");
		Assert.assertEquals(35.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation010() {
		result = mathParser.calculate("-[4-(-16)]");
		Assert.assertEquals(-20.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation011() {
		result = mathParser.calculate("3-[4-(5-7)]-{9-[5-(-4)]}");
		Assert.assertEquals(-3.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation012() {
		result = mathParser.calculate("14-(8+7)-[4+2-3-(-4+5)]");
		Assert.assertEquals(-3.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation013() {
		result = mathParser.calculate("15/(-3)");
		Assert.assertEquals(-5.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation014() {
		result = mathParser.calculate("7*(-3)+[2+3(-5)]");
		Assert.assertEquals(-34.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation015() {
		result = mathParser.calculate("8+10/2-4*2");
		Assert.assertEquals(5.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation016() {
		result = mathParser.calculate("29[(-10)+1]");
		Assert.assertEquals(-261.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation017() {
		result = mathParser.calculate("(-12)*7-13(-5)");
		Assert.assertEquals(-19.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation018() {
		result = mathParser.calculate("(4-20)13");
		Assert.assertEquals(-208.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation019() {
		result = mathParser.calculate("(-5)*7-9(-4)");
		Assert.assertEquals(1.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation020() {
		result = mathParser.calculate("(-48+32)-(67-82)");
		Assert.assertEquals(-1.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation021() {
		result = mathParser.calculate("-[-13+(24-68)]-(-48+95)");
		Assert.assertEquals(10.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation022() {
		result = mathParser.calculate("12(-7)-12");
		Assert.assertEquals(-96.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation023() {
		result = mathParser.calculate("48-[15-(43-38)-27]");
		Assert.assertEquals(65.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation024() {
		result = mathParser.calculate("-32-[19-(24-46)]");
		Assert.assertEquals(-73.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation025() {
		result = mathParser.calculate("-(24-89+18)+(-91+24)");
		Assert.assertEquals(-20.0, result.doubleValue(), 0.0);
	}
	
	@Test
	public void calculation026() {
		result = mathParser.calculate("-2^2");
		Assert.assertEquals(-4.0, result.doubleValue(), 0.0);
	}

	

	
}