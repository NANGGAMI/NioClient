package com.benepia.client;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-app-context.xml"})
public class TestGuideForTdd {
	
	@Autowired
	private ExampleService service;
	
	@Test
	public void test_�÷��������׽�Ʈ(){
		
		ExampleService mockService = Mockito.mock(ExampleService.class);		
		
		when(mockService.plus(1,1)).thenReturn("1�Ϳ��1");
		when(mockService.plus(2,2)).thenReturn("2�Ϳ��2");
		when(mockService.plus(3,3)).thenReturn("3�Ϳ��3");
		when(mockService.plus(4,4)).thenReturn("4�Ϳ��4");
		when(mockService.plus(5,5)).thenReturn("5�Ϳ��5");
		when(mockService.plus(6,6)).thenReturn("������������ �Ϳ��");
		
		assertThat(mockService.plus(1,1), is("1�Ϳ��1") );
		assertThat(mockService.plus(2,2), is("2�Ϳ��2") );
		assertThat(mockService.plus(3,3), is("3�Ϳ��3") );
		assertThat(mockService.plus(4,4), is("4�Ϳ��4") );
		assertThat(mockService.plus(5,5), is("5�Ϳ��5") );
		assertThat(mockService.plus(6,6), is("������������ �Ϳ��") );
	}
	
	@Test
	public void test_�÷���_����_����׽�Ʈ(){
		
		
		assertThat(service.plus(1,1), is("1�Ϳ��1") );
		assertThat(service.plus(2,2), is("2�Ϳ��2") );
		assertThat(service.plus(3,3), is("3�Ϳ��3") );
		assertThat(service.plus(4,4), is("4�Ϳ��4") );
		assertThat(service.plus(5,5), is("5�Ϳ��5") );
		assertThat(service.plus(6,6), is("������������ �Ϳ��") );
	}
}
